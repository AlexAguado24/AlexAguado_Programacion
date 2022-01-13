package EjerciciosBasePOO;

public class Persona {

    //declaro las variables
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //contructores

    public Persona(){
        nombre = "Pepe";
        apellido = "Garcia";
        dni = "47878912P";
        edad = 20;
        altura = 180;
        peso = 75.3;
    }

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido, String dni, int edad
            , int altura, double peso ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        

    }

    //metodos
    //getters y setters

    //getters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDni(){
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
