public abstract class Trabajador extends Persona{

    protected double sueldo;
    protected String departamento;

    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni, String departamento) {
        super(nombre, apellido, dni);
        this.departamento = departamento;
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo; "+sueldo);
        System.out.println("Departamento: "+departamento);
    }

    public abstract void calcularSueldo();

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
