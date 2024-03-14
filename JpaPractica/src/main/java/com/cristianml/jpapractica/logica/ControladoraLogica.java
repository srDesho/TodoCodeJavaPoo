
package com.cristianml.jpapractica.logica;

import com.cristianml.jpapractica.persistencia.ControladoraPersistencia;
import java.util.LinkedList;


public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Materia
    public void crearMateria(Materia mate) {
        controlPersis.crearMateria(mate);
    }
    
    public void editarMateria(Materia mate) {
        controlPersis.editarMateria(mate);
    }
    
    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }
    
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }
    
    public LinkedList<Materia> traerListaMateria() {
        return controlPersis.traerListaMateria();
    }
    
    // Carrera
    
    public void crearCarrera(Carrera carre) {
        controlPersis.crearCarrera(carre);
    }
    
    public void editarCarrera(Carrera carre) {
        controlPersis.editarCarrera(carre);
    }
    
    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }
    
    public LinkedList<Carrera> traerListaCarrera() {
        return controlPersis.traerListaCarrera();
    }
    
    // Alumno
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }
    
    public LinkedList<Alumno> traerListaAlumno() {
        return controlPersis.traerListaAlumno();
    }
    
}
