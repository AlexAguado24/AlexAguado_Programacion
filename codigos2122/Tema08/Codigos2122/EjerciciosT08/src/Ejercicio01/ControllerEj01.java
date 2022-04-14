package Ejercicio01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerEj01 {

    Scanner in = new Scanner(System.in);
    Usuario usuario = new Usuario();
    ArrayList<Usuario> datosUsuario = new ArrayList<>();

    public void crearFichero (int datosFichero) {


        try {
            FileOutputStream nuevo_usuario = new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Usuarios\\nuevo_usuario.txt");



        } catch (IOException e){

        }

    }

    public void crearUsuario() {
        String respuesta = "";
        do {
            System.out.println("Nombre: ");
            usuario.setNombre(in.next());
            System.out.println("Apellido: ");
            usuario.setApellido(in.next());
            System.out.println("DNI: ");
            usuario.setDni(in.next());
            System.out.println("Telefono: ");
            usuario.setTelefono(in.nextInt());
            System.out.println("Edad: ");
            usuario.setEdad(in.nextInt());
            datosUsuario.add(usuario);
            System.out.println("¿Quieres introducir otro usuario?");
            respuesta = in.next();
        } while (respuesta.equalsIgnoreCase("si"));
    }

    class Usuario {
        private String nombre, apellido, dni;
        private int telefono, edad;

        public Usuario() {
        }

        public Usuario(String nombre, String apellido, String dni, int telefono, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.telefono = telefono;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}
