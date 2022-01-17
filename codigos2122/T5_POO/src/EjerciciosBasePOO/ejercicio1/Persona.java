package EjerciciosBasePOO.ejercicio1;

public class Persona {

    //declaro las variables o propiedades (atributos)
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //contructores

    public Persona(String nombre, String apellido, String dni, int edad
            , int altura, double peso){
        //pongo this. por que las variables se llaman igual
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
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona (){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "111111111X";
    }

    //metodos
    public void mostrarDatos(){
        System.out.printf("Nombre: %s%nApellidos: %s%nEdad %d%n", nombre, apellido, edad);
    }

    protected void metodoProtected(){

    }

    public static void metodoStatic(){

    }
    public void incrementarEdad (int edadIncremento) {
        this.edad += edadIncremento;
    }
    public double calcularIMC(){

        double imc = this.peso / Math.pow(this.altura,2);

        return imc;
    }

    public String estadoIMC (){
        final double IMC = calcularIMC()*10000;
        String estado="";
        if(IMC<18.5){
            estado = "Peso inferior a normal";
        } else if (IMC > 18.5 && IMC <24.9){
            estado = "Normal";
        } else if  (IMC >= 25 && IMC <19.9){
            estado = "Peso superior al normal";
        } else {
            estado = "Obesidad";
        }
        return estado;
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
