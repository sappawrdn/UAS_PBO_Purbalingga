/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static tugaspbo.DBConnector.connection;

/**
 *
 * @author Acer
 */
public class transaksi {
    
    public Float total_bayar;
    public float total_kembalian;
    
     public int generateRandomTransactionID(){
        Random rand = new Random();
        int randomNum = rand.nextInt(1000000);
        return randomNum;
    }
     
     public void insertDataTransaksi(
            int _transactionID, 
            float _totalHarga, 
            float _totalBayar, 
            float _kembalian,
            String _paymentMethod
    )
             
      {
        try{
            
            String sql = "INSERT INTO TRANSAKSI (id_transaksi,total_harga,total_bayar,total_kembalian,payment_method) VALUES (?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, _transactionID);
            statement.setFloat(2, _totalHarga);
            statement.setFloat(3,_totalBayar);
            statement.setFloat(4, _kembalian);
            statement.setString(5, _paymentMethod);
            
            int rowInserted = statement.executeUpdate();
            if(rowInserted > 0){
                System.out.println("success adding new transaction");
            }
            
            statement.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
     
      public void setTotalBayar(float input){
        total_bayar = input;
    }
    
    public float getTotalBayar(){
        return total_bayar;
    }
    
    public void setKembalian(float input){
        total_kembalian = input;
    }
    
    public float getKembalian(){
        return total_kembalian;
    }
    
}
