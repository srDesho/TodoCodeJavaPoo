package com.cristianml.logica;

public abstract class Planta {
    protected String nombre;
    protected double altoDelTallo;
    protected boolean tieneHojas;
    protected String climaIdeal;

    protected Planta() {
    }

    protected Planta(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void soyPlanta();
}
