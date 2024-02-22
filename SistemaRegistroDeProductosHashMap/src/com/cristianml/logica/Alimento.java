package com.cristianml.logica;

public class Alimento extends ProductoBase{
    public Alimento() {
    }

    public Alimento(Integer id_producto, String nombre, Double precio, EnumCategoria categoria) {
        super(id_producto, nombre, precio, categoria);
    }

    @Override
    public Double calcularImpuesto(Double impuesto) {
        impuesto = getPrecio() * 0.1;
        return impuesto;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
