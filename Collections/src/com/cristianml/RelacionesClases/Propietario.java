package com.cristianml.RelacionesClases;

import java.util.List;

public class Propietario {
    private long id;
    private String nombre;
    private String apellido;

    // Si queremos agregar una asociación de 1 a 1(1 auto puede tener un solo propietario), debo crear un
    // objeto de tipo Propietario (lo creo en esta clase Auro y no en clase Propietario porque me conviene más
    // que el propietario sepa cuál es su auto) y luego de crear lo agregamos al constructor y getter y setter.

    // private Propietario prop;

    // Se tenemos una asociación de 1 a N(1 auto puede tener muchos propietarios), debo crear una Collection
    // de objetos de tipo Propietario(lo creo aquí de lado de Auto porque cada propietario va a tener la
    // relación del mismo auto, o sea Auto va a tener relacionado muchos propietarios).

    private List<Propietario> listaPropietarios;
    public Propietario(){}
    public Propietario(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                '}';
    }
}
