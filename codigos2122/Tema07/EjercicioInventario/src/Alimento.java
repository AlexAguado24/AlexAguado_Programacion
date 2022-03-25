public class Alimento<T,S> implements Inventariable<S>{

    protected String calidad, origen;
    protected int precio;

    public Alimento (String calidad,String origen,int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
        calcularPrecio();
    }

    public void mostrarDatos () {
        System.out.println(calidad);
        System.out.println(origen);
        System.out.println(precio);
    }

    @Override
    public void calcularPrecio() {
        this.precio += precio * (int)Inventariable.ivaAlimentos;
        System.out.println(precio);
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
