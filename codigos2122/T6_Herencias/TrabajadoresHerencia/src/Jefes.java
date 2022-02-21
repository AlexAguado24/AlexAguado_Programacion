public final class Jefes extends Trabajadores{

    private int acciones;
    private double beneficios;

    public Jefes (){}
    public Jefes (String nombre, String apellido, String dni, int acciones, double beneficios){
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficios = beneficios;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: "+this.acciones);
        System.out.println("Beneficios: "+this.beneficios);
    }

    public void despedir(){

    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
}
