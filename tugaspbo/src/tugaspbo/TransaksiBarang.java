/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import static tugaspbo.DBConnector.connection;

/**
 *
 * @author Acer
 */
public class TransaksiBarang {
    
    private int transaksibarangid;
    
    public ArrayList<Integer> daftarIdBarang = new ArrayList();
    public ArrayList<Integer> daftarJumlahBarang = new ArrayList();
    public ArrayList<Float> daftarHargaBarang = new ArrayList();
    
    public void insertDetailTransaksi(){
        try{
            
            String sql = "INSERT INTO transaksi_barang (id_transaksi,id_barang,jumlah_barang,harga_barang) VALUES (?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            for( int i = 0;i<daftarIdBarang.size();i++){
                
                
                statement.setInt(1, transaksibarangid);
                statement.setFloat(2, daftarIdBarang.get(i));
                statement.setFloat(3,daftarJumlahBarang.get(i));
                statement.setFloat (4,daftarHargaBarang.get(i));
            
                int rowInserted = statement.executeUpdate();
                
                if(rowInserted > 0){
                    System.out.println("succesfully adding new transaction detail");
                }
            }
            
            statement.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void setDetailTransactionID(int input){
        transaksibarangid = input;
    }
    
    public int getDetailTransactionID(){
        return transaksibarangid;
    }
    
}
