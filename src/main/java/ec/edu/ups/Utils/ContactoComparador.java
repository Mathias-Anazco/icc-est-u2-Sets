package ec.edu.ups.Utils;

import ec.edu.ups.Models.Contacto;

import java.util.Comparator;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2){
        // Primero el apellido orden alfabéticamente
        int apellidoComparison = c1.getApellido().compareTo(c2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison; // Si los apellidos son diferentes, retornar la comparación
        }
        return c1.getNombre().compareTo(c2.getNombre()); // Si los apellidos son iguales, comparar por nombre
    }
}
