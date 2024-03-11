package com.cristianml.jpaprueba.persistencia;

import com.cristianml.jpaprueba.logica.Alumno;
import com.cristianml.jpaprueba.persistencia.exceptions.NonexistentEntityException;
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
}
