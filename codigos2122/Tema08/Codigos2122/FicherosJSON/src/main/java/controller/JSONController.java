package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import model.Asignaturas;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.print.attribute.standard.JobSheets;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {
    private ArrayList<Asignaturas> listaAsignaturas;

    public void leerFicheroJSON() {
        File file = new File("src/main/resources/Persona.json");

        BufferedReader br = null;
        StringBuffer lineaCompleta;

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = br.readLine()) != null) {
                lecturaCompleta.append(linea);
            }

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());

            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");

            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);

                Gson gson = new Gson();

                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(), Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                System.out.println(conocimientoJava.getExperiencia());
                for (String item : conocimientoJava.getDetalles()) {
                    System.out.println(item);
                }

                /*String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println(concepto);
                System.out.println(experiencia);
                System.out.println("Los detalles del conocimiento "+concepto+" son: ");
                JSONArray detalles = conocimiento.getJSONArray("detalle");
                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(i);
                    System.out.println(detalle);
                }*/
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void leerJSONAsignaturas(String ciclo, int curso) {
        listaAsignaturas = new ArrayList<>();
        File file = new File("src/main/resources/asignatura.json");

        BufferedReader br = null;
        String linea = null;
        StringBuffer lineaCompleta = new StringBuffer();

        try {
            br = new BufferedReader(new FileReader(file));
            while ((linea = br.readLine()) != null) {
                lineaCompleta.append(linea);
            }

            JSONObject jsonAsignaturas = new JSONObject(lineaCompleta.toString());

            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");

            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asignaturaJSON = asignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignaturas asignatura = gson.fromJson(asignaturaJSON.toString(), Asignaturas.class);
                listaAsignaturas.add(asignatura);
                //caracteristicasAsignatura(asignatura, ciclo, curso);
            }
            caracteristicasAsignaturas(ciclo, curso);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void caracteristicasAsignaturas(String ciclo, int curso) {
        for (Asignaturas item : listaAsignaturas) {
            if (item.getCiclo().contains(ciclo) && item.getCurso() == curso) {
                System.out.println(item.getSiglas());
                System.out.println(item.getCurso());
                for (String itemCon:item.getConocimientos()) {
                    System.out.println(itemCon);
                }
            }
        }
    }

    public void caracteristicasAsignatura(Asignaturas asignaturas, String ciclo, int curso) {
        if (asignaturas.getCiclo().contains(ciclo) && asignaturas.getCurso() == curso) {
            System.out.println(asignaturas.getCurso());
            System.out.println(asignaturas.getCiclo());
        }
    }

    public void lecturaJSONAPI(int numero){
        String urlString = "https://randomuser.me/api/?results="+numero+"&gender=female";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = br.readLine();
            JSONObject jsonObject = new JSONObject(lectura);


            System.out.println(lectura);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lecturaUsers(){
        String urlString = "https://randomuser.me/api/?results=5";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea = buffer.readLine())!= null){
                stringBuffer.append(linea);
            }
            String lectura = stringBuffer.toString();

            JSONObject lecturaJSON = new JSONObject(lectura);
            JSONArray arrayResultados = lecturaJSON.getJSONArray("results");
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(0);
                String mail = objetoResultado.getString("email");
                System.out.println(mail);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
