public final class Accionista extends Persona implements Comision{

    private int acciones, voto;
    private double beneficios;

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
    public void votar(int voto) {
        this.voto = (int)(Math.random()*6);
    }

    @Override
    public void repatirBeneficios() {
        this.beneficios = this.beneficios * 0.60;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

}
