package com.cristianml.jpaprueba;
import com.cristianml.jpaprueba.logica.Alumno;
import com.cristianml.jpaprueba.logica.Carrera;
import com.cristianml.jpaprueba.logica.ControladoraLogica;
import com.cristianml.jpaprueba.logica.Materia;
import com.cristianml.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Jpaprueba {
    public static void main(String[] args) {
        
        // JPA = JAVA PERSISTENCE API, is an intermediary that allows us to 
        // communicate our application with database by mapping through java annotations in parts of our project
        // to convert classes into entities, variables into attributes, etc.
        // We must to add the dependency mysql on pom.xml or add with right clic on Dependencies
        // we connect database in Services -> clic derecho en databases
        // -> new connection -> add mysql (si no lo tenemos) -> usuarios -> asus -> .m2 
        // -> repositories -> mysql -> ..... -> ...... -> cambiamos esto: zeroDateTimeBehavior=CONVERT_TO_NULL
        // -> por esto: serverTimezone=UTC
        // Luego agregamos la base de datos dando clic derecho en databases seleccionando mysql
        // agregamos los valores del servidor y escribimos el nombre de la bd
        // luego creamos la unidad de persistencia en nuestro proyecto, dentro de la capa
        // persistencia clic izquierdo -> new -> others -> persistence -> percistence unit
        // -> cambiamos nombre implementando al final "PU", seleccionamos nuestra conexión
        // creada anteriormente y seleccionamos "create".
        
        // ¿Qué es ORM?
        // Mapeo Objeto-Realacional, es una técnica que nos permite convertir clases
        // (y sus relaciones) de un sistema creado con POO al modelado de una bd relacional.
        // El mapeo lo hacemos mediante annotations de java, los mas usados son:
        // @Entity: Especifica la creación de una entidad. Se coloca al inicio de la 
        // definición de una clase.
        // @Id: Primary Key de la entidad
            // @GeneratedValue(strategy=GenerationType.SEQUENCE): Establece que la id
            // Se va a generar de forma automática y secuencial.
        // @Basic: Para hacer referencia a atributos comúnes.
        // @Temporal: Se usa normalmente en fechas.
            // Si se quiere tomar en cuenta la hora se utiliza: 
            // @Temporal(TemporalType.TIMESTAMP)
            // Si sólo se quiere en cuenta la fecha(DATE):
            // @Temporal(TemporalType.DATE)
        // @OneToMany: Indicar una relación unidireccional de 1 a N.
        // @OneToOne: Indicar relación 1 a 1.
        // @ManyToMany: Indicar relación N a N.
        
        
        // Luego creamos el controller, el cual nos creará las tablas en nuestra bd
        // para que después podamos manipularla, seguimos los stgs pasos:
        // right clic en nuestro paquete persistencia -> new -> other -> persistence
        // -> jpa controler from entity classes -> seleccionamos nuestras clases -> next
        // -> seleccionamos nuestro paquete persistencia -> finish.
        // Se nos creará una clase con métodos para manipular nuestros datos.
        // En esa clase creamos un constructor que llama al primer constructor,
        // nos permitirá instanciar nuestro objeto, creamos el constructor:
        // public nombreDeNuestraClaseController(){
        // emf = Percistence.createEntityManagerFactory("nombreNuestraUnidadPersistencia")}
        
        // Luego podríamos crear una clase llamada ControladoraPersistencia, para que estén
        // todas las instancias.
        // la creamos como una clase normal y creamos nuestras instancias de las clases que
        // están siendo mapeadas con el ORM.
        
        // Al final para crear las tablas, instanciamos nuestra controladora en el método main
        // o depende de dónde vamos a recibir los datos, puede ser de la interface Gráfica
        
        // Para eso creamos una clase controladora en la capa de lógica(model), para que
        // pueda recibir un objeto(datos) y pueda vincular con la JPAcontroller y así mismo
        // comunicarse con la base de datos.
        // en la clase Controladora creada agregamos la instancia de la ControladoraPersistencia
        // las cuales ambas tendrán un método de agregar, un alta en la bd(obvio tendrán más métodos)
        // como altas, bajas, modificación y lectura.
           
        // Creamos la instancia de la controladora lógica
        
        // ControladoraLogica control = new ControladoraLogica();
        /*Alumno alu = new Alumno(13, "Maribel", "Huanca", new Date());
        control.crearAlumno(alu);*/
        
        // Eliminando un alumno
        // control.eliminarAlumno(13);
        
        // Modificar un Alumno
         /*alu.setApellido("Garrido");
         control.editarAlumno(alu);*/
        
        // Método find para buscar y traer un alumno de la bd
        /*
        System.out.println("------------------------find------------------------");
        System.out.println("El alumno buscado: " + control.traerAlumno(10));
        System.out.println();
        // Método findEntities para traer la lista completa de la entidad de bd
        System.out.println("------------------------findEntities------------------------");
        ArrayList<Alumno> lista = control.traerListaAlumnos();
        for(Alumno alu : lista) {
            System.out.println("Alumno: " + alu);
        }
        */
        
        // Hacemos ejemplo desde un inicio pero ya con la relación OneToOne y OneToMany
        // Instanciamos nuestra ControladoraLogica
        ControladoraLogica control = new ControladoraLogica();
        
        // Creamos 1ro la lista vacía para que se puedan asociar ambas tablas OneToMany en la bd
        LinkedList<Materia> listaMaterias = new LinkedList<>();
        // creamos la carrera antes de la materia porque las materias necesitan asociarse después
        // a la tabla Carrera
        Carrera carrera1 = new Carrera(10, "Ing. Informática", listaMaterias);
        control.crearCarrera(carrera1); // Agregamos a la base de datos
        
        // Creamos materias asociando la carrera
        Materia mate1 = new Materia(10, "Prgramación I", "Trimestral", carrera1);
        Materia mate2 = new Materia(11, "Matemáticas para la informática", "Trimestral", carrera1);
        Materia mate3 = new Materia(12, "Sistemas Operativos", "Trimestral", carrera1);
        // Guardamos a la bd
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        // Agregamos la lista de materias a la clase Carrera
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        // Agregamos la lista de Materias a la clase carrera 
        carrera1.setListaMaterias(listaMaterias);
        
        // editamos la entidad Carrera para agregar la lista de materias en la bd
        control.editarCarrera(carrera1);
      
        // Creamos un alumno asociando la carrera y agregando a la db
        Alumno alu = new Alumno(10, "Cristian", "Montaño", new Date(), carrera1);
        control.crearAlumno(alu);
        
        // Buscamos y mostramos al alumno
        System.out.println("-----------------------DATOS DEL ALUMNO--------------------------");
        Alumno alumno = control.traerAlumno(10);
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Cursa la carrera: " + alumno.getCarre().getNombre());
    }
}
