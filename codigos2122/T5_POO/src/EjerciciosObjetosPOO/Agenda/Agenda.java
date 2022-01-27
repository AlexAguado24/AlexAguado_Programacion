package EjerciciosObjetosPOO.Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner in = new Scanner(System.in);
    private ArrayList<Persona> agenda;

    //constructores

    public Agenda (){
        this.agenda= new ArrayList();
    }

    //metodos

    public void agregarPersona (Persona persona){
        this.agenda.add(persona);
    }

    public void borrarPersona(String dni){
        for (int i = 0; i < agenda.size(); i++) {
            boolean existe = false;
            if (agenda.get(i).getDni().equalsIgnoreCase(dni)){
                existe = true;
                agenda.remove(i);
            } else {
                System.out.println("La persona que buscas no existe");
            }
        }

    }

    public void editarPersona(String dni,String nombre, int telefono){
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getDni().equalsIgnoreCase(dni)){
                agenda.get(i).setNombre(nombre);
                agenda.get(i).setTelefono(telefono);

            } else {
                System.out.println("La persona que buscas no existe");
            }
        }
    }

    public void buscarPersona(String dni){
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getDni().equalsIgnoreCase(dni)){
                agenda.get(i).mostrarDatos();

            } else {
                System.out.println("La persona que buscas no existe");
            }
        }
    }

    public void listarAgenda(){
        for (Persona item :agenda) {
            item.mostrarDatos();
        }
    }

    //getter y setter


    public ArrayList<Persona> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Persona> agenda) {
        this.agenda = agenda;
    }
}
