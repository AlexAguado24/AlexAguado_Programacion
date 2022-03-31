public enum Comidas{

    menu("Menu"), raciones("Raciones"), bocadillos("Bocadillos");

    String nombre;

    Comidas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
