package com.cristianml.logica;

public class Main {
    public static void main(String[] args) throws LibroNoDisponibleException {
        Biblioteca biblioteca = new Biblioteca();

        LibroImpreso impreso1 = new LibroImpreso("La Gallinita Ciega", "Daniel Montaño", 1998, "Bolivia");
        LibroDigital digital1 = new LibroDigital("Superman", "Maribel Laime", 2000, "pdf");
        LibroImpreso impreso2 = new LibroImpreso("La Torre Oscura", "Daniel Montaño", 1998, "Bolivia");
        LibroDigital digital2 = new LibroDigital("Superman 2", "Mel Jackson", 2000, "pdf");

        biblioteca.agregarLibro(impreso1);
        biblioteca.agregarLibro(digital1);
        biblioteca.agregarLibro(impreso2);
        biblioteca.agregarLibro(digital2);
        biblioteca.mostrarLista();
        System.out.println();

        // Realizamos una búsqueda
        System.out.println("----------------BÚSQUEDA------------------");
        biblioteca.buscarLibroTituloOAutor("La Gallinita Ciega");

        // Prestamos un libro
        System.out.println("----------------PRESTAR LIBRO------------------");
        biblioteca.prestarLibro(digital1);
        biblioteca.mostrarLista();

        // Hacemos pruebas
        biblioteca.prestarLibro(digital1);
        biblioteca.devolverLibro(digital1);
        biblioteca.prestarLibro(digital1);



    }
}