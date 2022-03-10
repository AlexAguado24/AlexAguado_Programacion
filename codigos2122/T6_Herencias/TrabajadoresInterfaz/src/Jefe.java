public final class Jefe extends Trabajador implements Comision{

    private int trabajadores;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni,double sueldo, Departamento departamento,int trabajadores) {
        super(nombre, apellido, dni,sueldo,departamento);
        this.trabajadores = trabajadores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trabajadores: "+trabajadores);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/3;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficios) {
        this.sueldo += (beneficios * 0.10);
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }
}
