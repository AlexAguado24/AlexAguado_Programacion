public final class Jugador extends Persona{

    private String posicion;
    private double sueldo;

    public Jugador () {}
    public Jugador (String nombre, String apellido, String dni, int edad, String posicion, double sueldo) {
        super(nombre, apellido, dni, edad);
        this.posicion = posicion;
        this.sueldo = sueldo;
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posicion: "+this.posicion);
        System.out.println("Sueldo: "+this.sueldo);
    }

    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        this.sueldo += (this.sueldo * 50)/100;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
