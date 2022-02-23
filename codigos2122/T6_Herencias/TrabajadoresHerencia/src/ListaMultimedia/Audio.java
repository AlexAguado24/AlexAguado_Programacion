package ListaMultimedia;

public final class Audio extends Elemento{

    private int duracion;
    private String soporte;

    public Audio (){}
    public Audio (String id, String titulo, String autor, String formato, int tamaño, int duracion, String soporte){
        super(id, titulo, autor, formato, tamaño);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion: "+this.duracion);
        System.out.println("Soporte: "+this.soporte);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
