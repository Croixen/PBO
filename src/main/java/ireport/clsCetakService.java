/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ireport;

import com.company.pbo.DBandConnect.DBCon;
import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author Mihaly
 */
public class clsCetakService extends DBCon{
   
    String TanggalDari;
    String TanggalHingga;
    
   
     void setDate(String TanggalDari, String TanggalHingga){
        this.TanggalDari = TanggalDari;
        this.TanggalHingga = TanggalHingga;
    }
}
