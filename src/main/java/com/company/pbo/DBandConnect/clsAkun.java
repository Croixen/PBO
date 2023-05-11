/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pbo.DBandConnect;

/**
 *
 * @author Mihaly
 */
public class clsAkun extends DBCon{
    
    public void gantiUsername (int ID, String newUsername){
        sql = "UPDATE `akun` SET `Username`='"+newUsername+"' WHERE `ID` = '"+ID+"'";
    }
    
    public void gantiPassword(int ID, String newPassword){
        sql = "UPDATE `akun` SET `Password`='"+newPassword+"' WHERE `ID` = '"+ID+"'";
    }
    
}
