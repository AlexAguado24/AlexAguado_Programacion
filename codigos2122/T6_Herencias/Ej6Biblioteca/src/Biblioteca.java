import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElemento;
    private int numSocios = 0;

    public Biblioteca() {
        listaElemento = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void addPersona(Persona p) {
        if (p instanceof Socio) {
            ((Socio) p).setNumSocio(numSocios++);
        } else {
            listaPersonas.add(p);
        }
    }

    public void addAlquilable(Prestar prestable) {
        this.listaElemento.add((Elemento) prestable);
    }

    public void realizarPrestamo(Socio socio, Prestar prestable) {
        if (((Elemento) prestable).isEstado()) {
            socio.getPrestamos().add(prestable);
            prestable.prestar();
        }
    }

    public void realizarDevolucion(Socio socio, Prestar prestable) {
        socio.getPrestamos().remove(prestable);
        prestable.devolver();
    }

    public void listarPersona() {
        for (Persona item : listaPersonas) {
            item.mostrarDatos();
        }
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Elemento> getListaElemento() {
        return listaElemento;
    }

    public void setListaElemento(ArrayList<Elemento> listaElemento) {
        this.listaElemento = listaElemento;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }
}
