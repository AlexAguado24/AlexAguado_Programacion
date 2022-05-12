package controller;

import database.SchemaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControllerBD {

    Connection conn;

    public void getConnection() {
        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = "root";
        String pass = "admin";


        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println( conn.getCatalog());
            //System.out.println(conn.getCatalog());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
            //System.out.println(e.getMessage());

        }
    }

}
