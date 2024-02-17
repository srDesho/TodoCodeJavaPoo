package com.cristianml.Map;

import java.util.HashMap;
import java.util.Map;

public class MapPruebas {
    public static void main(String[] args) {
        // Los maps se usan mayormente para búsquedas eficiente y óptimas.
        // Los maps se caracterizan por almacenar pares de clave-valor, como un JSON

        // Creamos un map de tipo HashMap
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(1121, "Cristian Montaño");
        mapaEmpleados.put(1122, "Juan Perez");
        mapaEmpleados.put(1123, "Nena Laime");
        mapaEmpleados.put(1124, "Mel Jackson");
        mapaEmpleados.put(1125, "Abbner Wachin");

        // Realizamos una búsqueda si contiene una llave o un valor
        // boolean estaono = mapaEmpleados.containsValue("Cristian Montaño"); // Por valor
        boolean estaono = mapaEmpleados.containsKey(1121); // Por clave
        if (estaono) {
            System.out.println("Si está");
        }
        else {
            System.out.println("No está");
        }

        // Devolver los datos mediante llave o valor
        System.out.println(mapaEmpleados.keySet()); // por Llave
        System.out.println(mapaEmpleados.values()); // por valor

        // Obtener valor mediante la llave
        String nombre = mapaEmpleados.get(1121);
        if (!(nombre == null)) {
            System.out.println("El empleado buscado es: " + nombre);
        } else {
            System.out.println("La llave buscada no existe");
        }

        // Eliminar datos por key
        mapaEmpleados.remove(1125); // Si la llave no existe no dará error, simplemente no hará nada
    }
}
