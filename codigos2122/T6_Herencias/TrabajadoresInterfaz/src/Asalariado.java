public final class Asalariado extends Trabajador{

    private int numPagas;

    public Asalariado() {}

    public Asalariado(String nombre, String apellido, String dni, String departamento, int numPagas) {
        super(nombre, apellido, dni, departamento);
        this.numPagas = numPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de Pagas: "+numPagas);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Admin.IRPF);
    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }
}
