package EjerciciosObjetosPOO.EjercicioTrigonometria;

public class Circulo {

    //atributos
    private double radio, diametro, area;

    //constructores
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }

    //metodos
    public double calcularAreaCirculo (){
        area = (Math.PI) * (radio*2);
        return area;
    }

    public double calcularDiametroCirculo () {
        diametro = 2* radio;
        return diametro;
    }
}
