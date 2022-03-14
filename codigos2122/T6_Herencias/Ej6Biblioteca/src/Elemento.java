public abstract class Elemento {

    protected String id, seccion, titulo;
    protected boolean estado;

    public Elemento (){}
    public Elemento (String id, String seccion, String titulo){
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = true;
    }

    public void mostrarDatos (){
        System.out.println("ID: "+id);
        System.out.println("Seccion: "+seccion);
        System.out.println("Titulo: "+titulo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
