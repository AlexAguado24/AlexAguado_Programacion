package controller;

import database.SchemeDB;
import model.Alumno;

import java.net.PortUnreachableException;
import java.sql.*;
import java.util.ArrayList;

public class ControllerBD {

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

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
        String nombre = "Mario";
        String apellido = "Borjes";
        int edad = 60;
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
    public void borrarAlumno (){
        String query ="DELETE FROM %s WHERE %s < %d";
        int edad = 30;

        try {
            getConnection();
            String queryFormat =String.format(query,
                    SchemeDB.TAB_ALU,SchemeDB.COL_EDAD,edad);
            statement = conn.createStatement();
            int rows = statement.executeUpdate(queryFormat);
            if (rows>0){
                System.out.println("Rows modificadas = "+rows);
            } else {
                System.out.println("0 rows modificadas");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }
    public void procesarArrayList (ArrayList lista){
        System.out.println(lista.size());
    }
    public void getResultados(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        getConnection();

        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM "+SchemeDB.TAB_ALU;
            resultSet = statement.executeQuery(query);


            while (resultSet.next()){
                String nombre = resultSet.getString(SchemeDB.COL_NAME);
                String apellido = resultSet.getString(SchemeDB.COL_APELLIDO);
                int edad = resultSet.getInt(SchemeDB.COL_EDAD);
                int id = resultSet.getInt(SchemeDB.COL_ID);
                Alumno alumno = new Alumno(id,nombre,apellido,edad);

                alumnos.add(alumno);
                System.out.println(alumno.getId()+ " "+alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getEdad());
            }
            procesarArrayList(alumnos);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

}
