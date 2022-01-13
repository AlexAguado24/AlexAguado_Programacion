package EjerciciosBasePOO;

public class Persona {

    //declaro las variables
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //contructores

    public Persona(String nombre, String apellido, String dni, int edad
            , int altura, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
    }
    public Persona (){
        nombre = "Datos por defecto";
        apellido = "Datos por defecto";
        dni = "111111111X";
    }

    //metodos
    public void mostrarDatos(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Apellido "+ apellido);
        System.out.println("dni "+ dni);
        System.out.println("Edad "+ edad);
        System.out.println("Altura "+ altura);
        System.out.println("Peso "+ peso);
    }
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
