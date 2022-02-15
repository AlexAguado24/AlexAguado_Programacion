package TrigonometriaHerencia;

public final class Triangulo extends Figura{

    private double base, altura;

    public Triangulo(){}

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = (base * altura)/2;
        //System.out.println("El area del triangulo es: "+area);
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
