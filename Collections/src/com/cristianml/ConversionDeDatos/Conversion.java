package com.cristianml.ConversionDeDatos;

public class Conversion {
    public static void main(String[] args) {
        // Podemos convertir un tipo de dato con Casting, Parse y con la clase wrapper

        // CASTING se trabaja con numeros
        /* double estatura = 1.71;
        int estaturaInt = (int) estatura; // casteamos a entero
        long estaturaLong = (long) estatura; // casteamos a long(entero mas grande)

        System.out.println("Entero: " + estaturaInt);
        System.out.println("Long: " + estaturaLong); */

        // PARSE, convertimos de string a números
        String cantidad = "20";
        String precio = "25.5";

        int cantInt = Integer.parseInt(cantidad);
        double preDouble = Double.parseDouble(precio);
        System.out.println("Total: " + (cantInt * preDouble));

        // En viceversa de numeros a String
        double estatura = 1.71;
        int edad = 25;
        String estaturaStr = String.valueOf(estatura);
        String edadStr = String.valueOf(edad);
        System.out.println("Edad: " + edadStr + " - " + " Estatura: " + estaturaStr);
    }
}
