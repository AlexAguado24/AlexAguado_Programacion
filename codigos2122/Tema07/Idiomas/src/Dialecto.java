public final class Dialecto extends Idiomas{

    private Idiomas idioma;

    public Dialecto() {}

    public Dialecto(String nombre, int numeroHablantes, Idiomas idioma) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
    }

    @Override
    public void saludar() {

    }

    @Override
    public void despedir() {

    }

    public Idiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }
}
