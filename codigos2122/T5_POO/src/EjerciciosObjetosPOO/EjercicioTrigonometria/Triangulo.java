package EjerciciosObjetosPOO.EjercicioTrigonometria;

public class Triangulo {

    //variables
    private int base, altura;
    private double area;

    //constructores
    public Triangulo (){

    }
    public Triangulo (int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    //metodos
    public double calcularAreaTriangulo (){
        area = base*altura/2;
        return area;
    }
}
