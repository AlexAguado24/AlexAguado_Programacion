package Ejercicio3Repaso;

public abstract class Vehiculo {

    protected String tipo;
    protected int numRuedas, cc,cv,peso;


    public Vehiculo(String tipo, int numRuedas, int cc, int cv, int peso) {
        this.tipo = tipo;
        this.numRuedas = numRuedas;
        this.cc = cc;
        this.cv = cv;
        this.peso = peso;
    }

    public abstract void reprogramarMotor();

    public void mostrarDatos(){
        System.out.println(tipo);
        System.out.println(numRuedas);
        System.out.println(cc);
        System.out.println(cv);
        System.out.println(peso);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
