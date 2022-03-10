public final class Accionista extends Persona implements Comision{

    private int acciones;

    public Accionista() {}

    public Accionista(String nombre, String apellido, String dni, int acciones) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: "+acciones);
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11);
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficios) {
        System.out.println("El beneficio obtenido es "+beneficios*0.30);
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

}
