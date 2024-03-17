package com.cristianml.peluqueriacanina.persistencia;

import com.cristianml.peluqueriacanina.logica.Duenio;
import com.cristianml.peluqueriacanina.logica.Mascota;
import com.cristianml.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    MascotaJpaController mascoJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        duenioJpa.create(duenio);
        mascoJpa.create(masco);
    }
    
    public List<Mascota> traerListaMascota() {
    
        return mascoJpa.findMascotaEntities();
    }

    public void eliminarMascota(int idMasco) {
        try {
            // Obtenemos la mascota y el id del duenio
            Mascota masco = traerMascota(idMasco);
            mascoJpa.destroy(idMasco); // Eliminamos al duenio de la db
            // Eliminamos a la mascota de la base de datos
            duenioJpa.destroy(masco.getUnDuenio().getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Mascota traerMascota(int id) {
        return mascoJpa.findMascota(id);
    }
}
