package controllerBin;

import model.Personaje;

import java.io.*;

public class LecturaBinario {

    public void mostrarDatos (Personaje personaje){
        System.out.println(personaje.getName());
        System.out.println(personaje.getPhoto());
    }

    public void controladorBinario(){
        File file = new File("src/main/resources/personajes.bin");

        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            Personaje personaje = null;

            while ((personaje = (Personaje) objectInputStream.readObject())!=null){
                mostrarDatos(personaje);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
