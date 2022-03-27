import java.util.ArrayList;

public class SupermercadoEspecifico<V> {

    private ArrayList<V> listaCosas;

    public SupermercadoEspecifico() {
        this.listaCosas = new ArrayList();
    }

    public void registrarElemento(V elemento) {
        listaCosas.add(elemento);
    }

    public void mostrarPreciosFinales() {
        int precioFinal = 0;
        for (V item : listaCosas) {
            if (item instanceof Alimento) {
                precioFinal += ((Alimento) item).getPrecio();

            }
            if (item instanceof Mueble) {
                precioFinal += ((Mueble) item).getPrecio();
            }
        }
        System.out.printf("El precio final es de %d%n",precioFinal);
    }

    public ArrayList<V> getListaCosas() {
        return listaCosas;
    }

    public void setListaCosas(ArrayList<V> listaCosas) {
        this.listaCosas = listaCosas;
    }
}
