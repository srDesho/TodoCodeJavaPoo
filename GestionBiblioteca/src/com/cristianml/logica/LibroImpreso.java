package com.cristianml.logica;

public class LibroImpreso extends Libro{
    private String ubicacion;

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, int anioPublicado, String ubicacion) {
        super(titulo, autor, anioPublicado);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public void prestar() {
        setEstaPrestado(true);
        System.out.println("Prestando Libro Digital");
    }

    @Override
    public String toString() {
        return "LibroImpreso{" +
                "título='" + getTitulo() + '\'' +
                "autor='" + getAutor() + '\'' +
                "año publicado='" + getAnioPublicado() + '\'' +
                "está Prestado?='" + getEstaPrestado() + '\'' +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
