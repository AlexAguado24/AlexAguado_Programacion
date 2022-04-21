package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        File file = new File("src/resources/objetos.bin");
        //Cerrarlo!!!
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new Usuario("Alex","Aguado","12345A"));
            oos.writeObject(new Usuario("Mario","Herrera","234567"));
            oos.writeObject(new Usuario("jorgito","gonzalez","34568d"));
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
    public void lecturaBinario(){
        File file = new File("src/resources/objetos.bin");

        //Cerrarlo!!!
        ObjectInputStream ois = null;
        Usuario usuario = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            try {
                while ((usuario = (Usuario) ois.readObject()) != null) {
                    System.out.println(usuario.toString());
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

}
