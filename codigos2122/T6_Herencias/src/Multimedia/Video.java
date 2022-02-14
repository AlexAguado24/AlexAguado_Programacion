package Multimedia;

public final class Video extends Elemento {

    private String actores, director;

    public Video(String id, String titulo, String autor, String formato, int tamanio, String actores, String director) {
        super(id, titulo, autor, formato, tamanio);
        this.actores = actores;
        this.director = director;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Actores "+actores);
        System.out.println("Director "+director);
    }

    public void metodoVideo(){}

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}


