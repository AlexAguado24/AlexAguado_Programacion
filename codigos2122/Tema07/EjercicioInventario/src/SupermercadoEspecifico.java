import java.util.ArrayList;

public class SupermercadoEspecifico<V> {

    private ArrayList<V> listaCosas;

    public SupermercadoEspecifico() {
        this.listaCosas = new ArrayList();
    }

    public void registrarElemento(V elemento) {
        listaCosas.add(elemento);
    }

    public void listarDatos() {
        for (V item : listaCosas) {
            if (item instanceof Alimento) {
                ((Alimento) item).mostrarDatos();
            } else if (item instanceof Mueble) {
                ((Mueble) item).mostrarDatos();
            }
        }
    }

    public void mostrarPreciosFinales() {
        int precioFinal = 0;
        for (V item : listaCosas) {
            if (item instanceof Alimento) {
                precioFinal += ((Alimento) item).getPrecio();

            } else if (item instanceof Mueble) {
                precioFinal += ((Mueble) item).getPrecio();
            }
        }
        System.out.printf("El precio final es de %d%n", precioFinal);
    }

    public ArrayList<V> getListaCosas() {
        return listaCosas;
    }

    public void setListaCosas(ArrayList<V> listaCosas) {
        this.listaCosas = listaCosas;
    }
}
