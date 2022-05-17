import controller.ControllerBD;
import model.Usuario;

public class Main {

    public static void main(String[] args) {


        ControllerBD controllerBD = new ControllerBD();

        controllerBD.insertarUsuarios();

        //controllerBD.selectSueldos(1000);

        //controllerBD.insertarPerfiles();
    }
}
