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

    //getter de pass
    public String getPassword(){
        return password;
    }

    //setter del pass
    public void setPassword(String password){
        this.password = password;
    }

    //hacer los getter y setter en 10 segundos


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String aèllidos) {
        this.apellidos = aèllidos;
    }

    

}
