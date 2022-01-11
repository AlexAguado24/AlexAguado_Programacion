public class Usuario {

    // variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;


    // costructores
    // si no hay constructores escritos hay un contructor que es el vacio (por defecto)
    // este contructor deja de existir cuando se escribe algun contructor

    public Usuario(){
        nombre = "Por defecto";
        correoElectronico = "Por defecto";
        edad = 18;
    }
    public Usuario(String nombre, String correoElectronico, String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    public Usuario( String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }


    // metodos

    // metodos getters y setters

    //getters
    public String getPassword(){
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getFecha() {
        return fecha;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setPassword(String password){
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //hacer los getter y setter en 10 segundos

}
