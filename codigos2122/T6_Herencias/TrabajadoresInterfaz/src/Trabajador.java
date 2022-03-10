public abstract class Trabajador extends Persona{

    protected double sueldo;
    protected Departamento departamento;

    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni,double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo; "+sueldo);
        System.out.println("Departamento: "+departamento.getNombre());
    }

    public abstract void calcularSueldo();

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
