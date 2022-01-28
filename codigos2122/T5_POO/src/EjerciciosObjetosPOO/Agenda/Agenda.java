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

    public boolean borrarPersona(String dni){
        for (int i = 0; i < agenda.size(); i++) {
            if (dni.equalsIgnoreCase(agenda.get(i).getDni())) {
                agenda.remove(i);
                return true;
            }
        }
        return false;
    }

    public void editarPersona(String dni,String nombre, int telefono){
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getDni().equalsIgnoreCase(dni)){
                agenda.get(i).setNombre(nombre);
                agenda.get(i).setTelefono(telefono);
                System.out.println("Persona modificada");
                break;
            } else {
                System.out.println("La persona que buscas no existe");
            }
        }
    }

    public void buscarPersona(String dni){
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getDni().equalsIgnoreCase(dni)){
                agenda.get(i).mostrarDatos();
                break;
            } else {
                System.out.println("La persona que buscas no existe");
            }
        }
    }

    public void listarAgenda(){
        for (Persona item :agenda) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
            System.out.println();
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
