import java.util.ArrayList;

public class SupermercadoEspecifico<T> {

    private ArrayList<T> listaCosas;

    public SupermercadoEspecifico() {
        this.listaCosas = new ArrayList();
    }

    public void registrarElemento(T elemento) {
        listaCosas.add(elemento);
    }

    public void mostrarPreciosFinales() {
        int precioFinal = 0;
        for (T item : listaCosas) {
            if (item instanceof Alimento) {
                precioFinal += ((Alimento) item).getPrecio();
            }
            if (item instanceof Mueble) {
                precioFinal += ((Mueble) item).getPrecio();
            }
        }
    }

    public ArrayList<T> getListaCosas() {
        return listaCosas;
    }

    public void setListaCosas(ArrayList<T> listaCosas) {
        this.listaCosas = listaCosas;
    }
}
