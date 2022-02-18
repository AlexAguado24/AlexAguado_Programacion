public final class Asalariado extends Trabajador {

    private double sueldo;
    private boolean contratado;
    private int numPagas;

    public Asalariado(){}
    public Asalariado(String nombre, String apellido, String dni, double sueldo, int numPagas, boolean contratado){
        super(nombre, apellido,dni);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo "+this.sueldo);
        System.out.println("Numero de Pagas "+this.numPagas);
        System.out.println("Contratado "+this.contratado);
    }
}
