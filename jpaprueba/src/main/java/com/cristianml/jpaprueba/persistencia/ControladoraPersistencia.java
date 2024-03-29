package com.cristianml.jpaprueba.persistencia;

import com.cristianml.jpaprueba.logica.Alumno;
import com.cristianml.jpaprueba.logica.Carrera;
import com.cristianml.jpaprueba.logica.Materia;
import com.cristianml.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    CarreraJpaController carreJPA = new CarreraJpaController();
    MateriaJpaController materiaJPA = new MateriaJpaController();

    // ======================== Alumno ========================
    public void crearAlumno(Alumno alu) {
        alumnoJPA.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarAlumno(Alumno alu) {
        try {
            alumnoJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alumnoJPA.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        // Obtenemos la lista de la bd.
        List<Alumno> listita = alumnoJPA.findAlumnoEntities();
        // Convertimos la lista en un arraylist
        ArrayList<Alumno> lista = new ArrayList<>(listita);
        return lista;
    }
    
    // ======================== Carrera ========================

    public void crearCarrera(Carrera carre) {
        carreJPA.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJPA.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJPA.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carreJPA.findCarreraEntities();
        ArrayList<Carrera> carreras = new ArrayList<>(lista);
        return carreras;
    }
    
    // ======================== Materia ========================

    public void crarMateria(Materia materia) {
        materiaJPA.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            materiaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            materiaJPA.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return materiaJPA.findMateria(id);
    }

    public LinkedList<Materia> traerListaMateria() {
        List<Materia> lista = materiaJPA.findMateriaEntities();
        LinkedList<Materia> listaMaterias = new LinkedList<>(lista);
        return  listaMaterias;
    }
}
