package Llamadas;

public final class LlamadaLocal extends Llamada {

    public LlamadaLocal(){}

    public LlamadaLocal(int nOrigen, int nDestino, int duracion, double coste){
        super(nOrigen,nDestino,duracion);
    }

    @Override
    public void calcularCoste(){
        coste = 0;
    }
}
