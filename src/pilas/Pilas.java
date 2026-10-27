package pilas;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("---------------- Pila Vacía ----------------");
        System.out.println("Pila: " + pila);
        System.out.println("---------------- Pila Vacía ----------------");
        System.out.println("Pila: " + pila.isEmpty());

        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido
        System.out.println("------------------- Pila -------------------");
        for(Integer pilita: pila){
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("------------------- Pila -------------------");
        System.out.println("Pila: " + pila);
        System.out.println("---------------- Pila Vacía ----------------");
        System.out.println("Pila: " + pila.isEmpty());

        pila.pop();
        System.out.println("------------------- Pila -------------------");
        System.out.println("Pila: " + pila);
        System.out.println("---------------- Buscar pila ----------------");
        System.out.println("Pila 2: " + pila.search(2));
        System.out.println("-------------- último agregado --------------");
        System.out.println("Pila : " + pila.peek());

    }
}
