public final class PedidoComida extends ConsumicionGenerica implements Constantes{

    private Enum<Comidas> comida;

    public PedidoComida() {}

    public PedidoComida(double precio, int numConsumiciones, Enum<Comidas> comida) {
        super(precio, numConsumiciones);
        this.comida = comida;
    }

    @Override
    public void calcularPrecioReal () {
        setPrecio(precio + (precio*Constantes.IVA_COMIDAS));
    }

    @Override
    public void verFactura () {
        System.out.println("Los datos de la factura son " +
                "NºConsumiciones: "+ getNumConsumiciones()+
                "Precio: "+ getPrecio()+
                "CIF: "+Constantes.CIF);
    }

    public Enum<Comidas> getComida() {
        return comida;
    }

    public void setComida(Enum<Comidas> comida) {
        this.comida = comida;
    }
}
