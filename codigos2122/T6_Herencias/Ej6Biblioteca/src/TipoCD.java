public enum TipoCD {

    musical("musical"), monologo("monologo"),
    educativo("educativo");

    String nombre;

    TipoCD (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
