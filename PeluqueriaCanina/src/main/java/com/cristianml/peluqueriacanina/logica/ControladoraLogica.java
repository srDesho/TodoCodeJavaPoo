package com.cristianml.peluqueriacanina.logica;

import com.cristianml.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String alergico
                , String atencioEsp, String obs, String nombreDuenio, String celDuenio){
        // Creamos los objetos
        // Dueño
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celDuenio);
        
        // Masconta
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencio_especial(atencioEsp);
        masco.setObservaciones(obs);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }
    
}
