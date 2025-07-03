package ec.edu.ups.Controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("-----Ejercicio 1------");
        System.out.println(tiempoDuplicaods(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tiempoDuplicaods(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));

        System.out.println("-------Ejercicio 2-------");
        System.out.println("murcielago es isograma = "+ isIsograma("murcielago"));
        System.out.println("camaleon es isograma = "+ isIsograma("camaleon"));

        System.out.println("--------Ejercicio 3--------");
        System.out.println(palabrasUnicas("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" +
                "\n" +
                "            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" +
                "\n" +
                "            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."
                ));
    }
    public boolean tiempoDuplicaods(int[] numeros){
        Set<Integer> conjunto = new HashSet<>();
        for (int numero : numeros) {
            // Si el número ya está en el conjunto, es un duplicado
            if (!conjunto.add(numero)) {
                // Se encontró un duplicado
                return true;
            } else {
                // Si no es un duplicado, se añade al conjunto
                System.out.println("Añadiendo número: " + numero);
            }
        }
        // Si no se encontraron duplicados
        return false;
    }
    public boolean isIsograma(String palabra){
        Set<Character> conjunto = new HashSet<>();
        for (char letra : palabra.toCharArray()){
            if (!conjunto.add(letra)) {
                // Si la letra ya está en el conjunto, no es un isograma
                return false;
            }
        }
        return true; // Si todas las letras son únicas, es un isograma
    }
    public int palabrasUnicas(String frase){
        int contador = 0;
        String[] palabras = frase.split(" ");
        Set<String> conjuntoPalabras = new HashSet<>();
        for (String palabra : palabras) {
            // Añadir la palabra al conjunto, si ya existe no se añade
            if (conjuntoPalabras.add(palabra)) {
                contador++;
            }
        }
        // Retornar el número de palabras únicas
        return contador;

    }
}
