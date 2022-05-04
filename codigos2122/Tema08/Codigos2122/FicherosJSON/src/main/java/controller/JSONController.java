package controller;

import com.google.gson.Gson;
import model.Asignaturas;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

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
    public void leerJSONAsignaturas(){
        File file = new File("src/main/resources/asignatura.json");

        BufferedReader br = null;
        String linea = null;
        StringBuffer lineaCompleta = new StringBuffer();

        try {
            br = new BufferedReader(new FileReader(file));
            while ((linea = br.readLine())!=null){
                lineaCompleta.append(linea);
            }

            JSONObject jsonAsignaturas = new JSONObject(lineaCompleta.toString());

            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");

            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asignaturaJSON = asignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignaturas asignatura = gson.fromJson(asignaturaJSON.toString(),Asignaturas.class);
                caracteristicasAsignatura(asignatura);
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
    public void caracteristicasAsignatura (Asignaturas asignaturas) {
        System.out.println(asignaturas.getCiclo());
        System.out.println(asignaturas.getCurso());
    }
    public void mostrarAsignaturas () {

    }
}
