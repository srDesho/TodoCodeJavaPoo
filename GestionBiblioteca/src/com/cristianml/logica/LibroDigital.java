package com.cristianml.logica;

public class LibroDigital extends Libro {
    private String formato;

    public LibroDigital() {
    }


    public LibroDigital(String titulo, String autor, int anioPublicado, String formato) {
        super(titulo, autor, anioPublicado);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    @Override
    public void prestar() {
        setEstaPrestado(true);
        System.out.println("Prestando un Libro Digital");
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "título='" + getTitulo() + '\'' +
                "autor='" + getAutor() + '\'' +
                "año publicado='" + getAnioPublicado() + '\'' +
                "está Prestado?='" + getEstaPrestado() + '\'' +
                "formato='" + formato + '\'' +
                '}';
    }

}
