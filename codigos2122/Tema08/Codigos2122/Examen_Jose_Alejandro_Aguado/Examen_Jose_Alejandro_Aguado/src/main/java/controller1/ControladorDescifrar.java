package controller1;

import java.io.*;

public class ControladorDescifrar {

    public void descifrarCodigo(File file){
        BufferedReader bufferedReader = null;
        String linea = "";
        String lecturaCompleta = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((linea = bufferedReader.readLine())!= null){
                System.out.printf(linea);
                lecturaCompleta += linea+" ";
            }

            System.out.print(lecturaCompleta);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(lecturaCompleta);

        String[] letras = lecturaCompleta.split("");

        for (String letra :letras) {
            int codigo = letra.charAt(0);
            int codigoDescifrado = codigo/2;
            char letraDescifrada = (char) codigoDescifrado;
            System.out.print(letraDescifrada);
        }

    }
}
