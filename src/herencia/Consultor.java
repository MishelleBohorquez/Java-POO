package herencia;

public class Consultor extends Persona {

    String nombreConsultora;
    int numeroConsultor;

    public Consultor(){
    }

    public Consultor(int id, String dni, String nombre, String apellido, String direccion, String telefono, int numeroConsultor, String nombreConsultora) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.numeroConsultor = numeroConsultor;
        this.nombreConsultora = nombreConsultora;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }
}
