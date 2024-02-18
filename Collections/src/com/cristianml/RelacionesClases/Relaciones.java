package com.cristianml.RelacionesClases;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        // Cómo acceder a una lista de propietarios
        Auto auto = new Auto();
        auto.setId(1L);
        auto.setMarca("Toyota");
        auto.setModelo("Prado");

        // Creamos los propietarios
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();

        prop1.setId(1L);
        prop1.setNombre("Cristian");
        prop1.setApellido("Montaño");

        prop2.setId(2L);
        prop2.setNombre("Daniel");
        prop2.setApellido("Montaño");

        prop3.setId(3L);
        prop3.setNombre("Victor");
        prop3.setApellido("Montaño");

        // Agregamos a la lista de propietarios
        List<Propietario> listaDePropietarios = new ArrayList<Propietario>();
        listaDePropietarios.add(prop1);
        listaDePropietarios.add(prop2);
        listaDePropietarios.add(prop3);

        auto.setListaPropietarios(listaDePropietarios);
        System.out.println("El auto " + auto.getMarca() + " " + auto.getModelo() +
                " tiene como propietarios a " + auto.getListaPropietarios().toString());
    }
}
