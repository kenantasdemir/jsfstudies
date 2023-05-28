package com.kenant42.jsfstudies.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteExample {

    static Connection connection = null;


    public static Connection connectToTheDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/authors","root","");

            if(!connection.isClosed()){
                System.out.println("veritabanına bağlanıldı.");
            }else{
                System.out.println("veritabanına bağlanılamadı.");
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

    public void deleteAuthor(int authorid){
        connectToTheDb();
        String durumBilgisi = "";
        String deleteSorgusu = "DELETE FROM authors WHERE authorid =? ";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSorgusu);
            preparedStatement.setInt(1,authorid);

            boolean resultset = preparedStatement.execute();

            if(resultset){
                durumBilgisi = "Silme işlemi başarılı ";
            }else{
                durumBilgisi = "Silme işlemi başarısız ";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(durumBilgisi);
    }

    public static void main(String[] args) {
        JDBCDeleteExample jdbcDeleteExample = new JDBCDeleteExample();
        jdbcDeleteExample.deleteAuthor(5);
    }

}
