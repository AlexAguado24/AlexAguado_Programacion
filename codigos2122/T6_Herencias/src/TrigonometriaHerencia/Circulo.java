package TrigonometriaHerencia;

public final class Circulo extends Figura{

    private double radio, diametro;

    public Circulo(){}

    public Circulo( double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = Math.PI * (radio *2);
        //System.out.println("El area del circulo es: "+area);
    }

    public void calcularDiametro () {
        diametro = 2*radio;
        //System.out.println("El diametro es: "+diametro);
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
