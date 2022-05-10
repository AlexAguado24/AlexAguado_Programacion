package controller;

import database.SchemaDB;
import model.Usuario;

import java.sql.*;

public class ControllerBD {

    private Connection conn;
    //no comprueba tipos
    private Statement statement;

    private PreparedStatement preparedStatement;

    private void getConnection() {
        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = "root";
        String pass = "admin";


        String newConnectionURL = "jdvc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarAlumnoStatement(){
        String nombre = "Borja";
        String apellido = "Martin";
        int  edad = 38;
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            statement = conn.createStatement();
            String query = "INSERT INTO"+ SchemaDB.TAB_ALU+" ("+SchemaDB.COL_NOMBRE+","+ SchemaDB.COL_APELLIDO+","+ SchemaDB.COL_EDAD+") " +
                    "VALUES ('"+nombre+"','"+apellido+"',"+edad+")";
            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s',%d)",SchemaDB.TAB_ALU,
                    SchemaDB.COL_NOMBRE,SchemaDB.COL_APELLIDO,SchemaDB.COL_EDAD,
                    nombre,apellido,edad);
            int numeroRow = statement.executeUpdate(queryFormat);
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoStatement(Usuario usuario) {
        String nombre = usuario.getNombre();
        String apellido = usuario.getApellido();
        int edad = usuario.getEdad();
        // insert into alumnos (nombre, apellido, edadd) values ("Borja", "Martin", 38)
        try {
            getConnection();
            statement = conn.createStatement();
            String query = String.format("insert into %s (%s, %s, %s) values ('%s', '%s', %d)", SchemaDB.TAB_ALU, SchemaDB.COL_NOMBRE, SchemaDB.COL_APELLIDO, SchemaDB.COL_EDAD, nombre, apellido, edad);
            //int numeroRow = statement.executeUpdate("insert into %s (%s, %s, %s) values ('%s', '%s', %d)");
            if (statement.executeUpdate(query)>0) {
                System.out.println(query);
            }
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

    public void insertarAlumnoPrepare (){
        String nombre = "Borja";
        String apellido = "Martin";
        String edad = "38";

        String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES (?,?,?)";

        try {
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setString(3,edad);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }
}
