public final class DVD extends Elemento{

    private int anioEdicion;
    private  String director, actores;
    private TipoDVD genero;

    public DVD(){}

    public DVD(String id, String seccion, String titulo, boolean estado, int anioEdicion, String director, String actores, TipoDVD genero) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año edicion: "+anioEdicion);
        System.out.println("Director: "+director);
        System.out.println("Actores: "+actores);
        System.out.println("Genero: "+genero);
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public TipoDVD getGenero() {
        return genero;
    }

    public void setGenero(TipoDVD genero) {
        this.genero = genero;
    }
}
