package Llamadas;

public final class LlamadaNacional extends Llamada {

    private int franja;

    public LlamadaNacional(){}

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, int franja, double coste){
        super(nOrigen,nDestino,duracion,coste);
        this.franja = franja;
    }

    @Override
    public void calcularCoste() {
        if (this.franja == 1) {
            this.coste = this.duracion * 0.20;
        }
        if (this.franja == 2) {
            this.coste = this.duracion * 0.25;
        }
        if (this.franja == 3) {
            this.coste = this.duracion * 0.30;
        }
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
