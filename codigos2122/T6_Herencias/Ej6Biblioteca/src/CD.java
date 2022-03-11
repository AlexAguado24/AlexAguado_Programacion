public final class CD extends Elemento{

    private int anioEdicion;
    private TipoCD genero;

    public CD (){}

    public CD(String id, String seccion, String titulo, boolean estado, int anioEdicion, TipoCD genero) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.genero = genero;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año edicion: "+anioEdicion);
        System.out.println("Genero: "+genero);
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public TipoCD getGenero() {
        return genero;
    }

    public void setGenero(TipoCD genero) {
        this.genero = genero;
    }
}
