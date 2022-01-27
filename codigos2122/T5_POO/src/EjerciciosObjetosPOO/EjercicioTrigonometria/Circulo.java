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
        this.area = (Math.PI) * Math.pow(this.radio,2);
        return area;
    }

    public double calcularDiametroCirculo () {
        this.diametro = 2* radio;
        return diametro;
    }

    //getter y setter

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
