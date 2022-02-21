public final class Autonomos extends Trabajadores{

    private double sueldo;
    private boolean contratado;

    public Autonomos (){}
    public Autonomos (String nombre, String apellido, String dni, double sueldo, boolean contratado){
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: "+this.sueldo);
        System.out.println("Contratado: "+this.contratado);
    }


}
