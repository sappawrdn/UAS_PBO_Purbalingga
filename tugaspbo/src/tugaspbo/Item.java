/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Stack;


/**
 *
 * @author Acer
 */
public class Item {
    
    String code;
    String name;
    private Float price;
    
    static ArrayList<Item> daftarItem;

    
    public static void loadItemFromDB()
    {
        daftarItem = new ArrayList<>();
        Item item;
        try {
            Statement stmt = DBConnector.connection.createStatement();
            
            String sql = "SELECT * FROM item";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                item = new Item();
                item.setKode(Integer.toString(rs.getInt("code")));
                item.setNama(rs.getString("name"));
                item.setHarga(rs.getFloat("price"));
                
                daftarItem.add(item);
               
            }
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public String getKode() {
        return code;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.code = kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return name;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.name = nama;
    }

    /**
     * @return the harga
     */
    public float getHarga() {
        return price;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(float harga) {
        this.price = harga;
    }
}
