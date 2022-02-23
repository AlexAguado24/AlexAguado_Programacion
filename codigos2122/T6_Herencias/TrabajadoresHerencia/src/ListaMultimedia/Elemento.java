package ListaMultimedia;

public abstract class Elemento {

    protected String id, titulo, autor, formato;
    protected int tamaño;

    public Elemento () {}

    public Elemento (String id, String titulo, String autor, String formato, int tamaño) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamaño = tamaño;
    }

    public void mostrarDatos () {
        System.out.println("ID: "+this.id);
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Formato: "+this.formato);
        System.out.println("Tamaño: "+this.tamaño);
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
