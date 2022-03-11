public final class Libro extends Elemento{

    private String ISBN, autor;
    private int numPaginas;
    private boolean estado;


    public Libro() {}

    public Libro(String id, String seccion, String titulo,boolean estado, String ISBN, String autor, int numPaginas) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
        this.autor = autor;
        this.numPaginas = numPaginas;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+ISBN);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+numPaginas);
        System.out.println("Estado: "+estado);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
