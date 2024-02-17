package com.cristianml.MetodosParaListas;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        // Creamos nuestra Arraylist que va a almacenar Personas, o sea es una lista(matriz) de objetos
        List<Persona> listaPersonas = new LinkedList<Persona>();
        // Con add agregamos elementos a nuestra lista
        listaPersonas.add(new Persona(1, "Cristian", 25));
        listaPersonas.add(new Persona(2, "Daniel", 22));
        listaPersonas.add(new Persona(3, "Maribel", 29));

        // Creamos nuestra LinkedList y agregamos elementos
        List<Persona> listaPersonas2 = new LinkedList<Persona>();
        listaPersonas2.add(new Persona(1, "Cristian", 25));
        listaPersonas2.add(new Persona(2, "Daniel", 22));
        listaPersonas2.add(new Persona(3, "Maribel", 29));

        // Método para eliminar de un ArrayList
        listaPersonas.remove(1);

        // Método para eliminar de un LinkedList, ya que no trabajamos con índices, podemos trabajar con
        // variables.
        String nombreBorrar = "Daniel";
        for (Persona perso:listaPersonas2) {
            if (perso.getNombre().equals(nombreBorrar)) {
                listaPersonas2.remove(perso);
                break; // Cortar para dejar de recorrer
            }
        }

        // Iteramos ArrayList
        for(Persona perso:listaPersonas) {
            System.out.println("Prueba: " + perso.getNombre());
        }

        // Iteramos la lista LinkedList con ForEach, se itera por cada elemento
        System.out.println("------------FOREACH-----------------");
            for (Persona persona: listaPersonas) {
                System.out.println("Prueba: " + persona.getNombre());
            }

        // Tamaño lista
        System.out.println("--------Qué tamaño tienen las listas?---------");
        System.out.println("ArrayList: " + listaPersonas.size());
        System.out.println("LinkedList: " + listaPersonas2.size());

        // Obtener primer y ultimo elemento (Sólo en LinkedList)
        System.out.println("-----------Primer y último objeto sólo para LinkedList-----------");
        System.out.println("Primero de LinkedList " + listaPersonas2.getFirst().toString());
        System.out.println("Último de LinkedList " + listaPersonas2.getLast().toString());

        // Borrar toda la lista
        System.out.println("----------Borrando Listas------------");
        listaPersonas.clear();
        listaPersonas2.clear();

        // Comprobar si está vacía
        System.out.println("------------Está vacía alguna lista?");
        System.out.println("ArrayList: " + listaPersonas.isEmpty());
        System.out.println("LinkedList: " + listaPersonas2.isEmpty());
    }

}
