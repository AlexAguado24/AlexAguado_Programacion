package ListaMultimedia;

public final class Video extends Elemento {

    private String director, actores;

    public Video() {}
    public Video(String id, String titulo, String autor, String formato, int tamaño, String director, String actores) {
        super(id, titulo, autor, formato, tamaño);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+this.director);
        System.out.println("Actores: "+this.actores);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }
}
