public final class Entrenador extends Persona{

    private String vocacion;
    private double sueldo;

    public Entrenador(){}
    public Entrenador(String nombre, String apellido, String dni, int edad, String vocacion, double sueldo){
        super(nombre, apellido, dni, edad);
        this.sueldo = sueldo;
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Vocacion: "+this.vocacion);
        System.out.println("Sueldo: "+this.sueldo);
    }

    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        this.sueldo += (this.sueldo*25)/100;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
