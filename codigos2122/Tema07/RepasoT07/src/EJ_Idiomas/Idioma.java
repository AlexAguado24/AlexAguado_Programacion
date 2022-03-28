package EJ_Idiomas;

import java.util.ArrayList;

public abstract class Idioma {

    protected String nombre;
    protected int numeroHablantes;
    protected ArrayList<String> palabras;

    public Idioma() {
    }

    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.palabras = new ArrayList();
    }

    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public void listarPlabras() {
        System.out.printf("Las palabras en %s son: %n",nombre);
        for (String item : palabras) {
            System.out.println(item);
        }
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList palabras) {
        this.palabras = palabras;
    }
}
