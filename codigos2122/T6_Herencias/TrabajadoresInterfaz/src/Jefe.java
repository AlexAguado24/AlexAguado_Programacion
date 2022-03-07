public final class Jefe extends Trabajador implements Comision{

    private int trabajadores;
    private double beneficios;
    private int voto;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni, String departamento,int trabajadores) {
        super(nombre, apellido, dni, departamento);
        this.trabajadores = trabajadores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Admin.IRPF);
    }

    @Override
    public void votar(int voto) {
        this.voto = (int)(Math.random()*6)/3;
    }

    @Override
    public void repatirBeneficios() {
        this.beneficios = this.beneficios * 0.25;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }
}
