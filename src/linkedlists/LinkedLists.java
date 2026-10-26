package linkedlists;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedLists {

    public static void main (String[] args){

        System.out.println("-------------------- ArryList --------------------");
        List<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1, "Dayan", 21));
        listaArray.add(new Persona(2, "Mishelle", 22));
        listaArray.add(new Persona(3, "Bohorquez", 23));
        listaArray.add(new Persona(4, "Rojas", 24));

        //Remover ArrayList
        listaArray.remove(1);

        for(Persona persona:listaArray){
            System.out.println(persona.getNombre());
        }

        System.out.println("------------------- LinkedList -------------------");
        List<Persona> listaLinked = new LinkedList<Persona>();

        listaLinked.add(new Persona(1, "Dayan", 21));
        listaLinked.add(new Persona(2, "Mishelle", 22));
        listaLinked.add(new Persona(3, "Bohorquez", 23));
        listaLinked.add(new Persona(4, "Rojas", 24));

        //Agregar al principio
        listaLinked.add(0, new Persona(5, "Inicio", 25));

        //Remover ArrayList
        String borrarNombre = "Rojas";
        for(Persona persona:listaLinked){
            if(persona.getNombre().equals(borrarNombre)){
                listaLinked.remove(persona);
                break; //Rompe la cadena para que se regenere
            }
        }

        for(Persona persona:listaLinked){
            System.out.println(persona.getNombre());
        }

        System.out.println("-------------------- Tamaño --------------------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        System.out.println("------------------ LinkedList ------------------");
        System.out.println("Primero: " + listaLinked.getFirst().toString());
        System.out.println("Último: " + listaLinked.getLast().toString());

        System.out.println("------------------ Borrar Listas ------------------");
        listaArray.clear();
        listaLinked.clear();

        System.out.println("------------------ Listas Vacías ------------------");
        System.out.println("Array: " + listaArray.isEmpty());
        System.out.println("Linked: " + listaLinked.isEmpty());

    }

}