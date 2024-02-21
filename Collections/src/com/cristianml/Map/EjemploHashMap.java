package com.cristianml.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();

        System.out.println("Contiene elementos = " + !persona.isEmpty()); // contiene elementos?

        persona.put(null,"123");
        persona.put(null,"1234"); // No podemos agregar una clave ya existente a un Map
        persona.put("nombre", "Cristian");
        persona.put("apellido", "Montaño");
        persona.put("apellido_paterno", "Montaño");
        persona.put("email", "hola@gmail.com");
        persona.put("edad", "25");
        System.out.println(persona);

        // Obteniendo valores
        String nombre = persona.get("nombre"); // por clave
        System.out.println("nombre = " + nombre);

        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        // Para eliminar usamos remove, y este podemos almacenarlo en una variable
        // String apellidoPaterno = persona.remove("apellido_paterno"); // elimina por clave
        boolean a = persona.remove("apellido_paterno", "Montaño"); // Elimina por clave y valor pero almacena en boolean
        System.out.println("eliminado = " + a); // mostramos el boolean si está eliminado o no
        System.out.println("persona = " + persona);

        // Usando método contains, para saber si existe un elemento
        boolean a2 = persona.containsKey("apellido_paterno"); // por llave
        System.out.println("a2 = " + a2);

        a2 = persona.containsValue("Montaño"); // por valor
        System.out.println("a2 = " + a2);

        // Obtener valores de un map
        System.out.println("--------------------values--------------------");
        Collection<String> valores = persona.values();
        for (String v:valores) {
            System.out.println("v = " + v);
        }
        // Obtener claves de un map
        System.out.println("--------------------KeySet--------------------");
        Set<String> claves = persona.keySet();
        for (String k:claves) {
            System.out.println("k = " + k);
        }

        // Iterando con claves y valores (iterando pares)
        System.out.println("--------------------entrySet--------------------");
        for (Map.Entry<String, String> par: persona.entrySet()) {
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        // Iterando de otra manera
        System.out.println("--------------------keySet--------------------");
        for (String llave:persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        // Iterando con expresión lambda
        System.out.println("--------------------Java 8 forEach--------------------");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        // Tamaño de Map
        System.out.println("Total = " + persona.size());
        // Contiene elementos?
        System.out.println("Contiene elementos = " + !persona.isEmpty());

        // Modificar un valor de un elemento existente
        // persona.replace("nombre", "Daniel"); // 1er forma

        // 2da forma, por si el valor tiene duplicados
        boolean a3 = persona.replace("nombre", "Cristian", "Daniel");
        System.out.println("Modificado = " + a3);
        System.out.println("persona = " + persona);
    }

}
