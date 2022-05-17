package controller;

import database.SchemeDB;
import model.Usuario;

import javax.xml.validation.Schema;
import java.sql.*;

public class ControllerBD {

    private Connection conn;
    private Statement statement;

    private PreparedStatement preparedStatement;
    private   void getConection(){
        String newConnectionURL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
                + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;
        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
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

    public void insertarPerfiles(){

        getConection();
        try {
            statement = conn.createStatement();
            String query1 =String.format("INSERT INTO %s (%s) VALUES ('Gerente')",SchemeDB.TAB_PERFILES,SchemeDB.COL_NOMBRE);
            statement.executeUpdate(query1);
            String query2 = String.format("INSERT INTO %s (%s) VALUES ('Trabajador')",SchemeDB.TAB_PERFILES,SchemeDB.COL_NOMBRE);
            statement.executeUpdate(query2);
            String query3 = String.format("INSERT INTO %s (%s) VALUES ('Director')",SchemeDB.TAB_PERFILES,SchemeDB.COL_NOMBRE);
            statement.executeUpdate(query3);
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
    public void insertarUsuarios(){
        addUser(new Usuario("Heide-Marie", "Rausch","Holanda",2145024));
        addUser(new Usuario("Liam", "Montgomery","España",6016977));
        addUser(new Usuario("Ioanna", "Van der Gaag","Belgica",978229));
    }

    private void addUser(Usuario usuario){
        getConection();
        try {
            String query = String.format("INSERT INTO %s (%s,%s,%s,%s) VALUES (?,?,?,?)",
                    SchemeDB.TAB_USUARIOS,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,SchemeDB.COL_PAIS,SchemeDB.COL_TELEFONO);
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getApellido());
            preparedStatement.setString(3, usuario.getPais());
            preparedStatement.setInt(4, usuario.getTelefono());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }

    public void selectSueldos(int sueldoParametro){
        getConection();
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM %s WHERE %s>%d";
            String queryFormat = String.format(query,SchemeDB.TAB_USUARIOS,SchemeDB.COL_SUELDO,sueldoParametro);
            ResultSet rows = statement.executeQuery(queryFormat);
            //rows.first();
            do{
                String nombre = rows.getString(SchemeDB.COL_NOMBRE);
                int sueldo = rows.getInt(SchemeDB.COL_SUELDO);
                System.out.println(nombre);
                System.out.println(sueldo);
            } while (rows.next());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
