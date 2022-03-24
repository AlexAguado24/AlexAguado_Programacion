public class Mueble<T,S> implements Inventariable<S>{

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
    public S calcularPrecio() {
        this.precio += precio * (int)Inventariable.ivaMuebles;
        System.out.println(precio);
        return null;
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
