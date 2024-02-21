package com.cristianml.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();

        System.out.println("Contiene elementos = " + !persona.isEmpty()); // contiene elementos?

        persona.put(null,"123");
        persona.put(null,"1234"); // No podemos agregar una clave ya existente a un Map
        persona.put("nombre", "Cristian");
        persona.put("apellido", "Montaño");
        persona.put("apellido_paterno", "Montaño");
        persona.put("email", "hola@gmail.com");
        persona.put("edad", 25);
        System.out.println(persona);

        // Obteniendo valores
        String nombre = (String) persona.get("nombre"); // por clave
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        // Creamos un nuevo Map (viene a ser como objeto, también podría ser una clase)
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Bárbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        // Agregamos el objeto al HashMap
        persona.put("direccion", direccion);
        System.out.println(persona);

        // Trabajando con el map que está dentro del map principal.
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion"); // casteamos
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        // si no existe un elemento usamos getOrDefault para asignar un valor por defecto
        String barrio = direccionPersona.getOrDefault("barrio", "Plan 3000");
        System.out.println("El país de " + nombre + " es: " + pais);
        System.out.println("L ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

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
        Collection<Object> valores = persona.values();
        for (Object v:valores) {
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
        for (Map.Entry<String, Object> par: persona.entrySet()) {
            Object valor = par.getValue();
            // Obteniendo el map dentro del Map principal para trabajar con él mientras iteramos
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        // Iterando de otra manera
        System.out.println("--------------------keySet--------------------");
        for (String llave:persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El país de " + nom + " es: " + direccionMap.get("pais"));
                System.out.println("El estado de " + nom + " es: " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + " es: " + direccionMap.get("ciudad"));
            } else {
                System.out.println(llave + " => " + valor);
            }
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
