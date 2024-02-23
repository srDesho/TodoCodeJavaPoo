package com.cristianml.logica;

public abstract class ProductoBase implements IProducto {
    private Integer id_producto;
    private String nombre;
    private Double precio;
    private EnumCategoria categoria;

    protected ProductoBase() {
    }

    protected ProductoBase(Integer id_producto, String nombre, Double precio, EnumCategoria categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public Integer getId_producto() {
        return id_producto;
    }

    @Override
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public EnumCategoria getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ProductoBase{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                '}';
    }

    public abstract void calcularImpuesto();
}
