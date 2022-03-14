public final class Libro extends Elemento implements Prestar{

    private String ISBN, autor, editorial;
    private int numPaginas;
    private boolean estado;


    public Libro() {}

    public Libro(String id, String seccion, String titulo, String ISBN, String autor,String editorial, int numPaginas) {
        super(id, seccion, titulo);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+ISBN);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+numPaginas);
    }

    @Override
    public boolean prestar() {
        setEstado(false);
        return isEstado();
    }

    @Override
    public boolean devolver() {
        setEstado(true);
        return isEstado();
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
