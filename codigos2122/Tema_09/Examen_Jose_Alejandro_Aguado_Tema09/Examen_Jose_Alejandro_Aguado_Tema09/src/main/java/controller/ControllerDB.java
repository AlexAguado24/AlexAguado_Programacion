package controller;

import com.google.gson.Gson;
import database.SchemeDB;
import model.Factura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class ControllerDB {

    private ArrayList<Factura> listaFacturas;
    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void getConnection(){
        try {
            conn = DriverManager.getConnection(SchemeDB.root);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeConnection(){
        try {
            if (conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void lecturaJSON(){
        String url = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";
        BufferedReader bufferedReader = null;

        try {
            URL urlString = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlString.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = "";
            while ((linea = bufferedReader.readLine())!=null){
                stringBuilder.append(linea);
            }
            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray arrayResults = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResults.length(); i++) {
                JSONObject results = arrayResults.getJSONObject(i);
                String compañia = results.getString("company");
                String pais = results.getString("country");
                String telefono = results.getString("phone");
                int total = results.getInt("invoice");
                String id_factura = results.getString("_id");
                insertarFactura(new Factura(compañia,pais,telefono,total,id_factura));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }

    }
    public void insertarFactura(Factura factura){
        getConnection();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) VALUE (?,?,?,?,?)";

        String queryFormat = String.format(query,SchemeDB.TAB_FIL,SchemeDB.COL_COMPA,
                SchemeDB.COL_PAIS,SchemeDB.COL_TELEFONO,SchemeDB.COL_TOTAL,SchemeDB.COL_ID_FACTURA);

        try {
            preparedStatement = conn.prepareStatement(queryFormat);
            preparedStatement.setString(1,factura.getCompañia());
            preparedStatement.setString(2,factura.getPais());
            preparedStatement.setString(3,factura.getTelefono());
            preparedStatement.setInt(4,factura.getTotal());
            preparedStatement.setString(5,factura.getId_factura());
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

    public void buscarTotal (int totalBuscar){
        getConnection();
        String query = "SELECT * FROM %s WHERE %s >= %d";
        try {
            statement = conn.createStatement();
            String queryFormat = String.format(query,SchemeDB.TAB_FACT,SchemeDB.COL_TOTAL,totalBuscar);
            ResultSet rows = statement.executeQuery(queryFormat);

            while (rows.next()) {
                String compañia = rows.getString(SchemeDB.COL_COMPA);
                String pais = rows.getString(SchemeDB.COL_PAIS);
                String telefono = rows.getString(SchemeDB.COL_TELEFONO);
                int total = rows.getInt(SchemeDB.COL_TOTAL);
                String id_factura = rows.getString(SchemeDB.COL_ID_FACTURA);
                insertarFactura(new Factura(compañia,pais,telefono,total,id_factura));
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

    public void buscarPais(String paisBuscar){
        getConnection();
        String query = "SELECT * FROM %s WHERE %s = '%s'";
        try {
            statement = conn.createStatement();
            String queryFormat = String.format(query,SchemeDB.TAB_FACT,SchemeDB.COL_PAIS,paisBuscar);
            ResultSet rows = statement.executeQuery(queryFormat);

            while (rows.next()) {
                String compañia = rows.getString(SchemeDB.COL_COMPA);
                String pais = rows.getString(SchemeDB.COL_PAIS);
                String telefono = rows.getString(SchemeDB.COL_TELEFONO);
                int total = rows.getInt(SchemeDB.COL_TOTAL);
                String id_factura = rows.getString(SchemeDB.COL_ID_FACTURA);
                insertarFactura(new Factura(compañia,pais,telefono,total,id_factura));
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
