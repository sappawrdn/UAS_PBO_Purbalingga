/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class Pulsa extends Item{
    private String nominal;
    private String operator;
    private String noTelp;
    private int id_item;
    private int id_transaksi;
    
    public void insertPulsa(Pulsa pulsa) {
        try  {
            String sql = "INSERT INTO pulsa (id_item, id_transaksi, operator, no_telepon, harga, nominal) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = DBConnector.connection.prepareStatement(sql);

            statement.setInt(1, pulsa.getId_item());
            statement.setInt(2, pulsa.getId_transaksi());
            statement.setString(3, pulsa.getOperator());
            statement.setString(4, pulsa.getNoTelp());
            statement.setFloat(5, pulsa.getHarga());
            statement.setString(6, pulsa.getNominal());
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        public String getNominal() {
        return nominal;
    }

    /**
     * @param nominal the nominal to set
     */
    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the noTelp
     */
    public String getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    /**
     * @return the id_item
     */
    public int getId_item() {
        return id_item;
    }

    /**
     * @param id_item the id_item to set
     */
    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    /**
     * @return the id_transaksi
     */
    public int getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
}
