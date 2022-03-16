import java.util.ArrayList;

public final class Socio extends Persona {

    private int numSocio;
    private ArrayList<Prestar> prestamos;

    public Socio() {
    }

    public Socio(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.numSocio = numSocio;
        this.prestamos = new ArrayList();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de socio: " + numSocio);
        for (Object item : prestamos) {

        }
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public ArrayList getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList prestamos) {
        this.prestamos = prestamos;
    }
}
