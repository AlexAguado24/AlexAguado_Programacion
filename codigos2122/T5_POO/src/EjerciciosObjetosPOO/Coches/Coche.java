package EjerciciosObjetosPOO.Coches;

public class Coche {

    //variables
    private Motor motor;
    private String marca, modelo;
    private double precioAverias;

    // constructores
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        // costeAverias = 0.0; (Por defecto)
    }

    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    //metodos
    public void acumularAveria (double costeAveria){
        this.precioAverias += costeAveria;
    }

    //getters

    public double getPrecioAverias() {
        return precioAverias;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precioAverias;
    }

    //setters

}
