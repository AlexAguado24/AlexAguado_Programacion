package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class BinariosController {

    private ArrayList<Usuario> listaUsuarios;

    public BinariosController(){
        listaUsuarios = new ArrayList<>();
    }

    public void addUsuario (String nombre, String apellido, String pass){
        this.listaUsuarios.add(new Usuario(nombre,apellido,pass));
    }

    public void escribirBinario(){
        File file = new File("src/resources/usuarios.bin");
        //Cerrarlo!!!
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(listaUsuarios);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void lecturaBinario(boolean lectura){
        File file = new File("src/resources/usuarios1.bin");

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario item = null;
            try {
                if (!lectura) {
                    listaUsuarios = (ArrayList<Usuario>) ois.readObject();
                } else {
                    while ((item = (Usuario) ois.readObject())!=null){
                        mostrarDatos(item);
                    }
                }
            } catch (EOFException e){
                System.out.println("Fichero terminado");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }  finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
    public void mostrarDatos(Usuario usuario){
        System.out.println("Nombre: "+ usuario.getNombre());
        System.out.println("Apellido: "+ usuario.getApellido());
    }
    public void existeFichero(){
        File file = new File("src/resources/usuarios1.bin");

        if (file.exists()) {
            lecturaBinario(false);
        }
    }
}
