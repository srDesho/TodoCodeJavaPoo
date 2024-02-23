package com.cristianml.logica;

import java.net.PortUnreachableException;
import java.util.HashMap;
import java.util.Map;

public class GestorProductos {
    private Map<Integer, IProducto> listaProductos = new HashMap<>();

    // Agregar producto a la lista
    public void agregarProducto(Integer id, IProducto producto) throws ProductoDuplicadoException {
        try {
            if (!listaProductos.containsKey(id)) {
                listaProductos.put(id, producto);
                System.out.println("Agregado exitosamente.");
            } else {
                throw new ProductoDuplicadoException("id Duplicado.");
            }
        } catch (ProductoDuplicadoException e) {
            System.out.println("El id ingresado ya existe, por favor ingrese otro");
        }
    }

    // Buscar Producto
    public void buscarProducto(Integer id) {
        String estaONo = listaProductos.containsKey(id) ? "Producto con id " + id + " existe => " :
                "Producto con id " + id + " existe => No existe";
        if (listaProductos.containsKey(id)) {
            System.out.println(estaONo + listaProductos.get(id).toString());
        } else {
            System.out.println(estaONo);
        }
    }

    // Actualizar Producto
    public void actualizarProducto(Integer id, String nombre, Double precio) throws ProductoDuplicadoException{
        boolean existeONo = listaProductos.containsKey(id);
        if (existeONo) {
            try {
                if (id == null) {
                    throw new ProductoDuplicadoException("tipo de dato de id no es válido, debe ser Integer.");
                }

                if (precio == null) {
                    throw new ProductoDuplicadoException("tipo de dato de precio no es válido, debe ser Double");
                }
                IProducto producto = listaProductos.get(id);
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                listaProductos.replace(id, producto);
                System.out.println("Actualizado exitosamente.");

            } catch (ProductoDuplicadoException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No existe un producto con ese ID.");
        }
    }
    // Eliminar Producto
    public void eliminarProducto(Integer id) {
        String existeONo = listaProductos.containsKey(id) ?
                "Se ha eliminado el producto con id " + id + " => " + listaProductos.remove(id):
                "El producto con id " + id + " no existe";
        System.out.println(existeONo);
    }

    // Mostrar Productos
    // Comprobamos si la lista está vacía
    public void mostrarProductos() {
        boolean estaVacia = listaProductos.isEmpty();
        if (!estaVacia) {
            System.out.println();
            System.out.println("=========================================================INICIO============================================================");
            for (Map.Entry<Integer, IProducto>productoEntry : listaProductos.entrySet()){
                System.out.println("{ llave: " + productoEntry.getKey() + " => " + "{" +
                        productoEntry.getValue().toString() + "}");
            }
            System.out.println("=========================================================FINAL============================================================");
            System.out.println();
        } else {
            System.out.println("La lista está vacía.");
        }
    }
}
