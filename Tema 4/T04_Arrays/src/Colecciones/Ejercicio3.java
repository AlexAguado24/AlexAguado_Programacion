package Colecciones;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Marcos");
        alumnos.add("Sergio");
        alumnos.add("Patri");
        alumnos.add("Hunter");
        alumnos.add("Angel");
        alumnos.add("Jorge");
        alumnos.add("Marcos");

        int aleatorio = (int)(Math.random()*alumnos.size());
        System.out.println(alumnos.get(aleatorio));
    }
}
//Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase.
// Una vez creado, sacará el nombre de uno de los compañeros (aleatorio)