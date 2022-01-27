package EjerciciosObjetosPOO.EjercicioTrigonometria;

public class Cuadrado {

    //variables
    private int base, altura;
    private double area, perimetro;

    //constructores
    public Cuadrado (){

    }
    public Cuadrado (int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    //metodos

    public double calcularAreaCuadrado () {
        area = base * altura;
        return area;
    }

    public double perimetroCuadrado () {
        perimetro = 2*altura + 2*base;
        return perimetro;
    }

    //getter y setter


    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
