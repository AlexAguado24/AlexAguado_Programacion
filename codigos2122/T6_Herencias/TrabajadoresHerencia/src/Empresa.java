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

        System.out.println("¿Que opcion quieres realizar?");
        System.out.println("1. Añadir Jefe");
        System.out.println("2. Añadir Asalariado");
        System.out.println("3. Añadir Autonomo");
        opcion = in.nextInt();

        switch (opcion) {
            case 1:
                Jefes jefe = new Jefes();
                System.out.println("Indica su Nombre");
                jefe.setNombre(in.next());
                System.out.println("Indica su apellido");
                jefe.setApellido(in.next());
                System.out.println("Indica su DNI");
                jefe.setDni(in.next());
                System.out.println("Indica sus acciones");
                jefe.setAcciones(in.nextInt());
                System.out.println("Indica sus beneficios");
                jefe.setBeneficios(in.nextDouble());
                listaTrabajadores.add(jefe);
                break;
            case 2:
                Asalariados asalariado = new Asalariados();
                System.out.println("Indica su Nombre");
                asalariado.setNombre(in.next());
                System.out.println("Indica su apellido");
                asalariado.setApellido(in.next());
                System.out.println("Indica su DNI");
                asalariado.setDni(in.next());
                System.out.println("Indica su sueldo");
                asalariado.setSueldo(in.nextInt());
                System.out.println("Indica el numero de pagas");
                asalariado.setNumPagas(in.nextInt());
                System.out.println("¿Tiene contrato?");
                asalariado.setContratado(in.hasNext());
                listaTrabajadores.add(asalariado);
                break;
            case 3:
                Autonomos autonomo = new Autonomos();
                System.out.println("Indica su Nombre");
                autonomo.setNombre(in.next());
                System.out.println("Indica su apellido");
                autonomo.setApellido(in.next());
                System.out.println("Indica su DNI");
                autonomo.setDni(in.next());
                System.out.println("Indica su sueldo");
                autonomo.setSueldo(in.nextInt());
                System.out.println("¿Tiene contrato?");
                autonomo.setContratado(in.hasNext());
                listaTrabajadores.add(autonomo);
                break;
        }
    }

    public void listarAsalariados() {
        for (Trabajadores item : listaTrabajadores) {
            if (item instanceof Asalariados) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    public void listarAutonomos() {
        for (Trabajadores item : listaTrabajadores) {
            if (item instanceof Autonomos) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    public void listarTodos() {
        for (Trabajadores item : listaTrabajadores) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
        }
    }


    public void listarTrabajadores(String tipo) {
        switch (tipo) {
            case "Asalariados":
                listarAsalariados();
                break;
            case "Autonomos":
                listarAutonomos();
                break;
            case "Todos":
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
