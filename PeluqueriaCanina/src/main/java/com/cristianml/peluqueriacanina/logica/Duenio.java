
package com.cristianml.peluqueriacanina.logica;


public class Duenio {
 private int id;
    private String nombre;
    private String celular;
    private String direccion;

    public Duenio() {
    }

    public Duenio(int id, String nombre, String celular, String direccion) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
