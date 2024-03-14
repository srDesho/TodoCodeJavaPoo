package com.cristianml.jpapractica;

import com.cristianml.jpapractica.logica.Alumno;
import com.cristianml.jpapractica.logica.Carrera;
import com.cristianml.jpapractica.logica.ControladoraLogica;
import com.cristianml.jpapractica.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class JpaPractica {

    public static void main(String[] args) {
        // En este proyecto no irá nada de concepto no más comentarios ya que es una práctica del proyecto jpaprueba
        
        ControladoraLogica control = new ControladoraLogica();
        
        LinkedList<Materia> listaMaterias = new LinkedList<>();
        
        Carrera carre = new Carrera(1, "Ing. Informática", listaMaterias);
        control.crearCarrera(carre);
        
        Materia mate1 = new Materia(10, "Programación I", "Trimestral", carre);
        Materia mate2 = new Materia(10, "Matemáticas para la Informática", "Trimestral", carre);
        Materia mate3 = new Materia(10, "Multimedia", "Trimestral", carre);
        Materia mate4 = new Materia(10, "Sistemas Operativos", "Trimestral", carre);
        
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        listaMaterias.add(mate4);
        
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        control.crearMateria(mate4);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        Alumno alu = new Alumno(1, "Cristian", "Montaño", new Date(), carre);
        control.crearAlumno(alu);
        
        System.out.println("Traer Alumno: " + control.traerAlumno(1));
        
        System.out.println("Lista de Materias");
        LinkedList<Materia> listaMateriasBd = control.traerListaMateria();
        for (Materia materia : listaMateriasBd) {
            System.out.println("materia: " + materia);
        }
    }
}
