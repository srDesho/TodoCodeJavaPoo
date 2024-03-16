package com.cristianml.peluqueriacanina.persistencia;

import com.cristianml.peluqueriacanina.logica.Duenio;
import com.cristianml.peluqueriacanina.logica.Mascota;
import java.util.ArrayList;
import java.util.List;

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
}
