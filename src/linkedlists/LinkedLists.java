package linkedlists;
import java.util.List;
import java.util.LinkedList;

public class LinkedLists {

    public static void main (String[] args){

        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(1, "Dayan", 21));
        lista.add(new Persona(2, "Mishelle", 22));
        lista.add(new Persona(3, "Bohorquez", 23));
        lista.add(new Persona(4, "Rojas", 24));

        //Agregar al principio
        lista.add(0, new Persona(5, "Inicio", 25));

        for(Persona persona:lista){
            System.out.println("Prueba: " + persona.getNombre());
        }

    }

}