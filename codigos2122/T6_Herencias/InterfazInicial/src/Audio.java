public final class Audio extends Elemento implements Ejecutable{

    private int duracion;
    private String soporte;

    public Audio() {}

    public Audio(String id, String titulo, String autor, String formato, int tamaño, int duracion, String soporte) {
        super(id, titulo, autor, formato, tamaño);
        this.duracion = duracion;
        this.soporte = soporte;
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
