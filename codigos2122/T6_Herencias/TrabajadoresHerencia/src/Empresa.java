import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    Scanner in = new Scanner(System.in);
    private int opcion = 0;
    ArrayList<Trabajadores> listaTrabajadores;

    public Empresa() {
        listaTrabajadores = new ArrayList<>();
    }

    public void registrarTrabajador(Trabajadores trabajador) {

        boolean existe = false;
        for (Trabajadores item : listaTrabajadores) {
            if (item.dni.equalsIgnoreCase(trabajador.getDni())) {
                existe = true;
                System.out.println("Este trabajador ya esta en la empresa");
                break;
            }
        }
        if (!existe) {
            listaTrabajadores.add(trabajador);
        }

    }

    private void listarAsalariados() {
        for (Trabajadores item : listaTrabajadores) {
            if (item instanceof Asalariados) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    private void listarAutonomos() {
        for (Trabajadores item : listaTrabajadores) {
            if (item instanceof Autonomos) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    private void listarTodos() {
        for (Trabajadores item : listaTrabajadores) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
        }
    }


    public void listarTrabajadores(String tipo) {
        switch (tipo) {
            case "asalariados":
                listarAsalariados();
                break;
            case "autonomos":
                listarAutonomos();
                break;
            case "todos":
                listarTodos();
                break;
        }
    }

    public ArrayList<Trabajadores> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajadores> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
}
