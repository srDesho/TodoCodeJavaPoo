package cristian.ml.Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    // Creamos los constructores que son los que nos sirven para instanciar nuestra clase con o sin parametros
    public Alumno() {}
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre() {
        System.out.println("Hola éste es mi nombre.");
    }
}
