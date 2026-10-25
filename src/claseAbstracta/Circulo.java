package claseAbstracta;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /*
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }
     */

    @Override
    public double calcularArea() {
        double resultado = 3.1416 * radio * radio;
        return resultado;
    }

    @Override
    public double dibujar() {
        System.out.println("Dibujando círculo");
    }

    @Override
    public double rotar() {
        System.out.println("Rotando círculo");
    }

}
