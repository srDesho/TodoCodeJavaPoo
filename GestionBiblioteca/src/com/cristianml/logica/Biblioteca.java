package com.cristianml.logica;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> listaLibros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    // Agregamos nuestra exception creada y el try catch para que no pare la ejecución
    public void prestarLibro(Libro libro) throws LibroNoDisponibleException {
        try {
            if (!libro.getEstaPrestado()) {
                libro.setEstaPrestado(true);
                System.out.println("Prestando el libro: " + libro.getTitulo());
            } else {
                throw new LibroNoDisponibleException();
            }
        } catch (LibroNoDisponibleException e) {
            System.out.println("No disponible para prestar");
        }

    }

    public void devolverLibro(Libro libro) {
        libro.setEstaPrestado(false);
        System.out.println("Devolviendo el libro: " + libro.getTitulo());
    }

    public void buscarLibroTituloOAutor(String busqueda) {
        int cant = 0;
        for (Libro libro : listaLibros) {
            if ((libro.getTitulo().equals(busqueda)) || libro.getAutor().equals(busqueda)) {
                System.out.println(libro.toString());
                cant++;
            }
        }
        if (cant == 0) {
            System.out.println("No se encontró ningún libro con ese título o autor.");
        }
    }

    public void mostrarLista() {
        for (Libro libro:listaLibros) {
            System.out.println(libro.toString());
        }
    }
}
