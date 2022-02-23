package ListaMultimedia;

public final class Libro  extends Elemento{

    private int numPaginas;

    public Libro () {}
    public Libro (String id, String titulo, String autor, String formato, int tamaño, int numPaginas) {
        super(id, titulo, autor, formato, tamaño);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de Paginas: "+this.numPaginas);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
