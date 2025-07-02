package ec.edu.ups;

import ec.edu.ups.Controller.ContactoController;
import ec.edu.ups.Controller.Sets;
import ec.edu.ups.Models.Contacto;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Sets sets = new Sets();
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorInverso(sets);
        ContactoController contactoController = runTreeContacto();

    }
    public static void runHashSet(Sets sets) {
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("------ HashSet Example -----");
        System.out.println("Elementos en HashSet no mantienen el orden de inserción:");
        for(String elemento: ejemploHashSet){
            System.out.println(elemento);
        }
    }
    public static void runLinkedHashSet(Sets sets) {
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("------ LinkedHashSet Example -----");
        System.out.println("Elementos en LinkedHashSet mantienen el orden de inserción:");
        for(String elemento: ejemploLinkedHashSet){
            System.out.println(elemento);
        }
    }
    public static void runTreeSet(Sets sets) {
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("------ TreeSet Example -----");
        System.out.println("Elementos en TreeSet están ordenados:");
        for(String elemento: ejemploTreeSet){
            System.out.println(elemento);
        }
    }
    public static void runTreeSetConComparador(Sets sets) {
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("------ TreeSet con Comparador Example -----");
        System.out.println("Elementos en TreeSet con comparador están ordenados por longitud:");
        for(String elemento: ejemploTreeSetConComparador){
            System.out.println(elemento);
        }
    }
    public static void runTreeSetConComparadorInverso(Sets sets) {
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparadorInverso();
        System.out.println("------ TreeSet con Comparador Example -----");
        System.out.println("Elementos en TreeSet con comparador están ordenados por longitud pero inversamente:");
        for(String elemento: ejemploTreeSetConComparador){
            System.out.println(elemento);
        }
    }
    public static ContactoController runTreeContacto() {
        System.out.println("------ Contacto orden alfabetico apellido - nombre -----");
        return new ContactoController();

    }

}