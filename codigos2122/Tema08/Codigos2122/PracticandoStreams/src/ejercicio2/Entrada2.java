package ejercicio2;

import java.io.*;

public class Entrada2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Usuario\\Desktop\\Usuarios\\texto.txt");
        BufferedReader bufferedReader = null;
        String linea = "", textoCompleto = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer lecturaBuffer = new StringBuffer("");
            while ((linea = bufferedReader.readLine())!=null) {
                lecturaBuffer.append(linea+"\n");
            }
            textoCompleto = lecturaBuffer.toString();
            System.out.println(textoCompleto);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
