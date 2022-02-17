package TrigonometriaHerencia;

public final class Circulo extends Figura{

    private double radio, diametro;

    public Circulo(){}

    public Circulo( double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        this.area = Math.PI * Math.pow(radio,2);

        return area;
    }

    public double calcularDiametro () {
        this.diametro = 2*this.radio;
        return this.diametro;
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
