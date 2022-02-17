package Llamadas;

public final class LlamadaProvincial extends Llamada{

    public LlamadaProvincial(){}

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion, double coste){
        super(nOrigen,nDestino,duracion,coste);
    }

    @Override
    public void calcularCoste() {
        this.coste = this.duracion * 0.15;
    }
}
