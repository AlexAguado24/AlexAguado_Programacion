package controller;

import com.google.gson.Gson;
import model.Asignatura;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JSONController {

    Scanner in = new Scanner(System.in);

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

    public void pasarStringJSON(){
        //System.out.println(jsonString);

        JSONObject jsonObject = new JSONObject(jsonString);
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }

    public void leerFicheroJSON(){
        File file = new File("src/main/resources/persona.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = bufferedReader.readLine())!= null){
                lecturaCompleta.append(linea);
            }
            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimiento");
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);

                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                /*String concepto = conocimiento.getString("conocimiento");
                int experiencia = conocimiento.getInt("experiencia");*/

            }
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

    public void leerJSONAsignaturas(){

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = bufferedReader.readLine())!= null){
                lecturaCompleta.append(linea);
            }
            JSONObject jsonAsignaturas = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayAsignaturas = jsonAsignaturas.getJSONArray("asignaturas");
            for (int i = 0; i < arrayAsignaturas.length(); i++) {
                JSONObject asignatura = arrayAsignaturas.getJSONObject(i);

                Gson gson = new Gson();
                Asignatura asignaturaJAVA = gson.fromJson(asignatura.toString(),Asignatura.class);

                caracteristicasAsignatura(asignaturaJAVA);
                /*System.out.println(asignaturaJAVA.getSiglas());
                System.out.println(asignaturaJAVA.getNombre());
                System.out.println(asignaturaJAVA.getProfesor().getNombre());
                System.out.println(asignaturaJAVA.getProfesor().getApellido());
                System.out.println(asignaturaJAVA.getHora());
                System.out.println(asignaturaJAVA.getCiclo());
                System.out.println(asignaturaJAVA.getCurso());
                JSONArray conocimiento = asignatura.getJSONArray("conocimientos");
                for (int j = 0; j < conocimiento.length(); j++) {
                    String conocimientos = conocimiento.getString(j);
                    System.out.println(conocimientos);
                }*/
            }
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

    public void caracteristicasAsignatura(Asignatura asignatura){
        System.out.println(asignatura.getSiglas());
        System.out.println(asignatura.getCurso());
    }

}
