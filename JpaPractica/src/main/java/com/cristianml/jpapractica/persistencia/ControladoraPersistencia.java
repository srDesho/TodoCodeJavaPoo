
package com.cristianml.jpapractica.persistencia;

import com.cristianml.jpapractica.logica.Alumno;
import com.cristianml.jpapractica.logica.Carrera;
import com.cristianml.jpapractica.logica.Materia;
import com.cristianml.jpapractica.persistencia.exceptions.NonexistentEntityException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();

    // Materia
    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<Materia> traerListaMateria() {
        List<Materia> lista = mateJpa.findMateriaEntities();
        LinkedList<Materia> listaMateria = new LinkedList<>(lista);
        return listaMateria;
    }
    
    // Carrera

    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public LinkedList<Carrera> traerListaCarrera() {
        List<Carrera> lista = carreJpa.findCarreraEntities();
        LinkedList<Carrera> listaCarrera = new LinkedList<>(lista);
        return listaCarrera;
    }
    
    // Alumno

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public LinkedList<Alumno> traerListaAlumno() {
        List<Alumno> lista = aluJpa.findAlumnoEntities();
        LinkedList<Alumno> listaAlumno = new LinkedList<>(lista);
        return listaAlumno;
    }
    
}  
