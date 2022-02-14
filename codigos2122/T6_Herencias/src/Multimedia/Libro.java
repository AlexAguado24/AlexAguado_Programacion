package Multimedia;

public final class Libro extends Elemento {

    private int ISBN, numPaginas;

    public Libro(String id, String titulo, String autor, String formato, int tamanio, int ISBN, int numPaginas) {
        super(id, titulo, autor, formato, tamanio);
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Paginas "+numPaginas);
        System.out.println("ISBN "+ ISBN);
    }

    public void metodoLibro(){}

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
