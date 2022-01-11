public class Coche {

    public String marca, modelo, matricula;
    public int numBastidor, precio;

    public Coche(String marca, int precio, String modelo){
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public Coche(int precio, String matricula, String marca){
        this.precio = 2000;
        this.matricula = matricula;
        this.marca = marca;
    }

    // getter y setter

    /*public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        return this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        modelo = modelo;
    }*/
}
