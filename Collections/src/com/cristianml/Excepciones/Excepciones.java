package com.cristianml.Excepciones;

public class Excepciones {
    public static void main(String[] args) {
        // Las excepciones sirven para controlar los errores de algun codigo, o algo ingresado por teclado
        // Sirve para evitar que el programa se rompa y siga con alguna ejecución

        // Creando una excepción propia nuestra
        try {
            int division = 3/0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero!!!");
        }

        // Creando una excepción para un vector desbordado
        int[] edades = {12, 21, 45, 7};
        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentaste acceder a un índice que no existe.");
        }
    }
}
