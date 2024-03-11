package com.cristianml.jpaprueba.persistencia;

import com.cristianml.jpaprueba.logica.Alumno;


public class ControladoraPersistencia {
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        alumnoJPA.create(alu);
    }
}
