package com.cristianml.RelacionesClases;

import java.util.List;

public class Auto {
    private long id;
    private String marca;
    private String modelo;

    // Si queremos agregar una asociación de 1 a 1(1 auto puede tener un solo propietario), debo crear un
    // objeto de tipo Propietario (lo creo en esta clase Auro y no en clase Propietario porque me conviene más
    // que el propietario sepa cuál es su auto) y luego de crear lo agregamos al constructor y getter y setter.

    // private Propietario prop;

    // Se tenemos una asociación de 1 a N(1 auto puede tener muchos propietarios), debo crear una Collection
    // de objetos de tipo Propietario(lo creo aquí de lado de Auto porque cada propietario va a tener la
    // relación del mismo auto, o sea Auto va a tener relacionado muchos propietarios).

    private List<Propietario> listaPropietarios;

    public Auto() {
    }

    public Auto(long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                '}';
    }
}
