import java.util.ArrayList;

public final class Empresa {

    private ArrayList<Persona> listaPersonas;
    private String nombre;
    private int beneficios;
    private int votos;

    public Empresa() {
    }

    public Empresa(String nombre, int beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
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

    public void contratarPersona(Persona persona) {

        if (existePersona(persona.getDni()) == null) {
            listaPersonas.add(persona);
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

    public void registrarVotacion(Comision comision) {
        this.votos += comision.votar();
    }

    public void repartirBeneficios() {
        for (Persona item : listaPersonas){
            if (item instanceof Comision){
                ((Comision) item).obtenerBeneficio(beneficios);
            }
        }
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}
