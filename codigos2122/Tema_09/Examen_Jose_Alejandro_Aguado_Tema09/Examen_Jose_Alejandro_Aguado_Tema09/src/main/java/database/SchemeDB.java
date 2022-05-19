package database;

public interface SchemeDB {

    String host = "127.0.0.1:3306";
    String user = "root";
    String pass = "admin";
    String dtbs = "empresa_examen";

    String root = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
    String TAB_FACT = "factura";
    String TAB_FIL = "tabla_filtrada";
    String COL_ID = "id";
    String COL_COMPA = "compañia";
    String COL_PAIS = "pais";
    String COL_TELEFONO = "telefono";
    String COL_TOTAL = "total";
    String COL_ID_FACTURA = "id_factura";
}
