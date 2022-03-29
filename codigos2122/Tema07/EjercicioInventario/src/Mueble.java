public abstract class Mueble implements Inventariable{

    protected String material, peso;
    protected double precio;

    public Mueble(String material, String peso, double precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println(material);
        System.out.println(peso);
        System.out.println(precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.ivaMuebles));
        System.out.println("El precio es de "+precio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
