package Multimedia;

public abstract class Elemento {

    protected String id, titulo, autor, formato;
    protected int tamanio;

    public Elemento(){}

    public Elemento(String id, String titulo, String autor, String formato, int tamanio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamanio = tamanio;
    }

    public void mostrarDatos(){
        System.out.println("ID: "+id);
        System.out.println("Titulo "+ titulo);
        System.out.println("Autor "+autor);
        System.out.println("Formato "+formato);
        System.out.println("Tamanio "+tamanio);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
