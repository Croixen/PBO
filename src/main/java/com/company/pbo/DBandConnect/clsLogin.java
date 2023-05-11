package com.company.pbo.DBandConnect;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mihaly
 */
public class clsLogin extends DBCon{
    
    public void Login(String Password, String Nama){
        sql = "SELECT * FROM `akun` WHERE `Username` = '"+Nama+"' AND `Password` = '"+Password+"' LIMIT 1";
        
        
    }
    public void newAccount(String Password, String Nama){
        String ID = "";
        sql = "INSERT INTO `akun`(`Username`, `Password`) VALUES ('"+Nama+"','"+Password+"')";
    }
}
