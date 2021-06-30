/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class LihatModel {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/karyawan";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public LihatModel(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String[][] readData(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 4
            statement = koneksi.createStatement();
            String query = "Select * from karyawan"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("usia");
                data[jmlData][3] = resultSet.getString("gaji");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void insertData(String nama, String umur, String gaji){
        int jmlData=0;
        
        try {
           String query = "Select * from karyawan WHERE nama='" + nama+"'"; 
           System.out.println(nama + " " + umur + " " + gaji + " ");
           statement = koneksi.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {
                query = "INSERT INTO `karyawan`(`nama`,`usia`,`gaji`) VALUES('"+nama+"','"+umur+"','"+gaji+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateData(String id, String nama, String umur, String gaji){
        int jmlData=0;
         try {
           String query = "Select * from karyawan WHERE id=" + id; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE karyawan SET nama='" + nama + "', umur='" + umur + "', gaji='" + gaji + "' WHERE id=" + id;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from karyawan";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void deletedata (String id) {
        try{
            String query = "DELETE FROM karyawan WHERE id = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }   
}
