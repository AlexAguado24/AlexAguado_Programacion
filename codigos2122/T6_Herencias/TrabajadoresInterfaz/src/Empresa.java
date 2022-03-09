import java.util.ArrayList;

public final class Empresa {

    private ArrayList<Persona> listaPersonas;

    public Empresa() {
    }

    public Empresa(ArrayList<Persona> listaPersonas) {
        listaPersonas = new ArrayList<>();
    }

    public Persona existePersona(String dni) {
        Persona persona = null;
        for (Persona item : listaPersonas) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                return item;
            }
        }
        return persona;
    }

    public void contratarPersona(Trabajador trabajador) {

        if (existePersona(trabajador.getDni()) == null) {
            listaPersonas.add(trabajador);
        } else {
            System.out.println("La persona ya esta contratada");
        }

    }

    public boolean despedirTrabajador(String dni) {
        for (Persona item : listaPersonas) {
            if (!(item instanceof Directivo) && !(item instanceof Accionista)) {
                if (existePersona(dni) != null) {
                    listaPersonas.remove(existePersona(dni));
                    return true;
                }
            }
        }
        return false;
    }

    public void buscarPersona(String dni) {
        if (existePersona(dni) != null) {
            existePersona(dni).mostrarDatos();
        }
    }

    public void listarPersonas() {
        for (Persona item : listaPersonas) {
            item.mostrarDatos();
        }
    }
}
