package controller;

import com.google.gson.Gson;
import model.Name;
import model.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {
    private ArrayList<User> listaFicheros;
    public void lecturaJSONAPI(int usuarios, String genero) {
        if (listaFicheros == null){
            listaFicheros = new ArrayList();
        }
        String urlString = null;

        if (genero.equalsIgnoreCase("male")) {
            urlString = "https://randomuser.me/api/?results="+usuarios+"?gender="+genero;
        } else if (genero.equalsIgnoreCase("female")){
            urlString = "https://randomuser.me/api/?results="+usuarios+"?gender="+genero;
        } else {
            urlString = "https://randomuser.me/api/?results="+usuarios+"?gender="+genero;
        }

        try {
            URL url = new URL (urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = null;
            StringBuffer stringBuffer = new StringBuffer();
            while ((linea = buffer.readLine())!=null){
                stringBuffer.append(linea);
            }
            String lecturaCompleta = stringBuffer.toString();

            JSONObject objectoJSON = new JSONObject(lecturaCompleta);
            JSONArray arrayResults = objectoJSON.getJSONArray("results");
            for (int i = 0; i < arrayResults.length(); i++) {
                JSONObject objectoResult = arrayResults.getJSONObject(0);
                JSONObject name = objectoResult.getJSONObject("name");
                Gson gson = new Gson();
                Name nameJava = gson.fromJson(name.toString(),Name.class);
                System.out.println(nameJava.getFirst());
                System.out.println(nameJava.getLast());
                System.out.println(nameJava.getTitle());
                String mail = objectoResult.getString("email");
                System.out.println(mail);
                String imagen = objectoResult.getJSONObject("picture").getString("large");
                listaFicheros.add(new User(imagen,mail,nameJava));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void escribirUsuarios(){
        File file = new File("src/main/resources/usuarios.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaFicheros);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerFicheros () {

        File file = new File("src/main/resources/usuarios.bin");
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            listaFicheros = (ArrayList<User>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
