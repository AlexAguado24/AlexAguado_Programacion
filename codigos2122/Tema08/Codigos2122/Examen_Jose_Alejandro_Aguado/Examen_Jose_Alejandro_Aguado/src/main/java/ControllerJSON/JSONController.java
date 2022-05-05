package ControllerJSON;

import com.google.gson.Gson;
import model.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {

    private ArrayList<Pelicula> cartelera, proximamente;

    public void mostrarOpcion(int opcion){
        if (opcion == 1){
            JSONCartelera();
        } else if (opcion == 2) {
            JSONProximamente();
        } else {
            System.out.println("Opcion incorrecta");
        }


    }

    public void JSONCartelera() {

        cartelera = new ArrayList<>();
        String urlCartelera = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlCartelera);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String linea = null;

            while ((linea = bufferedReader.readLine())!= null){
                builder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(builder.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objectoResultado = arrayResultados.getJSONObject(i);
                String titulo = objectoResultado.getString("title");
                System.out.println("Titulo: "+titulo);
                String fecha = objectoResultado.getString("release_date");
                System.out.println("Fecha de lanzamiento: "+fecha);
                String descripcion = objectoResultado.getString("overview");
                System.out.println("Descripcion: "+descripcion);
                String poster = objectoResultado.getString("poster_path");
                poster = "https://image.tmdb.org/t/p/w500/"+poster;
                System.out.println("Poster: "+poster);

                Gson gson = new Gson();
                Pelicula pelicula = gson.fromJson(objectoResultado.toString(),Pelicula.class);
                cartelera.add(pelicula);
            }

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

    }

    public void JSONProximamente() {
        proximamente = new ArrayList<>();
        String urlProximamente = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlProximamente);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String linea = null;

            while ((linea = bufferedReader.readLine())!= null){
                builder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(builder.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objectoResultado = arrayResultados.getJSONObject(i);
                String titulo = objectoResultado.getString("title");
                System.out.println("Titulo: "+titulo);
                String fecha = objectoResultado.getString("release_date");
                System.out.println("Fecha de lanzamiento: "+fecha);
                String descripcion = objectoResultado.getString("overview");
                System.out.println("Descripcion: "+descripcion);
                String poster = objectoResultado.getString("poster_path");
                poster = "https://image.tmdb.org/t/p/w500/"+poster;
                System.out.println("Poster: "+poster);

                Gson gson = new Gson();
                Pelicula pelicula = gson.fromJson(objectoResultado.toString(),Pelicula.class);
                proximamente.add(pelicula);

            }


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
    }

    public void escribirFicheroCartelera(){
        File file = new File("src/main/resources/cartelera.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(cartelera);
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
    public void escribirFicheroProximamente(){
        File file = new File("src/main/resources/proximamente.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(proximamente);
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

}
