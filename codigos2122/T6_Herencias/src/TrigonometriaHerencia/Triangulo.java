package TrigonometriaHerencia;

public final class Triangulo extends Figura{

    private int base, altura;

    public Triangulo(){}

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        this.area = (this.base * this.altura)/2;
        return this.area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
