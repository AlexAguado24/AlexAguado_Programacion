package TrigonometriaHerencia;

public final class Rectangulo extends Figura{

    private int base, altura;
    private  double perimetro;

    public Rectangulo(){}

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        this.area = this.base*this.altura;
        return this.area;
    }

    public double calcularPerimetro(){
        this.perimetro = 2 * (this.base + this.altura);
        //System.out.println("El perimetro es: "+perimetro);
        return this.perimetro;
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
