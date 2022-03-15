import java.util.ArrayList;

public abstract class Idiomas {

    private String nombre;
    private int numeroHablantes;
    private ArrayList<String> palabras;

    public Idiomas() {}

    public Idiomas(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.palabras = new ArrayList();
    }

    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public void listarPalabras() {
        System.out.printf("Las palabras en %s%n son ", nombre);
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
