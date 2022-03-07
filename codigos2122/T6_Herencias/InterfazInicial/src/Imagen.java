public final class Imagen extends Elemento implements Ejecutable{

    private String ISBN;

    public Imagen(){}

    public Imagen(String id, String titulo, String autor, String formato, int tamaño, String ISBN) {
        super(id, titulo, autor, formato, tamaño);
        this.ISBN = ISBN;
    }

    @Override
    public void parar() {

    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void reiniciar() {

    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
