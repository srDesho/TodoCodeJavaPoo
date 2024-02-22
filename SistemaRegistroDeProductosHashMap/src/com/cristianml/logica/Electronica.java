package com.cristianml.logica;

public class Electronica extends ProductoBase {
    public Electronica() {
    }

    public Electronica(Integer id_producto, String nombre, Double precio, EnumCategoria categoria) {
        super(id_producto, nombre, precio, categoria);
    }

    @Override
    public Double calcularImpuesto(Double impuesto) {
        impuesto = getPrecio() * 0.6;
        return impuesto;
    }

    @Override
    public String toString() {
        return "Electronica{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

}
