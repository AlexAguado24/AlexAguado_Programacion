import java.util.ArrayList;

public class Consesionario {

    private ArrayList<Coche> listaCoches;


    public Consesionario() {
        listaCoches = new ArrayList();
    }

    public void agregarCoche(Coche coche) {
        /*for (int i = 0; i < listaCoches.size(); i++) {
            if (listaCoches.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("El coche ya esta registrado");
            } else {
                listaCoches.add();
            }
        }*/
        if (existeCoche(coche.getMatricula()) == null) {
            listaCoches.add(coche);
        } else {
            System.out.println("El coche ya existe");
        }
    }

    public Coche existeCoche(String matricula) {
        Coche coche = null;
        for (Coche c : listaCoches) {
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                return c;
            }
        }
        return coche;
    }

    public void buscarCoche(String matricula) {
        if (existeCoche(matricula) != null) {
            existeCoche(matricula).mostrarDator();
        } else {
            System.out.println("El coche que buscas no existe");
        }
    }

    public void borrarCoche(String matricula) {
        if (existeCoche(matricula) != null) {
            listaCoches.remove(existeCoche(matricula));
        } else {
            System.out.println("El coche que buscas no existe");
        }
    }

    public void listarCoche() {
        for (Coche item : listaCoches) {
            System.out.println("Mostrando datos");
            item.mostrarDator();
            System.out.println();
        }
    }
}
