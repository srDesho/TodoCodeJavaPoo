package com.cristianml.logica;

public class ProductoDuplicadoException extends Exception{
    public ProductoDuplicadoException() {
        super("El producto con ese Id ya existe!!!");
    }
    public ProductoDuplicadoException(String mensaje) {
        super(mensaje);
    }
}
