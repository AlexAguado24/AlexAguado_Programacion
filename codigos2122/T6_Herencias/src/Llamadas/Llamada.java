package Llamadas;

public abstract class Llamada {

    protected int nOrigen, nDestino, duracion;
    protected double  coste;

    public Llamada(){}
    public Llamada(int nOrigen, int nDestino, int duracion){
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        calcularCoste();
    }

    protected abstract void calcularCoste();

    public  void mostrarDatos(){
        System.out.println("Nº Origen " + nOrigen);
        System.out.println("Nº Destino " + nDestino);
        System.out.println("Duracion " + duracion);
        System.out.println("Coste " + coste);
    }

    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
