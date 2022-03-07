import java.util.ArrayList;

public final class Empresa {

    private ArrayList<Persona> listaPersonas;

    public Empresa() {
    }

    public Empresa(ArrayList<Persona> listaPersonas) {
        listaPersonas = new ArrayList<>();
    }

    public Persona existePersona(Persona persona) {
        for (Persona item : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.dni)) {
                return item;
            }
        }
        return persona;
    }

    public void contratarPersona(Persona persona) {

        if (existePersona(persona) == null) {
            listaPersonas.add(persona);
        } else {
            System.out.println("La persona ya esta contratada");
        }

    }
}
