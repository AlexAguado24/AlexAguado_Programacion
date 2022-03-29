public abstract class Alimento implements Inventariable{

    protected String calidad, origen;
    protected double precio;

    public Alimento (String calidad,String origen,double precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    public void mostrarDatos () {
        System.out.println(calidad);
        System.out.println(origen);
        System.out.println(precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.ivaAlimentos));
        System.out.println("El precio es de "+precio);
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
