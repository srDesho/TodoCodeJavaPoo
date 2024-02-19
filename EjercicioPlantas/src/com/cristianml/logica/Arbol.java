package com.cristianml.logica;

public class Arbol extends Planta{
    private String variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String variedad, double radioDeTronco, String color, String tipoDeHojas) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(double radoDeTronco) {
        this.radioDeTronco = radoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    public void soyPlanta() {
        System.out.println("Hola, soy un Árbol." );
    }
}
