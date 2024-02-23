package com.cristianml.logica;

public interface IProducto {

    public Integer getId_producto();
    public void setId_producto(Integer id);
    public String getNombre();
    public void setNombre(String nombre);
    public Double getPrecio();
    public void setPrecio(Double precio);
    public EnumCategoria getCategoria();
    public void setCategoria(EnumCategoria cat);
}
