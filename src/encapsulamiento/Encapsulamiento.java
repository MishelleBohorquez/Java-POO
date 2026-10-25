package encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(1, "Mishelle", "Bohorquez");

        System.out.println("Id: " + alumno2.getId());
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());

    }
}
