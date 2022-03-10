public enum Departamento {

    ventas("ventas", 10), finanzas("finanzas",10),
     it("it",20), comercial("comercial",5);

    String nombre;
    int trabajadores;

    Departamento (String nombre, int trabajadores){
        this.nombre = nombre;
        this.trabajadores = trabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }
}
