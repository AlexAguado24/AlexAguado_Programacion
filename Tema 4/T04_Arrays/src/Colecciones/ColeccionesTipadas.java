package Colecciones;

import java.util.ArrayList;

public class ColeccionesTipadas {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalabras = new ArrayList<>();
        ArrayList<Object[]>listaPersonas = new ArrayList<>();

        listaNumeros.add(123);
        listaNumeros.remove(0);

        listaPalabras.add("asd");
        listaPalabras.get(0);
        listaPalabras.remove(0);

        for (Integer item:listaNumeros) {

        }
    }
}
