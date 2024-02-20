package com.cristianml.logica;

public class LibroNoDisponibleException extends Exception{
    // Ésta es una clase que hereda de la clase hereda o extiende de la clase Exception de java
    // Vamos a crear una nueva y propia nuestra con un constructor y un mensaje estático

    public LibroNoDisponibleException() {
        super("El libro no está disponible para prestar.");
    }

    // Creamos otro constructo por si queremos que sea dinámico el mensaje
    public LibroNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
