public final class Revista extends Elemento implements Prestar{

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

}
