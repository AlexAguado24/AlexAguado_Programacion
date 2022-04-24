package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosController {
    ArrayList<Usuario> listaUsuarios;

    public UsuariosController() {
        listaUsuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void escribirUsuario() {
        File file = new File("src/resources/usuario.bin");
        ObjectOutputStream oop = null;

        try {
            oop = new ObjectOutputStream(new FileOutputStream(file));
            for (Usuario item : listaUsuarios) {
                oop.writeObject(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oop != null) {
                    oop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrarDatosUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
    }

    public void lecturaUsuario() {
        File file = new File("src/resources/usuario.bin");
        ObjectInputStream oip = null;

        try {
            oip = new ObjectInputStream(new FileInputStream(file));
            Usuario item;
            try {
                while ((item = (Usuario) oip.readObject())!= null){
                    mostrarDatosUsuario(item);
                }
            } catch (EOFException e){
                System.out.println("Fichero terminado");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oip != null) {
                    oip.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
