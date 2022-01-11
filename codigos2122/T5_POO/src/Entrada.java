public class Entrada {
    //ambito de clase
    String nombre = "Alex";

    public static void main(String[] args) {
        // ambito de metodo - local
        //String nombre = "Alex";
        Usuario usuario1 = new Usuario();
        // nombre="Por defecto", pss=null, correo=""Por defecto"", edad=0, fecha=null

        Usuario usuario2 = new Usuario();
        // nombre=null, pss=null, correo=null, edad=0, fecha=null

        Usuario usuario3 = new Usuario("Alex", "alex.aguad@gmail.es","pass");
        // nombre="Alex", pss="pass", correo="alex.aguado@gmail.es", edad=0, fecha=null

        Usuario usuario4 = new Usuario("alex.aguad@gmail.es","pass",12);
        // nombre="null", pss="pass", correo="alex.aguado@gmail.es", edad=12, fecha=null


        /*usuario1.password = "Contraseña";
        // nombre="contraseña", pss=null, correo=null, edad=0, fecha=null
        System.out.println(usuario1.password);*/

        System.out.println(usuario4.getCorreoElectronico());
        System.out.println(usuario3.getNombre());
        System.out.println(usuario1.getPassword());
        System.out.println(usuario1.getFecha());
        System.out.println(usuario4.getEdad());
        System.out.println();

        usuario3.setNombre("Alejandro");
        System.out.println(usuario3.getNombre());


    }
}
