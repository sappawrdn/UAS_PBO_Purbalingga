/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.time.LocalDateTime;

/**
 *
 * @author Acer
 */
public class Debit extends transaksi implements Pembayaran {
    
    private float totalHarga;
    private LocalDateTime waktuPembayaran;
    private int IDPembayaran;
    private String paymentMethod;
    
    private String bank;
    private String nomorKartu;
    
    public void setBank(String input){
        bank = input;
    }
    
    public String getBank(){
        return bank;
    }
    
    public void setNomorKartu(String input){
        nomorKartu = input;
    }
    
    public String getNomorKartu(){
        return nomorKartu;
    }
    

    @Override
    public float getTotalHarga() {
        return totalHarga;
    }

    @Override
    public void setTotalHarga(float _totalHarga) {
        totalHarga = _totalHarga;
    }

    @Override
    public LocalDateTime getWaktuPembayaran() {
        return waktuPembayaran;
    }

    @Override
    public void setWaktuPembayaran(LocalDateTime _waktuPembayaran) {
        waktuPembayaran = _waktuPembayaran;
    }

    @Override
    public int getIDPembayaran() {
        return IDPembayaran;
    }

    @Override
    public void setIDPembayaran(int _IDPembayaran) {
        IDPembayaran = _IDPembayaran;
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
