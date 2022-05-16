package controller;

import database.SchemeDB;
import model.Alumno;

import java.net.PortUnreachableException;
import java.sql.*;

public class ControllerBD {

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    private void getConnection() {

        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "admin";


        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(){
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertarAlumnosStatement(){
        //inser into alumnos (nombre, apellido, edad) values ('Borja' , 'Martin',38)
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;
        try {
            getConnection();
            statement = conn.createStatement();
            String queryFormat = String.format("INSERT INTO alumnos (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.COL_NAME,
                    SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD, nombre, apellido, edad) ;
            int numero = statement.executeUpdate(queryFormat);
            System.out.println(numero);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }
    public void insertarAlumnoStatement(Alumno alumno){

        try {
            getConnection();
            statement = conn.createStatement();

            String queryFormat = String.format("INSERT INTO alumnos (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.COL_NAME,
                    SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD, alumno.getNombre(), alumno.getApellido(), alumno.getEdad()) ;
            //int numeroRow = statement.executeUpdate(queryFormat);
            if (statement.executeUpdate(queryFormat)>0){
                System.out.println("Alumno insertado correctmente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoPrepare(){
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;
        String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES (?,?,?)";
        try {
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);
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

    public void modificartEdad(String nombre, int edad){

        try {
            getConnection();
            statement = conn.createStatement();
            String queryUpdate = String.format("UPDATE alumnos SET %s = %d WHERE %s = '%s'"
                    ,SchemeDB.COL_EDAD,edad,SchemeDB.COL_NAME,nombre);
            int cantidad = statement.executeUpdate(queryUpdate);
            System.out.println("Se han cambiado "+cantidad+" usuarios");
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

}
