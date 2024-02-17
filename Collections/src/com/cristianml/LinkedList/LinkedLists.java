package com.cristianml.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        // Las collecciones son como las matrices y vectores pero de una forma dinámina
        // Existen muchos tipos de colecciones, entre ellas estan los LIST, QUEUES, SET, MAP
        // Pueden variar su tamaño en cualquier momento
        // almacenan datos en un orden específico.
        // Los LinkedList son listas enlazadas que trabajan de manera que se pueden agregar elementos
        // al principio o al final de la lista.
        // Las LinkedList están pensadas para recorrerse registro por registro, no como en los ArrayList
        // que permiten ser recorridas mediante índices con el bucle for, los LinkedList se recorre con
        // forEach.

        // Creamos nuestra Arraylist que va a almacenar Personas, o sea es una lista(matriz) de objetos
        List<Persona> listaPersonas = new LinkedList<Persona>();

        // Con add agregamos elementos a nuestra lista
        listaPersonas.add(new Persona(1, "Cristian", 25));
        listaPersonas.add(new Persona(2, "Daniel", 22));
        listaPersonas.add(new Persona(3, "Maribel", 29));

        // Como nomrmalmente se agrega en la última posición, con linkedlist podemos agregar si queremos
        // en el inicio de la lista.
        listaPersonas.add(0, new Persona(4, "Prueba", 85));

        // Iteramos la lista ArrayList con ForEach, se itera por cada elemento
        System.out.println("------------FOREACH-----------------");
            for (Persona persona: listaPersonas) {
                System.out.println("Prueba: " + persona.getNombre());
            }
    }

}
