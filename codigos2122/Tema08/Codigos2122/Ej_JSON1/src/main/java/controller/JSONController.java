package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;


public class JSONController {

    public void JSONUsers (){
        Scanner in = new Scanner(System.in);
        int usuarios;
        String genero = "";
        String urlString;

        System.out.printf("Cuantos usuarios quieres cargar?");
        usuarios = in.nextInt();
        System.out.printf("Indica el genero, male o female");
        genero = in.next();
        if (genero.equalsIgnoreCase("male") || genero.equalsIgnoreCase("female")) {
            urlString = "https://randomuser.me/api/?results=" + usuarios+ "&gender="+genero;
        } else {
            urlString = "https://randomuser.me/api/?results=" + usuarios;
        }

        BufferedReader bufferedReader = null;
        try {

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea  = null;

            while ((linea = bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultados = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                JSONObject name = objetoResultado.getJSONObject("name");
                String titulo = name.getString("title");
                String primero = name.getString("first");
                String ultimo = name.getString("last");

                System.out.printf(titulo);
                System.out.printf(primero);
                System.out.printf(ultimo);

                String ciudad = objetoResultado.getString("city");
                System.out.printf(ciudad);
                String pais = objetoResultado.getString("country");
                System.out.printf(pais);

                String mail = objetoResultado.getString("email");
                System.out.printf(mail);


            }

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
