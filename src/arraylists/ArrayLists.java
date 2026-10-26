package arraylists;
import java.util.List;
import java.util.ArrayList;

public class ArrayLists {

    public static void main (String[] args){

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Dayan", 21));
        lista.add(new Persona(2, "Mishelle", 22));
        lista.add(new Persona(3, "Bohorquez", 23));
        lista.add(new Persona(4, "Rojas", 24));

        //Recorrer FOR
        System.out.println("------------ For ------------");
        for(int i =0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }

        //Recorrer FOREACH
        System.out.println("---------- Foreach ----------");
        for(Persona persona:lista){
            System.out.println("Prueba: " + persona.getNombre());
        }

    }

}
