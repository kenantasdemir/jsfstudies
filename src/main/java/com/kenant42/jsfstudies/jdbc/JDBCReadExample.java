package com.kenant42.jsfstudies.jdbc;

import com.kenant42.jsfstudies.entities.Author;


import java.sql.*;
import java.util.List;
import java.io.Serializable;

public class JDBCReadExample {


    static Connection connection = null;

    public static Connection connectToTheDb(){
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani","root","");
           if(!connection.isClosed()){
               System.out.println("veritabanına bağlanıldı..");
           }else{
               System.out.println("veritabanına bağlanılamadı..");
           }
           return connection;

       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } catch (InstantiationException e) {
           throw new RuntimeException(e);
       } catch (IllegalAccessException e) {
           throw new RuntimeException(e);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    public String getDatas(){
        connectToTheDb();

        String yazarHakkinda = "";

        try{
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM ogrenciler");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
                yazarHakkinda = yazarHakkinda + "&"
                        + resultSet.getInt(1) + "&" + resultSet.getString(2) + "&" +resultSet.getInt(3);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return yazarHakkinda;


    }

    public static void main(String[] args) {
        JDBCReadExample jdbcReadExample = new JDBCReadExample();
        jdbcReadExample.getDatas();
    }





}
