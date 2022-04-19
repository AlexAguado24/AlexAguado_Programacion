public final class ConsumicionBarra extends ConsumicionGenerica{

    Bebidas tipoBebidas;

    public ConsumicionBarra() {}

    public ConsumicionBarra(double precio, int numConsumiciones, Bebidas bebidas) {
        super(precio, numConsumiciones);
        this.tipoBebidas = bebidas;

    }

    @Override
    public void calcularPrecioReal() {
        setPrecio(precio + (precio*Constantes.IVA_BEBIDAS));
    }

    @Override
    public void verFactura() {
        System.out.println("Los datos de la factura son " +
                "NºConsumiciones: "+ getNumConsumiciones()+
                "Bebidas: "+ tipoBebidas.name()+
                "Precio: "+ getPrecio()+
                "CIF: "+Constantes.CIF);
    }

    public Enum<Bebidas> getTipoBebidas() {
        return tipoBebidas;
    }

    public void setTipoBebidas(Bebidas tipoBebidas) {
        this.tipoBebidas = tipoBebidas;
    }
}
