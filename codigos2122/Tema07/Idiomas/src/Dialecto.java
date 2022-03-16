public final class Dialecto extends Idiomas{

    private Idiomas idioma;

    public Dialecto() {}

    public Dialecto(String nombre, int numeroHablantes, Idiomas idioma) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
    }

    public void cuantificar (int n,Cuantificable interfaz){
        interfaz.cuantificarHablantes(n);
    }

    @Override
    public void saludar() {
        System.out.println("El saludo en "+getNombre()+" es bon dia");
    }

    @Override
    public void despedir() {
        System.out.println("La despedida en "+getNombre()+" es adeu");
    }

    public Idiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }
}
