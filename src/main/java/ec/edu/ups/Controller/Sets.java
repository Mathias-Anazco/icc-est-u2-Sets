package ec.edu.ups.Controller;

import java.util.*;

public class Sets {

    public void Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // Duplicado, no se añadirá
        palabras.add("Pera"); // Duplicado, no se añadirá
        palabras.add("Laptop"); // Duplicado, no se añadirá9

        return palabras;
    }

    public Set<String> construirLinkedHashSet() {

        Set<String> palabrasLinked = new LinkedHashSet<>();
        palabrasLinked.add("Laptop");
        palabrasLinked.add("Manzana");
        palabrasLinked.add("Pera");
        palabrasLinked.add("Celular");
        palabrasLinked.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinked.add("Pera"); // Duplicado, no se añadirá
        palabrasLinked.add("Laptop"); // Duplicado, no se añadirá

        return palabrasLinked;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabrasTree = new TreeSet<>();
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá

        return palabrasTree;

    }

    public Set<String> construirTreeSetConComparador() {

        // Crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare( String s1, String s2) {
                // Comparar por longitud de la cadena
                int result = Integer.compare(s1.length(), s2.length());
                // Si las longitudes son iguales, comparar alfabéticamente
                if(result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };


        Set<String> palabrasTree = new TreeSet<>(comparadorLongitud);

        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasTree.add("Celulas");


        return palabrasTree;

    }
    public Set<String> construirTreeSetConComparadorInverso() {

        // Crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare( String s1, String s2) {
                // Comparar por longitud de la cadena
                int result = Integer.compare(s2.length(), s1.length());
                // Si las longitudes son iguales, comparar alfabéticamente
                if(result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };


        Set<String> palabrasTree = new TreeSet<>(comparadorLongitud);

        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasTree.add("Celulas");


        return palabrasTree;

    }

}
