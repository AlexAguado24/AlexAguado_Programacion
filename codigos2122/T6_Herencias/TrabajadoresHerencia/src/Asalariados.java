public final class Asalariados extends Trabajadores{

    private double sueldo;
    private int numPagas;
    private boolean contratado;

    public Asalariados (){}
    public Asalariados (String nombre, String apellido, String dni, double sueldo, int numPagas, boolean contratado){
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: "+this.sueldo);
        System.out.println("Numero Pagas: "+this.numPagas);
        System.out.println("Contratado: "+this.contratado);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
