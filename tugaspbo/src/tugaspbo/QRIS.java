/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import static tugaspbo.DBConnector.connection;

/**
 *
 * @author Acer
 */
public class QRIS extends transaksi implements Pembayaran{
    private float totalHarga;
    private LocalDateTime waktuPembayaran;
    private int IDPembayaran;
    private String paymentMethod;

    private String content;
    private LocalDateTime requestDate;
    private String invoiceID;
    
    private static String NMID = "ID1020044722814";
    
    public void insertQrisDetails()
    {
        try{
            
            String sql = 
            "insert into qris " +
            "(qriscontent,invoice_ID,NMID) values " +
            "(?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, content);
            statement.setInt(2, IDPembayaran);
            statement.setString(3,NMID);
            
            int rowInserted = statement.executeUpdate();
            if(rowInserted > 0){
                System.out.println("succesfully adding new qris_details");
            }
            
            statement.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public String getNMID(){
        return NMID;
    }
    
    
    public String getContent(){
        return content;
    }
    
    public void setContent(String _input){
        content = _input;
    }
    
    public LocalDateTime getRequestDate(){
        return requestDate;
    }
    
    public void setRequestDate(LocalDateTime _input){
        requestDate = _input;
    }
    
    public String getInvoiceID(){
        return invoiceID;
    }
    
    public void setInvoiceID(String _input){
        invoiceID = _input;
    }
    
    @Override
    public float getTotalHarga() {
        return totalHarga;
    }

    @Override

    public void setTotalHarga(float totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public LocalDateTime getWaktuPembayaran() {
        return waktuPembayaran;
    }

    @Override
    public void setWaktuPembayaran(LocalDateTime waktuPembayaran) {
        this.waktuPembayaran = waktuPembayaran;
    }

    @Override
    public int getIDPembayaran() {
        return IDPembayaran;
    }

    @Override
    public void setIDPembayaran(int _IDPembayaran) {
        this.IDPembayaran = _IDPembayaran;
    }

    @Override
    public void setPaymentMethod(String _paymentMethod) {
        paymentMethod = _paymentMethod;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }
}
