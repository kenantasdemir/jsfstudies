package com.kenant42.jsfstudies.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateExample {

    static Connection connection = null;

    public static Connection connectToTheDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/authors","root","");

            if(!connection.isClosed()){
                System.out.println("veritabanına bağlanıldı");
            }else{
                System.out.println("veritabanına bağlanılamadı");
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


    public void updateAuthor(int id,String yazarAdi,int yazarYasi,String kitapAdi){
        String durumBilgisi;

        try{
            String updateSorgusu = "UPDATE authors "
                    + ", authorname = ? "
                    + ", authorage = ? "
                    + ", bookName = ? "
                    + "WHERE authorid = ? " ;

            PreparedStatement preparedStatement = connection.prepareStatement(updateSorgusu);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,yazarAdi);
            preparedStatement.setInt(3,yazarYasi);
            preparedStatement.setString(4,kitapAdi);


            int resultset = preparedStatement.executeUpdate();

            if(resultset==1){
                durumBilgisi = resultset + " kayıt güncellendi " ;
            }else{
                durumBilgisi = "Güncellendi " ;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(durumBilgisi);


    }

    public static void main(String[] args) {
        JDBCUpdateExample jdbcUpdateExample = new JDBCUpdateExample();
        jdbcUpdateExample.updateAuthor(4,"Deneme Yazar",45,"Deneme isimli kitap");

    }
}
