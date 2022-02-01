package EjerciciosObjetosPOO.CajeroBase;

import java.util.ArrayList;

public class Cliente {

    //Variables
    private String dni, nombre;
    private int telefono;
    private ArrayList<Cuenta> listaCuentas;

    //Constructores

    public Cliente() {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaCuentas = new ArrayList();
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

    //Metodos

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Telefono: " + this.telefono);
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public ArrayList getListaCuentas() {
        return listaCuentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setListaCuentas(ArrayList listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}
