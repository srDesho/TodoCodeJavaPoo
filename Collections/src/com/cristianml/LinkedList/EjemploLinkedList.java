package com.cristianml.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> al = new LinkedList<>();
        System.out.println(al + ", size= " + al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato",5));
        al.add(new Alumno("Cata",6));
        al.add(new Alumno("Luci",4));
        al.add(new Alumno("Jano",7));
        al.add(new Alumno("Andrés",3));

        System.out.println(al + ", size = " + al.size());

        // Eliminamos una posición dandole un objeto al método equals
        // al.remove(new Alumno("Jano", 7));
        System.out.println(al + ", size= " + al.size());

        // Agregamos valores en la 1ra posición
        al.addFirst(new Alumno("Zeus", 5));
        // Agregamos valores en la última posición
        al.addLast(new Alumno("Atenea", 6));
        System.out.println(al + ", size = " + al.size());

        // Obetenemos los elementos de 1ra o última posición
        System.out.println("Primero = " + al.getFirst());
        System.out.println("Último = " + al.getLast());
        System.out.println("Por índice(2) = " + al.get(2));

        // Obtenemos con peekFirst, peekLast,
        // la diferencia entre los gets, es que peek no lanza excepción cuando no existe un elemento,
        // sólo muestra false
        System.out.println("Primero = " + al.peekFirst());
        System.out.println("Último = " + al.peekLast());

        // Para eliminar
        // Alumno zeus = al.pop(); // pop elimina de la lista y extrae el elemento un objeto
        // al.pollLast(); // la diferencia de poll con remove es que si no existe el elemento
        // poll retorna false y no una excepción
        al.removeFirst();
        al.removeLast();
        System.out.println(al + " size = " + al.size());

        al.remove(new Alumno("Jano", 7));
        System.out.println(al + " size = " + al.size());

        // Agregamos un alumno en la última posición con addLast
        Alumno lucas = new Alumno("Lucas", 5);
        al.addLast(lucas);
        System.out.println("Indice de lucas = " + al.indexOf(lucas)); // Obtenemos el índice por objeto

        al.remove(2);
        System.out.println(al + " size = " + al.size());
        System.out.println("Indice de lucas = " + al.indexOf(lucas));

        // Reemplazar un elemento con con método set
        al.set(3,new Alumno("Lalo", 7));
        System.out.println(al + " size = " + al.size());

        // ListIterator
        System.out.println("---------------ListIterator---------------");
        ListIterator<Alumno> li = al.listIterator();
        System.out.println("---------------Next---------------");
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("---------------Previous---------------");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
