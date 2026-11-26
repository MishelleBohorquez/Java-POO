package map;

import java.util.Map;
import java.util.HashMap;

public class PruebaMap {

    public static void main(String[] args) {

        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1523, "Dayan");
        mapaEmpleados.put(1524, "Mishelle");
        mapaEmpleados.put(1525, "Bohorquez");
        mapaEmpleados.put(1526, "Rojas");

        boolean existe = mapaEmpleados.containsValue("Mishelle");

        if (existe == true) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        boolean existeLlave = mapaEmpleados.containsKey(1526);

        if (existeLlave == true) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());

        String nombre = mapaEmpleados.get(1524);
        System.out.println("Nombre empleado (ID): " + nombre);

        mapaEmpleados.remove(1526);
        System.out.println(mapaEmpleados.values());

    }

}
