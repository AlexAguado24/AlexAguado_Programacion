package Cajero;

import java.util.Scanner;

public final class Cuenta {

    Scanner in = new Scanner(System.in);
    private String id, pin;
    private int saldo;

    public Cuenta() {}

    public Cuenta(String id, String pin, int saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    public void ingresarDinero (int dinero) {
        setSaldo(this.saldo+= dinero);
    }

    public void sacarDinero (int dinero) {
        boolean sacar_todo = false;
        try {
            if (saldo < dinero) {
                throw new ExcepcionDinero("No puedes sacar tanto dinero");
            }
        } catch (ExcepcionDinero e) {
            System.out.println("No puedes sacar tanto dinero");
            System.out.println("¿Quieres sacar todo el dinero que hay en la cuenta?");
            String respuesta = in.next();
            if (respuesta.equalsIgnoreCase("si")) {
                this.saldo = 0;
                return;
            }
        }
        this.saldo -= dinero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
