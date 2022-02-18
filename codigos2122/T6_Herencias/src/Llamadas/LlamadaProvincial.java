package Llamadas;

public final class LlamadaProvincial extends Llamada{

    public LlamadaProvincial(){}

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion){
        super(nOrigen,nDestino,duracion);
    }

    @Override
    public void calcularCoste() {
        this.coste = this.duracion * 0.15;
    }
}
