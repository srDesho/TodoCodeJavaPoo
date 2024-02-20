package com.cristianml.logica;

public abstract class Libro {
    private String titulo;
    private String autor;
    private int anioPublicado;
    private boolean estaPrestado = false;

    protected Libro() {
    }

    protected Libro(String titulo, String autor, int anioPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicado = anioPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public void setAnioPublicado(int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }

    public boolean getEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public abstract void prestar();
}
