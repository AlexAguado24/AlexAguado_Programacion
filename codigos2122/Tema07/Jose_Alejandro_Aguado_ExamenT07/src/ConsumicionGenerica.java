public abstract class ConsumicionGenerica<T> {

    protected double precio;
    protected int numConsumiciones;

    public ConsumicionGenerica() {}

    public ConsumicionGenerica(double precio, int numConsumiciones) {
        this.precio = precio;
        this.numConsumiciones = numConsumiciones;
        calcularPrecioReal();
    }

    public abstract void calcularPrecioReal();

    public abstract void verFactura();

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumConsumiciones() {
        return numConsumiciones;
    }

    public void setNumConsumiciones(int numConsumiciones) {
        this.numConsumiciones = numConsumiciones;
    }
}
