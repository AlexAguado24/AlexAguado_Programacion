public final class Jefe extends Trabajador{

    private int acciones, beneficios;

    public Jefe () {}
    public Jefe (String nombre, String apellido, String dni, int acciones, int beneficios) {
        super(nombre, apellido,dni);
        this.acciones = acciones;
        this.beneficios = beneficios;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones "+this.acciones);
        System.out.println("Beneficios "+this.beneficios);
    }
}
