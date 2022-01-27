package EjerciciosObjetosPOO.Agenda;

public class Persona {
    //variables
    private int telefono;
    private String dni, nombre, apellido;

    //constructores

    public Persona(){}

    public Persona (String dni, String nombre,int telefono){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //metodos
    public void mostrarDatos (){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Telefono: "+this.telefono);
    }
    //getters y setters

    public int getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
