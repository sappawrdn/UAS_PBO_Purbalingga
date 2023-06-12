/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.util.Date;
import static tugaspbo.DBConnector.connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Acer
 */
public class Makanan extends Item {
    
    private Date kadaluarsa;
    
    public Makanan(String code, String name, Date kadaluarsa) {
        this.code = code;
        this.name = name;
        this.kadaluarsa = kadaluarsa;}
    
    public Date getKadaluarsa(){
        return kadaluarsa;
    }
    static ArrayList<Makanan> daftarMakanan;
    
    public static void  loadMakananFromDB() {
        
        daftarMakanan = new ArrayList<Makanan>();
        
        try {
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT item.code, item.name, makanan.kadaluarsa FROM item JOIN makanan ON item.code = makanan.id_barang";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                Date kadaluarsa = rs.getDate("kadaluarsa");
                Makanan makanan = new Makanan(code, name, kadaluarsa);
                daftarMakanan.add(makanan);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
