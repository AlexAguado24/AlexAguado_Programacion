package model;

import java.io.Serializable;

public class Factura implements Serializable {

    private int id;
    private String compañia, pais,telefono;
    private int total;
    private String id_factura;

    public Factura() {}

    public Factura(String compañia, String pais, String telefono, int total, String id_factura) {
        this.compañia = compañia;
        this.pais = pais;
        this.telefono = telefono;
        this.total = total;
        this.id_factura = id_factura;
    }

    public Factura(int id, String compañia, String pais, String telefono, int total, String id_factura) {
        this.id = id;
        this.compañia = compañia;
        this.pais = pais;
        this.telefono = telefono;
        this.total = total;
        this.id_factura = id_factura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", compañia='" + compañia + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono=" + telefono +
                ", total=" + total +
                ", id_factura='" + id_factura + '\'' +
                '}';
    }
}
