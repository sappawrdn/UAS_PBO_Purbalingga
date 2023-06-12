/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author Acer
 */
public class StatusPembayaran {
    public static boolean paymentStatus;
    
    public void setPaymentStatus(boolean input){
        paymentStatus = input;
    }
    
    public boolean getPaymentStatus(){
        return paymentStatus;
    }
}
