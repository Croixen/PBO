/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pbo.DBandConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Mihaly
 */
import java.sql.Statement;
public class DBCon {
    
    public String sql = "";
    public Connection conn = null;
    public Statement stat = null;
    
    public void Access(){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
            stat = conn.createStatement();
            
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
    }
    
    public DBCon(){
        this.Access();
    }
    
}
