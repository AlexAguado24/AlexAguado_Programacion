package controller;

import model.Usuario;

import java.io.*;
import java.util.Scanner;

public class UsuariosController {
    public void escribirUsuarios () {
        Scanner in = new Scanner(System.in);
        File file = new File("src/resources/usuario_ejercicio.bin");
        //Cerrarlo
        ObjectOutputStream oos = null;
        int opcion = 0;
        Usuario usuario = new Usuario();
        do {

            try {
                oos = new ObjectOutputStream(new FileOutputStream(file));
                System.out.println("Introduce los datos del usuario");
                System.out.println("Nombre");
                usuario.setNombre(in.next());
                System.out.println("Apellido");
                usuario.setApellido(in.next());
                System.out.println("Password");
                usuario.setPassword(in.next());
                oos.writeObject(usuario);
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
            System.out.println("¿Quieres añadir otro usuario? (1- si/ 2- no)");
            opcion = in.nextInt();
        } while (opcion != 2);

    }
}
