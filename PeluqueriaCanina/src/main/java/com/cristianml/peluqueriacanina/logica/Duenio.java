
package com.cristianml.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String celular;

    public Duenio() {
    }

    public Duenio(int id, String nombre, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
