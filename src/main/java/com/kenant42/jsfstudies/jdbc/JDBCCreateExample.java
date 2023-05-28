package com.kenant42.jsfstudies.jdbc;

import java.sql.*;

public class JDBCCreateExample {
    static Connection connection = null;

    public static Connection connectToTheDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection("jdbc:mysql://localhost:/yazarlar","root","");

            if(!connection.isClosed()){
                System.out.println("veritabanına bağlanıldı");
            }else{
                System.err.println("veritabanına bağlanılamadı");
            }

            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertAuthor(String yazarAdi,int yazarYasi,String kitapAdi) throws SQLException {

        connectToTheDb();

        String durumBilgisi = "";
        String sorgu = "INSERT INTO authors(yazarAdi,yazarYasi,kitapAdi) VALUES(?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1,yazarAdi);
            preparedStatement.setInt(2,yazarYasi);
            preparedStatement.setString(3,kitapAdi);

            boolean resultSet = preparedStatement.execute();
            if(resultSet){
                durumBilgisi = "Ekleme işlemi başarısız";
            }else{
                durumBilgisi = "Ekleme işlemi başarılı";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
        }

    }

    public static void main(String[] args) {
        JDBCCreateExample jdbcCreateExample = new JDBCCreateExample();
        try {
            jdbcCreateExample.insertAuthor("Halide Edip Adıvar",80,"Mor Salkımlı Ev");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
