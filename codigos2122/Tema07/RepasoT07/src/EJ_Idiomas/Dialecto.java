package EJ_Idiomas;

public class Dialecto extends Idioma{

    Idioma idioma;
    int numHablantes;

    public Dialecto() {}

    public Dialecto(String nombre, int numeroHablantes, Idioma idioma, int numHablantes) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
        this.numHablantes = numHablantes;
    }

    public Dialecto (Idioma idioma, int numHablantes){
        this.idioma = idioma;
        this.numHablantes = numHablantes;
    }


    public void cuantificarHablantes(int n,Cuantificable interfaz) {
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

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
}
