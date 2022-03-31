public enum Bebidas {

    copas("Copas"), cervezas("Cervezas"), refrescos("Refrescos");

    String nombre;

    Bebidas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
