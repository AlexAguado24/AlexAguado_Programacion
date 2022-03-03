import java.util.ArrayList;

public final class Seleccion {

    private String nombre;
    private ArrayList<Persona> listaJugadoresEntrenadores;
    private double gastos;

    public Seleccion() {
        listaJugadoresEntrenadores = new ArrayList<>();
    }

    public Seleccion(String nombre) {
        listaJugadoresEntrenadores = new ArrayList<>();
        this.nombre = nombre;
        mostrarGastos();
    }

    private boolean existePersona(String dni) {
        boolean existe = false;
        for (Persona item : listaJugadoresEntrenadores) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return existe;
    }

    public void contratarJugador(Jugador jugador) {

        if (existePersona(jugador.getDni())) {
            System.out.println("No se puede agregar a la persona por que ya existe");
        } else {
            this.listaJugadoresEntrenadores.add(jugador);
        }
        /*boolean existe = false;
        for (Persona persona : listaJugadoresEntrenadores) {
            if (persona.getDni().equalsIgnoreCase(jugador.getDni())) {
                existe = true;
                System.out.println("Este jugador ya esta contratado");
                break;
            }
        }
        if (!existe) {
            listaJugadoresEntrenadores.add(jugador);
            System.out.println("Jugador contratado");
        }*/
    }

    public void contratarEntrenador(Entrenador entrenador) {
        if (existePersona(entrenador.getDni())) {
            System.out.println("No se puede agregar a la persona por que ya existe");
        } else {
            this.listaJugadoresEntrenadores.add(entrenador);
        }
        /*boolean existe = false;

        for (Persona persona : listaJugadoresEntrenadores) {
            if (persona.getDni().equalsIgnoreCase(entrenador.getDni())) {
                existe = true;
                System.out.println("Este entrenador ya esta contratado");
                break;
            }
        }
        if (!existe) {
            listaJugadoresEntrenadores.add(entrenador);
            System.out.println("Entrenador contratado");
        }*/
    }

    private void verDelanteros() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Jugador) {
                if (((Jugador) item).getPosicion().equalsIgnoreCase("delantero")) {
                    item.mostrarDatos();
                }
            }
        }
    }

    private void verMedios() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Jugador) {
                if (((Jugador) item).getPosicion().equalsIgnoreCase("medio")) {
                    item.mostrarDatos();
                }
            }
        }
    }

    private void verDefensas() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Jugador) {
                if (((Jugador) item).getPosicion().equalsIgnoreCase("defensa")) {
                    item.mostrarDatos();
                }
            }
        }
    }

    private void verPorteros() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Jugador) {
                if (((Jugador) item).getPosicion().equalsIgnoreCase("portero")) {
                    item.mostrarDatos();
                }
            }
        }
    }

    public void verPosicion(String posicion) {
        switch (posicion) {
            case "delantero":
                verDelanteros();
                break;
            case "medio":
                verMedios();
                break;
            case "defensa":
                verDefensas();
                break;
            case "portero":
                verPorteros();
                break;
        }
    }

    public void verJugadores() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Jugador) {
                item.mostrarDatos();
                System.out.println();
            }
        }
    }

    public void verEntrenadores() {
        for (Persona item : listaJugadoresEntrenadores) {
            if (item instanceof Entrenador) {
                item.mostrarDatos();
                System.out.println();
            }
        }
    }

    public void verPlantilla() {
        int numJugadores = 0, numEntrenadores = 0;
        for (Persona item : listaJugadoresEntrenadores) {
            item.mostrarDatos();
            if (item instanceof Jugador) {
                numJugadores++;
            }
            if (item instanceof Entrenador) {
                numEntrenadores++;
            }
        }
        System.out.println("El numero de jugadores es " + numJugadores + " y el de entrenadores es " + numEntrenadores);
    }

    public void mostrarGastos() {


        for (Persona persona : listaJugadoresEntrenadores) {
            if (persona instanceof Jugador) {
                this.gastos += ((Jugador) persona).getSueldo();
            }
        }
        for (Persona persona : listaJugadoresEntrenadores) {
            if (persona instanceof Entrenador) {
                this.gastos += ((Entrenador) persona).getSueldo();
            }
        }

        System.out.println("Los gastos de la seleccion son " + this.gastos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListaJugadores() {
        return listaJugadoresEntrenadores;
    }

    public void setListaJugadores(ArrayList<Persona> listaJugadores) {
        this.listaJugadoresEntrenadores = listaJugadores;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
