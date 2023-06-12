/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugaspbo;

import java.time.LocalDateTime;

/**
 *
 * @author Acer
 */
public interface Pembayaran {
    public float getTotalHarga();
    public void setTotalHarga(float totalHarga);
    
    public LocalDateTime getWaktuPembayaran();
    public void setWaktuPembayaran(LocalDateTime waktuPembayaran);
    
    public int getIDPembayaran();
    public void setIDPembayaran(int IDPembayaran);
    
    public void setPaymentMethod(String _paymentMethod);
    public String getPaymentMethod();
    
}
