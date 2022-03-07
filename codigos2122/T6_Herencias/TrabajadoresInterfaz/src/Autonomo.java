public final class Autonomo extends Trabajador{

    private double cuota, factura;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, String departamento, double cuota, double factura) {
        super(nombre, apellido, dni, departamento);
        this.cuota = cuota;
        this.factura = factura;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: "+cuota);
        System.out.println("Factura: "+factura);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Admin.IRPF);
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getFactura() {
        return factura;
    }

    public void setFactura(double factura) {
        this.factura = factura;
    }
}
