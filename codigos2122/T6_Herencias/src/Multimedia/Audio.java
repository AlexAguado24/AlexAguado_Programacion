package Multimedia;

import java.security.spec.RSAOtherPrimeInfo;

public final class Audio extends Elemento{

    private int duracion;
    private String soporte;

    public Audio(String id, String titulo, String autor, String formato, int tamanio, int duracion, String soporte) {
        super(id, titulo, autor, formato, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion "+duracion);
        System.out.println("Soporte "+ soporte);
    }

    public void metodoAudio(){}

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
