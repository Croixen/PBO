/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pbo.DBandConnect;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;


/**
 *
 * @author Mihaly
 */
public class clsDaftarList extends DBCon {
    
    public void Output(){
        sql = "SELECT `SID`, `SKU`, `Brand`, `NamaCustomer`, `NoTelepon`, `TanggalMasuk`, `StatusPerbaikan`, akun.ID ,`NamaPetugas`, `Progress`, `TanggalKeluar` FROM (`services` LEFT JOIN `akun` ON services.NamaPetugas = akun.Username)";
    }
    
    public void Save(String SKU, String Brand, String Customer, String Tel, Date TglMsk, String Status, String Petugas, String Progress){
        LocalDate TglMasuk = TglMsk.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        sql = "INSERT INTO `services`(`SKU`, `Brand`, `NamaCustomer`, `NoTelepon`, `TanggalMasuk`, `StatusPerbaikan`, `NamaPetugas`, `Progress`, `TanggalKeluar`) VALUES ('"+SKU+"','"+Brand+"','"+Customer+"','"+Tel+"','"+TglMasuk+"','"+Status+"','"+Petugas+"','"+Progress+"', NULL);";
    }
    public void Edit(String ID, String SKU, String Brand, String Customer, String Tel, Date TglMsk, String Status, String Petugas, String Progress){
        LocalDate TglMasuk = TglMsk.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        sql = "UPDATE `services` SET `SKU`='"+SKU+"',`Brand`='"+Brand+"',`NamaCustomer`='"+Customer+"',`NoTelepon`='"+Tel+"',`TanggalMasuk`='"+TglMasuk+"',`StatusPerbaikan`='"+Status+"',`NamaPetugas`='"+Petugas+"',`Progress`='"+Progress+"' WHERE `SID` = '"+ID+"'";
        //Cannot add or update a child row: a foreign key constraint fails (`projectpbo`.`services`, CONSTRAINT `services` FOREIGN KEY (`NamaPetugas`) REFERENCES `akun` (`Username`))
    }
    
     public void Selesai(String ID, String Status, String Progress){
       LocalDate now = LocalDate.now();
        
        sql = "UPDATE `services` SET `TanggalKeluar`='"+now+"', `StatusPerbaikan`='"+Status+"', `Progress`='"+Progress+"'  WHERE `SID` = '"+ID+"'";
    }
    public void Hapus(String ID){
        sql="DELETE FROM `services` WHERE `SID` = '"+ID+"';";
    }
}
