public enum TipoDVD {

    intriga("intriga"), terror("terror"),
    comedia("comedia"), drama("drama");

    String nombre;

    TipoDVD (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
