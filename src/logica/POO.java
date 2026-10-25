package logica;

public class POO {

    public static void main (String [] args){

        Alumno alumno1 = new Alumno ();
        Alumno alumno2 = new Alumno (5, "Mishelle", "Bohorquez");

        System.out.println("\nNombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());
        System.out.println("Id alumno 2: " + alumno2.getId());

        alumno1.setId(8);
        alumno1.setNombre("Dayan");
        alumno1.setApellido("Rojas");

        System.out.println("\nNombre: " + alumno1.getNombre());
        System.out.println("Apellido: " + alumno1.getApellido());
        System.out.println("Id alumno 1: " + alumno1.getId());

        alumno2.setId(1);

        System.out.println("\nNombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());
        System.out.println("Id alumno 2: " + alumno2.getId());

    }

}
