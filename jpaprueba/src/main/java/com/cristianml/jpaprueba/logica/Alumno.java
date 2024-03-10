package com.cristianml.jpaprueba.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic // No es necesario ponerlo cuando se sabe que son atributos simples
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
