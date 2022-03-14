public final class Revista extends Elemento {

    private String ISBN;

    public Revista() {
    }

    public Revista(String id, String seccion, String titulo, String ISBN) {
        super(id, seccion, titulo);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+ISBN);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}
