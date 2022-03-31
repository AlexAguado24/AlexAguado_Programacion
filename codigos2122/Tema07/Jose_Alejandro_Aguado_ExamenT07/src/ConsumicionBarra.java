public final class ConsumicionBarra extends ConsumicionGenerica{

    private Enum<Bebidas> bebidas;

    public ConsumicionBarra() {}

    public ConsumicionBarra(double precio, int numConsumiciones, Enum<Bebidas> bebidas) {
        super(precio, numConsumiciones);
        this.bebidas = bebidas;
    }

    @Override
    public void calcularPrecioReal() {
        setPrecio(precio + (precio*Constantes.IVA_BEBIDAS));
    }

    @Override
    public void verFactura() {
        System.out.println("Los datos de la factura son " +
                "NºConsumiciones: "+ getNumConsumiciones()+
                "Precio: "+ getPrecio()+
                "CIF: "+Constantes.CIF);
    }

    public Enum<Bebidas> getBebidas() {
        return bebidas;
    }

    public void setBebidas(Enum<Bebidas> bebidas) {
        this.bebidas = bebidas;
    }
}
