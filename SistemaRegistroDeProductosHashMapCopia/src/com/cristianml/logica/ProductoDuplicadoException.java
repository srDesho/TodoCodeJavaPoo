package com.cristianml.logica;

public class ProductoDuplicadoException extends Exception{
    public ProductoDuplicadoException() {
        super("El producto con el id ingresado ya existe, por favor ingrese otro id.");
    }
    public ProductoDuplicadoException(String mensaje) {
        super(mensaje);
    }
}
