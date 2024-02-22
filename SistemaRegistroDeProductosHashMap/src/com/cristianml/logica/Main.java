package com.cristianml.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductoDuplicadoException {
        Scanner scan = new Scanner(System.in);

        GestorProductos gp = new GestorProductos();
        Electronica elec1 = new Electronica(1122, "mouse", 370.0, EnumCategoria.ELECTRONICA);
        Electronica elec2 = new Electronica(1123, "mouse", 370.0, EnumCategoria.ELECTRONICA);
            Electronica elec3 = new Electronica(1124, "teclado", 370.0, EnumCategoria.ELECTRONICA);
        Vestimenta ves1 = new Vestimenta(1125, "polera", 45.21, EnumCategoria.VESTIMENTA);
        Vestimenta ves2 = new Vestimenta(1126, "short", 75.21, EnumCategoria.VESTIMENTA);
        Vestimenta ves3 = new Vestimenta(1127, "polera", 45.21, EnumCategoria.VESTIMENTA);
        Alimento al1 = new Alimento(1128, "papa", 4.5, EnumCategoria.ALIMENTO);
        Alimento al2 = new Alimento(1128, "tomate", 5.5, EnumCategoria.ALIMENTO);

        gp.agregarProducto(elec1.getId_producto(), elec1);
        gp.agregarProducto(elec2.getId_producto(), elec2);

        // Bucle do while para volver a ejecutar
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Producto de Electrónica");
            System.out.println("2. Agregar Producto de Vestimenta");
            System.out.println("3. Agregar Producto de Alimento");
            System.out.println("4. Salir");

            // Agregar producto
            opcion = scan.nextInt();
            int id;
            String nombre;
            Double precio;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el id del Producto Electronica: ");
                    id = scan.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    nombre = scan.next();
                    System.out.println("Ingrese el precio: ");
                    precio = scan.nextDouble();
                    Electronica elec = new Electronica(id, nombre, precio, EnumCategoria.ELECTRONICA);
                    gp.agregarProducto(elec.getId_producto(), elec);
                    break;
                case 2:
                    System.out.println("Ingrese el id del Producto Vestimenta: ");
                    id = scan.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    nombre = scan.next();
                    System.out.println("Ingrese el precio: ");
                    precio = scan.nextDouble();
                    Vestimenta ves = new Vestimenta(id, nombre, precio, EnumCategoria.VESTIMENTA);
                    gp.agregarProducto(ves.getId_producto(), ves);
                    break;
                case 3:
                    System.out.println("Ingrese el id del Producto Alimento: ");
                    id = scan.nextInt();
                    System.out.println("Ingrese el nombre del producto: ");
                    nombre = scan.next();
                    System.out.println("Ingrese el precio: ");
                    precio = scan.nextDouble();
                    Alimento al = new Alimento(id, nombre, precio, EnumCategoria.ALIMENTO);
                    gp.agregarProducto(al.getId_producto(), al);
                    break;
                case 4:
                    System.out.println("Fin de la ejecución.");
                    break;
                default:
                    System.out.println("digite un nro entre el 1 y 3");
            }
         }while (opcion != 4) ;
            System.out.println("Fin de la ejecución");



        gp.iterarProductos();

        gp.buscarProductoPorId(1122);
        gp.actualizarProducto(1122, "teclado", 900.5, EnumCategoria.ELECTRONICA);
        // gp.iterarProductos();
        //gp.eliminarProducto(1122);
        //gp.iterarProductos();
    }

}