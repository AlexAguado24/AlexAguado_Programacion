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

        try {
            conn = (Connection) DriverManager.getConnection(SchemeDB.url);
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
        addUser(new Usuario("Heide-Marie", "Rausch","Holanda",2145024,1));
        addUser(new Usuario("Liam", "Montgomery","España",6016977,2));
        addUser(new Usuario("Ioanna", "Van der Gaag","Belgica",978229,3));
        addUser(new Usuario("Eloane", "Bourgeois","Francia",60595439,1));
        addUser(new Usuario("Mina", "Rieger","Alemania",8154354,2));
        addUser(new Usuario("Celesta", "Langenhuizen","España",2399626,3));
        addUser(new Usuario("Leah", "Lee","Alemania",312333,1));
        addUser(new Usuario("Armand", "Lucas","Holanda",423445,2));
        addUser(new Usuario("Leah", "Jim","Francia",312333,3));
    }

    private void addUser(Usuario usuario){
        getConection();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) VALUES (?,?,?,?,?)";
        String queryFormat = String.format(query,
                SchemeDB.TAB_USUARIOS,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,
                SchemeDB.COL_PAIS,SchemeDB.COL_TELEFONO,SchemeDB.COL_FK_ID);
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(queryFormat);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getApellido());
            preparedStatement.setString(3, usuario.getPais());
            preparedStatement.setInt(4, usuario.getTelefono());
            preparedStatement.setInt(5, usuario.getId_perfil());
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

    public void sueldoEspaña (){
        getConection();
        try {
            String query = String.format("UPDATE %s SET %s = 10000 WHERE %s LIKE 'España'",SchemeDB.TAB_USUARIOS,
                    SchemeDB.COL_SUELDO,SchemeDB.COL_PAIS);
            statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void sueldoAlemania (){
        getConection();
        try {
            String query = String.format("UPDATE %s SET %s = 5000 WHERE %s LIKE 'Alemania' AND %S LIKE 'Leah'"
                    ,SchemeDB.TAB_USUARIOS, SchemeDB.COL_SUELDO,SchemeDB.COL_PAIS,SchemeDB.COL_NOMBRE);
            statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void sueldoResto (){
        getConection();
        int sueldo = 500;
        String pais = "España", nombre = "Leah";
        String queryFormat = String.format("UPDATE %s SET %s = ? WHERE %s NOT LIKE ? AND %s NOT LIKE ?",
                SchemeDB.TAB_USUARIOS,SchemeDB.COL_SUELDO,SchemeDB.COL_PAIS,SchemeDB.COL_NOMBRE);
        try {
            preparedStatement = conn.prepareStatement(queryFormat);
            preparedStatement.setInt(1,sueldo);
            preparedStatement.setString(2,pais);
            preparedStatement.setString(3,nombre);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void selectSueldos(int sueldoParam){
        try {
            getConection();
            statement = conn.createStatement();
            String query = "SELECT * FROM %s WHERE %s > %d";
            String queryFormat = String.format(query,SchemeDB.TAB_USUARIOS,
                    SchemeDB.COL_SUELDO,sueldoParam);
            ResultSet rows = statement.executeQuery(queryFormat);
            //rows.first();
            while (rows.next()){
                String nombre = rows.getString(SchemeDB.COL_NOMBRE);
                int sueldo = rows.getInt(SchemeDB.COL_SUELDO);
                System.out.println(nombre);
                System.out.println(sueldo);
            }

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
            closeConnection();
        }
    }
}
