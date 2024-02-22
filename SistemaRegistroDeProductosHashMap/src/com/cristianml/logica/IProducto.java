package com.cristianml.logica;

public interface IProducto {
    public void setId_producto(Integer id);
    public Integer getId_producto();
    public void setNombre(String nombre);
    public String getNombre();
    public void setPrecio(Double precio);
    public Double getPrecio();
    public void setCategoria(EnumCategoria categoria);
    public EnumCategoria getCategoria();

}
