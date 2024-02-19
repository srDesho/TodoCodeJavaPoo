package com.cristianml.logica;

public class Arbusto extends Planta{
    private double anchoArbustro;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, double anchoArbustro, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONo) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbustro = anchoArbustro;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAnchoArbustro() {
        return anchoArbustro;
    }

    public void setAnchoArbustro(double anchoArbustro) {
        this.anchoArbustro = anchoArbustro;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void soyPlanta() {
        System.out.println("Hola, soy un Arbusto." );
    }
}
