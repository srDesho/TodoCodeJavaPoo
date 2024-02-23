package com.cristianml.logica;

public class Electronica extends ProductoBase{
    public Electronica() {
    }

    public Electronica(Integer id_producto, String nombre, Double precio, EnumCategoria categoria) {
        super(id_producto, nombre, precio, categoria);
    }

    @Override
    public void calcularImpuesto() {
        Double resultado = getPrecio() * 0.6;
        System.out.println("El impuesto es de: " + resultado + "$");
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + getId_producto() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", categoria=" + getCategoria() +
                '}';
    }
}
