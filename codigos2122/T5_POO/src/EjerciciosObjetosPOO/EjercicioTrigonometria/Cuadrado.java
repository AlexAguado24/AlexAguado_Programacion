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

    public double calcularAreaCuadrado (int base, int altura) {
        area = base * altura;
        return area;
    }

    public double perimetroCuadrado (int a, int b) {
        perimetro = 2*a + 2*b;
        return perimetro;
    }

}
