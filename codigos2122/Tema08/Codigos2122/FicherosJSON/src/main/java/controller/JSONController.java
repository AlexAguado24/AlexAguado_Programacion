package controller;

import com.google.gson.Gson;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    public void pasarStringJSON() {

        JSONObject jsonObject = new JSONObject(jsonString);
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");


        System.out.println(nombre);
        System.out.println(edad);

        System.out.println("Tus hobbies son");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }


    }

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


}
