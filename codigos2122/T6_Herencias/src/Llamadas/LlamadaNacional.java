package Llamadas;

public final class LlamadaNacional extends Llamada {

    private int franja;

    public LlamadaNacional(){}

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, int franja, double coste){
        super(nOrigen,nDestino,duracion);
        this.franja = franja;
        mostrarDatos();
    }

    @Override
    public void calcularCoste() {
        switch (franja){
            case 1:
                this.coste = this.duracion * 0.20;
                break;
            case 2:
                this.coste = this.duracion * 0.25;
                break;
            case 3:
                this.coste = this.duracion * 0.30;
                break;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja "+ + franja);;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
