package EjerciciosObjetosPOO.CajeroBase;

public class Cuenta {

    //variables
    private int id, pin;
    private double saldo;
    private Cliente cliente;


    //constructores
    public Cuenta (){
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Cuenta (Cliente cliente, int pin,double saldo){
        this.cliente = new Cliente(cliente.getDni());
        this.pin = pin;
        this.saldo = saldo;
    }

    //metodos
    /*public boolean datosCorrectos (Cliente cliente, int pin) {

    }*/

    public void ingresarDinero (String dni, int pin, double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No puedes ingresar esa cantidad");
        }
    }

    public void sacarDinero (String dni, int pin, double cantidad){
        saldo -= cantidad;
        final int cantidadMinima = 0;
        if (saldo < cantidadMinima){
            System.out.println("No puedes sacar tanto dinero");
        }
    }

    public void verResumen () {

    }



    //getters y setters

    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
