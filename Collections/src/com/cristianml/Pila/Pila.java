package com.cristianml.Pila;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        // Pila es una lista ordenada que trabaja con el tipo LIFO, a diferencia de los Arrays
        // y linkeds que trabajan con FIFO.
        // Tiene diferentes formas de trabajar con sus elementos, diferencte métodos

        // Creamos una lista de pilas con la palabra Stack
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía: " + pila); // Nos muestra la pila y si hay nada no mostrará nada.
        System.out.println("Está vacía? " + pila.isEmpty());

        // Agregar -> .push
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // recorrido es como un array o linkedlist
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }

        // mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacía? " + pila.isEmpty());

        pila.pop(); // Eliminar el último registro que entró
        // Búsqueda por elemento, si es verdadeo muestra un nro par, si es false muestra impar
        System.out.println("Está el 3: " + pila.search(3));
        System.out.println("Último agregado: " + pila.peek());
    }
}
