/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pbo.DBandConnect;

import java.time.LocalDate;

/**
 *
 * @author Mihaly
 */
public class clsService extends DBCon{
    
    public void show(int ID){
        sql = "SELECT `SID`, `SKU`, `Brand`, `NamaCustomer`, `TanggalMasuk`, `StatusPerbaikan`, `NamaPetugas`, `Progress`, `TanggalKeluar` FROM (`services` LEFT JOIN `akun`ON `NamaPetugas` = akun.Username) WHERE akun.ID = '"+ID+"' ";
    }
    
    public void edit(String Progress, String Status, String SID){
        sql = "UPDATE `services` SET `StatusPerbaikan`='"+Status+"',`Progress`='"+Progress+"' WHERE `SID` = '"+SID+"'";
    }
    
    public void Selesai(String ID, String Status, String Progress){
       LocalDate now = LocalDate.now();
        
        sql = "UPDATE `services` SET `TanggalKeluar`='"+now+"', `StatusPerbaikan`='"+Status+"', `Progress`='"+Progress+"'  WHERE `SID` = '"+ID+"'";
    }
    
}
