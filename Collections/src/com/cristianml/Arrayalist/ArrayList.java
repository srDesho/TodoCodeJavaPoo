package com.cristianml.Arrayalist;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // Las collecciones son como las matrices y vectores pero de una forma dinámina
        // Existen muchos tipos de colecciones, entre ellas estan los LIST, QUEUES, SET, MAP
        // Pueden variar su tamaño en cualquier momento
        // almacenan datos en un orden específico.
        // Los ArrayList trabajan con el tipo FIFO(First In First Out).

        // Creamos nuestra Arraylist que va a almacenar Personas, o sea es una lista(matriz) de objetos
        List<Persona> listaPersonas = new java.util.ArrayList<Persona>();
        // Con add agregamos elementos a nuestra lista
        listaPersonas.add(new Persona(1, "Cristian", 25));
        listaPersonas.add(new Persona(2, "Daniel", 22));
        listaPersonas.add(new Persona(3, "Maribel", 29));
        // Iteramos la lista ArrayList con For, se itera por la posición de índice
        System.out.println("------------FOR-----------------");
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println("Prueba: " + listaPersonas.get(i).getNombre());
        }
        // Iteramos la lista ArrayList con ForEach, se itera por cada elemento
        System.out.println("------------FOREACH-----------------");
            for (Persona persona: listaPersonas) {
                System.out.println("Prueba: " + persona.getNombre());
            }
    }

}
