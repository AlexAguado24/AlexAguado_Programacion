public final class CD extends Elemento implements Prestar{

    private int anioEdicion;
    private TipoCD genero;

    public CD (){}

    public CD(String id, String seccion, String titulo, int anioEdicion, TipoCD genero) {
        super(id, seccion, titulo);
        this.anioEdicion = anioEdicion;
        this.genero = genero;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año edicion: "+anioEdicion);
        System.out.println("Genero: "+genero.getNombre());
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
