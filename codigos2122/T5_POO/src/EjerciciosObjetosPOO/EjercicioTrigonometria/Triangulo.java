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
    public void mostrarDatos(){
        System.out.println("Area "+this.area);
        System.out.println("Base "+this.base);
        System.out.println("Altura "+this.altura);
    }
    //getter y setter

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }
}
