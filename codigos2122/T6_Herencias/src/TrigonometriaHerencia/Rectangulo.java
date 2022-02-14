package TrigonometriaHerencia;

public final class Rectangulo extends Figura{

    private double base, altura, perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        super.calcularArea();
        area = base * altura;
    }

    public void calcularPerimetro(){
        perimetro = 2 * (base + altura);
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
