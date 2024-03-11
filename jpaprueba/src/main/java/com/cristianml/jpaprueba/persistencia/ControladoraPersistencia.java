package com.cristianml.jpaprueba.persistencia;

import com.cristianml.jpaprueba.logica.Alumno;
import com.cristianml.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();

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
}
