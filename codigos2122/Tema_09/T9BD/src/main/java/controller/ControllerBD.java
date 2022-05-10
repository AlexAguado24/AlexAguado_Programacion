package controller;

import database.SchemaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerBD {

    private Connection conn;
    //no comprueba tipos
    private Statement statement;




    private void getConnection(){
        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = "root";
        String pass = "admin";


        String newConnectionURL = "jdvc:mysql://"+host+"/"+dtbs+"?"+"user="+ user +"&password="+pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection(){
        try {
            if (conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarAlumnoStatement(){
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;
        // insert into alumnos (nombre, apellido, edadd) values ("Borja", "Martin", 38)
        try {
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("insert into alumnos (nombre, apellido, edadd) values ('"+nombre+"', '"+apellido+"', "+edad+")");
            System.out.println(numeroRow);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }
}
