public abstract class Trabajador extends Persona{

    protected int sueldo;


    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni, Departamento departamento) {
        super(nombre, apellido, dni);
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo; "+sueldo);
    }

    public abstract void calcularSueldo();

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
