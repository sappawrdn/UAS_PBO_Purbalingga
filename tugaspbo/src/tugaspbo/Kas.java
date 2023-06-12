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
public class Kas extends transaksi implements Pembayaran{
    private float totalHarga;
    private LocalDateTime waktuPembayaran;
    private int IDPembayaran;
    private String paymentMethod;

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
    public void setWaktuPembayaran(LocalDateTime waktuPembayaran) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
