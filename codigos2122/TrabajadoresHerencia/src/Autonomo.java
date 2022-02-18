public final class Autonomo extends Trabajador {

    private double sueldo;
    private boolean contratado;

    public Autonomo(){}
    public Autonomo(String nombre, String apellido, String dni, double sueldo, int numPagas, boolean contratado){
        super(nombre, apellido,dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo "+this.sueldo);
        System.out.println("Contratado "+this.contratado);
    }
}
