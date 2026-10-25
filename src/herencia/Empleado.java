package herencia;

public class Empleado extends Persona {

    int numeroLegajo;
    String cargo;
    double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String direccion, String telefono, int numeroLegajo, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
