public final class Autonomo extends Trabajador{

    private double cuota;
    private String factura;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni,double sueldo, Departamento departamento, double cuota, String factura) {
        super(nombre, apellido, dni,sueldo, departamento);
        this.cuota = cuota;
        realizarFactura();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: "+cuota);
        System.out.println("Factura: "+factura);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (cuota+(cuota*Admin.IVA))-(this.sueldo * Admin.IRPF);
    }

    public void realizarFactura (){
        this.factura = String.format("Factura realizada por un importe de %.2f a la empresa con CIF %s",this.sueldo, Admin.cif);
                ;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
