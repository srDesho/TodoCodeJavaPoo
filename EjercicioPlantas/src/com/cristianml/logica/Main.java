package com.cristianml.logica;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol("Toborochi", 20.5, true, "Soleado", "lo que sea", 5.2, "café", "con puntas");
        Flor flor = new Flor("Margarita", 0.15, false, "Soleado", "Blanco", 6, "verde", "Cualquiera", "Primavera" );
        Arbusto arbus = new Arbusto("Lila", 1.5, true, "Soleado", 3.2, true, "Cualquiera", "Verde", true );

        // Llmamos los métodos
        arbol.soyPlanta();
        flor.soyPlanta();
        arbus.soyPlanta();
    }
}