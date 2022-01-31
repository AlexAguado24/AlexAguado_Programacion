package EjerciciosObjetosPOO.EjercicioCarrera;

public class Coche {

    //variables
    private int cv, velocidad;
    private String matricula, modelo;
    private double kilometrosRecorridos;

    //constructores
    public Coche (){
        this.cv = cv;
        this.velocidad = velocidad;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Coche (String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }


    //metodos
    public void acelerar (int velocidad){
        this.velocidad += velocidad;
        int incKilometros = velocidad * ((cv)* (int)(Math.random()*11)+1);
        this.kilometrosRecorridos += incKilometros;
        final int VelMaxima = 180;
        if ( velocidad > VelMaxima ){
            velocidad = VelMaxima;
            System.out.print("La velocidad maxima del coche es" + velocidad + ", no puede ir mas rapido");
        }
    }

    public void frenar (int velocidadDeEntrada) {

        final int VelocidadMinima = 0;
        velocidad = velocidadDeEntrada;
        if (velocidad < VelocidadMinima) {
            velocidad = VelocidadMinima;
            System.out.println("No puedo reducir tanto la velocidad");
        }
    }

    public  void parar () {
        velocidad = 0;
    }

    public void resetear (){
        cv = 0;
        velocidad = 0;
    }

    public void mostrarDatos () {
        System.out.println("Matricula: "+ matricula);
        System.out.println("Modelo: "+ modelo);
        System.out.println("CV: "+ cv);
        System.out.println("Velocidad: "+ velocidad);
        System.out.println("Kilometros: "+ kilometrosRecorridos);
    }

    //getters y setters


    public int getCv() {
        return cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setCv (int cv) {

    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}
