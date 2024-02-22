package com.cristianml.logica;

import java.util.HashMap;
import java.util.Map;

public class GestorProductos {
    Map<Integer, IProducto> listaProductos = new HashMap<>();

    // Agregar producto con excepción personalizada
    public void agregarProducto(Integer id, IProducto producto) throws ProductoDuplicadoException{
        try {
            boolean existeono = listaProductos.containsKey(id);
            if (!existeono) {
                listaProductos.put(id, producto);
                System.out.println("Agregado correctamente");
            } else {
                throw new ProductoDuplicadoException();
            }
        } catch (ProductoDuplicadoException e) {
            System.out.println("Producto duplicado, ingrese otro Id que no exista!!!");
        }
    }

    public void iterarProductos() {
        boolean estaVacio = listaProductos.isEmpty();
        if (estaVacio) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("==================================================================INICIO====================================================================");
            for (Map.Entry<Integer, IProducto> producto : listaProductos.entrySet()) {
                System.out.println("llave = " + producto.getKey() + " => " + producto.getValue());
            }
        }
        System.out.println("=========================================================================FINAL=============================================================");
    }

    public void buscarProductoPorId(int id) {
        String existeONo = listaProductos.containsKey(id) ? listaProductos.get(id).toString(): "no existe";
        System.out.println("El producto existe = " + existeONo);
    }

    public void actualizarProducto(Integer id, String nombre, Double precio) throws ProductoDuplicadoException {
        try {
            if (listaProductos.containsKey(id)) {
                IProducto produc = listaProductos.get(id);
                produc.setNombre(nombre);
                produc.setPrecio(precio);
                System.out.println("Actualizado satisfactoriamente.");
            } else {
                throw new ProductoDuplicadoException();
            }
        } catch (ProductoDuplicadoException e) {
            System.out.println("El producto que quiere actualizar no existe.");
        }
    }

    public void eliminarProducto(int id) {
        String existeONo =  listaProductos.containsKey(id)?  "el producto con id = " + id + "(" + listaProductos.remove(id) + ") fue eliminado" :
                "No existe ningún producto con ese ID";
        System.out.println(existeONo);
    }

}
