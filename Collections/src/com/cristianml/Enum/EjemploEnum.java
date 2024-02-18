package com.cristianml.Enum;

public class EjemploEnum {
    // enum trabaja mayormente con constantes, por ejemplo los dias de la semána.
    // son un tipo de dato especial que representan un conjunto fijo de constantes.

    // Ejemplo de colores de ropa de una tienda
    enum Color {
        ROJO, VERDE, AZUL, ANARANJADO, BLANCO, NEGRO
    }
    public static void main(String[] args) {
        Color color = Color.ANARANJADO;
        System.out.println("El color es: " + color);

        // Recorrer enum, se puede recorrer un enum ya que viene a ser como un array.
        for (Color c : Color.values()) {
            System.out.println("El color es: " + c);
        }
    }
}
