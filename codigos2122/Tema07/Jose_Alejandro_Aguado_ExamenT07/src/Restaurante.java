import java.util.ArrayList;

public final class Restaurante<T> {

    private String nombre;
    private int numComensalesTotales;
    private ArrayList<T> listaPedidos;
    private double caja;

    public Restaurante() {
        this.listaPedidos = new ArrayList<>();
    }

    public Restaurante(String nombre, int numComensalesTotales, double caja) {
        this.nombre = nombre;
        this.numComensalesTotales = numComensalesTotales;
        this.caja = caja;
        this.listaPedidos = new ArrayList<>();
    }

    public void colocarComensales(int numero) {
        try {
            setNumComensalesTotales(numComensalesTotales + numero);
            if (numComensalesTotales >= 50) {
                throw new ExcepcionComensales("Hay un problema con la orden");
            }
        } catch (ExcepcionComensales e) {
            System.out.println(e.getMessage());
            System.out.println("El restaurante esta lleno");
        }
    }

    public void registrarPedido(T pedido) {
        listaPedidos.add(pedido);
        if (pedido instanceof PedidoComida) {
            setCaja(caja + ((PedidoComida) pedido).getPrecio());
        }
        if (pedido instanceof ConsumicionBarra) {
            setCaja(caja + ((ConsumicionBarra) pedido).getPrecio());
        }
    }

    public void verPedidos() {
        for (T item : listaPedidos) {
            if (item instanceof PedidoComida) {
                ((PedidoComida) item).verFactura();
            }
            if (item instanceof ConsumicionBarra) {
                ((ConsumicionBarra) item).verFactura();
            }
        }
        System.out.println("El total registrado en la caja es de " + getCaja());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumComensalesTotales() {
        return numComensalesTotales;
    }

    public void setNumComensalesTotales(int numComensalesTotales) {
        this.numComensalesTotales = numComensalesTotales;
    }

    public ArrayList<T> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<T> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

}
