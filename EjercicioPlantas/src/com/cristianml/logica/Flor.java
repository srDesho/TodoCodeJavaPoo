package com.cristianml.logica;

public class Flor extends Planta{
    private String colorPetalos;
    private int cantPromedioPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionQueFlorece;

    public Flor() {
    }


    public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, int cantPromedioPetalos, String colorPistillo, String variedadFlor, String estacionQueFlorece) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromedioPetalos = cantPromedioPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public int getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(int cantPromedioPetalos) {
        this.cantPromedioPetalos = cantPromedioPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    @Override
    public void soyPlanta() {
        System.out.println("Hola, soy una Flor." );
    }
}
