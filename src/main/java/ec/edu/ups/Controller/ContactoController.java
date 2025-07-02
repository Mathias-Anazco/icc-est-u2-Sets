package ec.edu.ups.Controller;

import ec.edu.ups.Models.Contacto;
import ec.edu.ups.Utils.ContactoComparador;
import ec.edu.ups.Utils.ContactoComparadorNumeros;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ContactoController {
    public ContactoController(){
        runTreeContacto();
        runTreeContactoNumeros();
    }
    public void runTreeContacto() {
        ContactoComparador comparador = new ContactoComparador();
        Set<Contacto> agenda = new TreeSet<Contacto>( comparador);
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789" ));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
    public void runTreeContactoNumeros() {
        ContactoComparadorNumeros comparadorNumeros = new ContactoComparadorNumeros();
        Set<Contacto> agendaNumeros = new TreeSet<Contacto>(comparadorNumeros);
        // Agregamos algunos contactos
        System.out.println("------ Contactos orden alfabéticamente por apellido, nombre y teléfono -----");
        agendaNumeros.add(new Contacto("Pedro", "Lopez", "222222222"));
        agendaNumeros.add(new Contacto("Luis", "Perez", "111111111"));
        agendaNumeros.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agendaNumeros.add(new Contacto("Ana", "Perez", "987654321"));
        agendaNumeros.add(new Contacto("Pedro", "Lopez", "123456789" ));

        for (Contacto contacto : agendaNumeros) {
            System.out.println(contacto);
        }
    }
}
