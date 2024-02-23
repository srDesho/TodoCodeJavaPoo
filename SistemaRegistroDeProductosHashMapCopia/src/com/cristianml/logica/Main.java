package com.cristianml.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductoDuplicadoException, IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        GestorProductos gp = new GestorProductos();

        Electronica elec1 = new Electronica(1122, "mouse", 370.0, EnumCategoria.ELECTRONICA);
        Electronica elec2 = new Electronica(1123, "mouse", 370.0, EnumCategoria.ELECTRONICA);
        Electronica elec3 = new Electronica(1124, "teclado", 370.0, EnumCategoria.ELECTRONICA);
        Vestimenta ves1 = new Vestimenta(1125, "polera", 45.21, EnumCategoria.VESTIMENTA);
        Vestimenta ves2 = new Vestimenta(1126, "short", 75.21, EnumCategoria.VESTIMENTA);
        Vestimenta ves3 = new Vestimenta(1127, "polera", 45.21, EnumCategoria.VESTIMENTA);
        Alimento al1 = new Alimento(1128, "papa", 4.5, EnumCategoria.ALIMENTO);
        Alimento al2 = new Alimento(1129, "tomate", 5.5, EnumCategoria.ALIMENTO);

        // Agregando datos
        gp.agregarProducto(elec1.getId_producto(), elec1);
        gp.agregarProducto(elec2.getId_producto(), elec2);
        gp.agregarProducto(elec3.getId_producto(), elec3);
        gp.agregarProducto(ves1.getId_producto(), ves1);
        gp.agregarProducto(ves2.getId_producto(), ves2);
        gp.agregarProducto(ves3.getId_producto(), ves3);
        gp.agregarProducto(al1.getId_producto(), al1);
        gp.agregarProducto(al2.getId_producto(), al2);
        System.out.println();

        gp.mostrarProductos();

        // Creamos interfaz en la consola
        Integer id = 0;
        String nombre = "";
        Double precio = 0.0;
        boolean esValido = true;
        Integer opcion = 0;
        do {

            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un Producto");
            System.out.println("2. Buscar un Producto");
            System.out.println("3. Actualizar un Producto");
            System.out.println("4. Eliminar un Producto");
            System.out.println("5. Listar Productos");
            System.out.println("6. Salir del programa");
            do {
                System.out.println("Ingrese un número del 1 al 6:");
                String entrada = scan.nextLine().trim(); // Eliminar espacios en blanco alrededor de la entrada
                if (!entrada.isEmpty() && entrada.matches("\\d")) { // Verificar que la entrada no esté vacía y sea un solo dígito
                    opcion = Integer.parseInt(entrada);
                    if (opcion >= 1 && opcion <= 6) {
                        break; // Salir del bucle si la entrada es válida
                    }
                }
                System.out.println("Debe ingresar solo números del 1 al 6 sin espacios adicionales.");
            } while (true);

            switch (opcion) {
                case 1: // Agregar producto
                    // Bucle do while para volver a ejecutar la agregación de productos
                    do {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Agregar Producto de Electrónica");
                        System.out.println("2. Agregar Producto de Vestimenta");
                        System.out.println("3. Agregar Producto de Alimento");
                        System.out.println("4. Volver al menú inicio");
                        do {
                            if (scan.hasNextInt()) {
                                opcion = scan.nextInt();
                                esValido = true;
                                scan.nextLine();
                            } else {
                                System.out.println("Debe ingresar sólo números del 1-4");
                                esValido = false;
                                scan.nextLine();
                            }
                        } while (!esValido);

                        // Si es válido, procedo a agregar elemento según el tipo de producto que eligió
                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese el id para el nuevo producto: ");
                                id = scan.nextInt();
                                System.out.println("Ingrese el nombre del producto: ");
                                nombre = scan.next();
                                System.out.println("Ingrese el precio del producto: ");
                                precio = scan.nextDouble();

                                // Creamos nuestro nuevo producto
                                gp.agregarProducto(id, new Electronica(id, nombre, precio, EnumCategoria.ELECTRONICA));
                                break;

                            case 2:
                                System.out.println("Ingrese el id para el nuevo producto: ");
                                id = scan.nextInt();
                                System.out.println("Ingrese el nombre del producto: ");
                                nombre = scan.next();
                                System.out.println("Ingrese el precio del producto: ");
                                precio = scan.nextDouble();

                                // Creamos nuestro nuevo producto
                                gp.agregarProducto(id, new Electronica(id, nombre, precio, EnumCategoria.VESTIMENTA));
                                break;

                            case 3:
                                System.out.println("Ingrese el id para el nuevo producto: ");
                                id = scan.nextInt();
                                System.out.println("Ingrese el nombre del producto: ");
                                nombre = scan.next();
                                System.out.println("Ingrese el precio del producto: ");
                                precio = scan.nextDouble();

                                // Creamos nuestro nuevo producto
                                gp.agregarProducto(id, new Electronica(id, nombre, precio, EnumCategoria.ALIMENTO));
                                break;
                            case 4:
                                System.out.println("Volviendo al menú inicio....");
                                break;
                            default:
                                System.out.println("Ingrese un nro del 1-4");
                        }

                    }while (opcion != 4);

                    break;

                case 2: // Buscar Producto
                    System.out.println("Ingrese el id del Producto que desea buscar: ");
                    id = scan.nextInt();
                    gp.buscarProducto(id);
                    break;
                case 3: // Actualizar Producto
                    // Validamos los datos mientras son cargados
                    do {
                        System.out.println("Ingrese el Id del producto que desea actualizar");
                        if (scan.hasNextInt()) {
                            id = scan.nextInt();
                            esValido = true;
                            scan.nextLine(); // Limpiar buffer del scanner para volver a ejecutar en limpio
                        } else {
                            System.out.println("El dato ingresado no es un nro válido, ingrese el id nuevamenete.");
                            esValido = false;
                            scan.nextLine(); // Limpiar buffer del scanner para volver a ejecutar en limpio
                        }
                    } while (!esValido);

                    System.out.println("Ingrese un nombre para el producto: ");
                    nombre = scan.nextLine();

                    do {
                        System.out.println("Ingrese el precio: ");
                        if (scan.hasNextInt()) {
                            precio = scan.nextDouble();
                            esValido = true;
                            scan.nextLine();
                        } else {
                            System.out.println("El dato ingresado no es un nro válido, ingrese el precio nuevamente.");
                            esValido = false;
                            scan.nextLine();
                        }
                    } while (!esValido);

                    gp.actualizarProducto(id, nombre, precio);
                    break;
                case 4: // Eliminar Producto
                    System.out.println("Ingresa el id del producto que deseas eliminar: ");
                    id = scan.nextInt();
                    gp.eliminarProducto(id);
                    scan.nextLine();
                    break;
                case 5: // mostrarProductos
                    gp.mostrarProductos();
                    break;
                case 6:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Ingrese una opción válida por favor:");
            }
        } while (opcion != 6);


    }
}