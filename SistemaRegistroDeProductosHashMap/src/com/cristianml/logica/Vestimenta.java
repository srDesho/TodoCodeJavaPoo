package com.cristianml.logica;

public class Vestimenta extends ProductoBase{
    public Vestimenta() {
    }

    public Vestimenta(Integer id_producto, String nombre, Double precio, EnumCategoria categoria) {
        super(id_producto, nombre, precio, categoria);
    }


    @Override
    public Double calcularImpuesto(Double impuesto) {
        impuesto = getPrecio() * 0.2;
        return impuesto;
    }

    @Override
    public String toString() {
        return "Vestimenta{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
