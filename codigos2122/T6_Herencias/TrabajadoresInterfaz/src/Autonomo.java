public final class Autonomo extends Trabajador{

    private double cuota, factura;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, Departamento departamento, double cuota, double factura) {
        super(nombre, apellido, dni, departamento);
        this.cuota = cuota;
        this.factura = factura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void calcularSueldo() {

    }
}
