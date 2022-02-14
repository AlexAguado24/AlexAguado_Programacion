package TrigonometriaHerencia;

public final class Circulo extends Figura{

    private double radio, diametro;

    public Circulo( double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        radio = Math.PI * radio;
    }

    public void calcularDiametro () {
        diametro = 2*radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
