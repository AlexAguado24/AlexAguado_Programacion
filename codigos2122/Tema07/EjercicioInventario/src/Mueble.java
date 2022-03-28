public class Mueble<V> implements Inventariable{

    protected String material, peso;
    protected int precio;

    public Mueble(String material, String peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
        calcularPrecio();
    }

    public void mostrarDatos(){
        System.out.println(material);
        System.out.println(peso);
        System.out.println(precio);
    }

    @Override
    public void calcularPrecio() {
        this.precio += precio * Inventariable.ivaMuebles;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
