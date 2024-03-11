package com.cristianml.jpaprueba.logica;

import com.cristianml.jpaprueba.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno (int id) {
        controlPersis.eliminarAlumno(id);
    }
}
