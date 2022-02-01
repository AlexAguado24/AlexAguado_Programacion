package EjerciciosObjetosPOO.CajeroBase;

import java.util.ArrayList;

public class Banco {

    //variables
    private String nombre, cif;
    private ArrayList<Cuenta> cuentasBanco;


    //constructores
    public Banco() {
        this.nombre = nombre;
        this.cif = cif;
        this.cuentasBanco = new ArrayList<>();
    }


    //metodos

    public void abrirCuenta(Cuenta cuenta) {
        Cuenta cuenta1 = new Cuenta(cuenta.getCliente(), cuenta.getPin(), cuenta.getSaldo());
        cuentasBanco.add(cuenta);
    }

    public void borrarCuenta (String dni) {
        boolean existe = false;
        for (int i = 0; i < cuentasBanco.size(); i++) {
            if (cuentasBanco.get(i).getCliente().getDni().equalsIgnoreCase(dni)) {
                existe = true;
                cuentasBanco.remove(i);
                break;
            } else {
                System.out.println("La cuenta que quieres borrar no existe");
            }
        }
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public ArrayList<Cuenta> getCuentasBanco() {
        return cuentasBanco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setCuentasBanco(ArrayList<Cuenta> cuentasBanco) {
        this.cuentasBanco = cuentasBanco;
    }
}
