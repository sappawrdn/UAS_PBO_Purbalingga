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
public class Token extends Item{
    public String tokenCode;
    public float nominal;
    public String noMeteran;
    public int id_transaksi;
    public int id_item;
    
    public void insertToken(Token token) {
        try  {
            String sql = "INSERT INTO token (id_item, id_transaksi, token_code, no_meteran, harga, nominal) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = DBConnector.connection.prepareStatement(sql);
            
            statement.setInt(1, token.getId_item());
            statement.setInt(2, token.getId_transaksi());
            statement.setString(3, token.getTokenCode());
            statement.setString(4, token.getNoMeteran());
            statement.setFloat(5, token.getHarga());
            statement.setFloat(6, token.getNominal());
            
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the tokenCode
     */
    public String getTokenCode() {
        return tokenCode;
    }

    /**
     * @param tokenCode the tokenCode to set
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * @return the nominal
     */
    public float getNominal() {
        return nominal;
    }

    /**
     * @param nominal the nominal to set
     */
    public void setNominal(float nominal) {
        this.nominal = nominal;
    }

    /**
     * @return the noMeteran
     */
    public String getNoMeteran() {
        return noMeteran;
    }

    /**
     * @param noMeteran the noMeteran to set
     */
    public void setNoMeteran(String noMeteran) {
        this.noMeteran = noMeteran;
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
}
