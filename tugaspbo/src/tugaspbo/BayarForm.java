/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspbo;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tugaspbo.transaksi;

/**
 *
 * @author Acer
 */
public class BayarForm extends javax.swing.JFrame {

    private String totalBelanja;
    private TransaksiBarang detailTransaksi = new TransaksiBarang();
    private transaksi trans = new transaksi();
    private DataModel datamodel = new DataModel();
    private DataThrown thrown = new DataThrown();
    private TokenReceipt receipt = new TokenReceipt();
    StatusPembayaran paymentStatusData = new StatusPembayaran();

    private int id_transaksi;
    
    public BayarForm() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bankOption(false);
        QRButton.setVisible(false);
    }
    
    public void setTransaksi(transaksi newtrans){
        trans = newtrans;
    }
    
    public transaksi getTransaksi(){
        return trans;
    }
    
    public void setDetailTransaksi(TransaksiBarang newDetailTransaksi){
        detailTransaksi = newDetailTransaksi;
    }
    
    public TransaksiBarang getDetailTransaksi(){
        return detailTransaksi;
    }
    
    public void bankOption(boolean visibility){
        BankOptionLabel.setVisible(visibility);
        BankComboBox.setVisible(visibility);
        CardNumberLabel.setVisible(visibility);
        NomorKartuTextField.setVisible(visibility);
    }
    
    private String addComma(float _input){
        return String.format("%,.0f", _input);
    }
    
    private float removeComma(String _input){
        String stringInput = _input.replace(",", "");
        return Float.parseFloat(stringInput);
    }
    
    public void getTotalBelanja(String _totalBelanja){
        totalBelanja = _totalBelanja;
        TotalBelanjaTextField.setText(totalBelanja);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TotalBelanjaTextField = new javax.swing.JTextField();
        JumlahBayarTextField = new javax.swing.JTextField();
        MetodeBayarComboBox = new javax.swing.JComboBox<>();
        BankComboBox = new javax.swing.JComboBox<>();
        NomorKartuTextField = new javax.swing.JTextField();
        QRButton = new javax.swing.JButton();
        BayarButton = new javax.swing.JButton();
        BalekTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BankOptionLabel = new javax.swing.JLabel();
        CardNumberLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PAYMENT AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JumlahBayarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBayarTextFieldActionPerformed(evt);
            }
        });

        MetodeBayarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Kartu Debit", "QRIS" }));
        MetodeBayarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodeBayarComboBoxActionPerformed(evt);
            }
        });

        BankComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BNI", "MANDIRI", "BCA", "BRI" }));

        QRButton.setText("QR CODE");
        QRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QRButtonActionPerformed(evt);
            }
        });

        BayarButton.setText("Bayar");
        BayarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("JUMLAH BAYAR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL BELANJA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("METODE BAYAR");

        BankOptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BankOptionLabel.setText("PILIH BANK");

        CardNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CardNumberLabel.setText("NOMOR KARTU");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("KEMBALIAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(BankOptionLabel)
                    .addComponent(jLabel4)
                    .addComponent(CardNumberLabel)
                    .addComponent(jLabel7)
                    .addComponent(BalekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MetodeBayarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomorKartuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BayarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumlahBayarTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahBayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MetodeBayarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankOptionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomorKartuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QRButton)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BayarButton)
                    .addComponent(BalekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BayarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarButtonActionPerformed
        // TODO add your handling code here:
        boolean paymentStatus = false;
        float totalHarga = removeComma(TotalBelanjaTextField.getText());
        float totalBayar = removeComma(JumlahBayarTextField.getText());
        float kembalian = totalBayar - totalHarga;
        
        if(kembalian < 0){
            JOptionPane.showMessageDialog(null, "The amount paid is insufficient to cover the total purchase cost.");
            JumlahBayarTextField.setText("");
            return;
        }
        
        String currentItem = MetodeBayarComboBox.getSelectedItem().toString();
        
        System.out.println("dari bayar form");
        System.out.println(totalHarga);
        System.out.println(totalBayar);
        System.out.println(kembalian);
        System.out.println(currentItem);
        
         receipt.setTotalBayar(totalBayar);
         receipt.setTotalBelanja(totalHarga);
         receipt.setKembalian(kembalian);
         receipt.setPaymentMethod(currentItem);

        if(currentItem.equals("QRIS")){
            System.out.println("you paid using QRIS");
            
            paymentStatus = payWithQris(
                    totalHarga,
                    totalBayar,
                    kembalian,
                    currentItem);
            
            checkPaymentStatus(paymentStatus);
            
        }
        else if(currentItem.equals("Kartu Debit")){
            System.out.println("you paid using Debit");
            
            // bank dan kartu
            
            String cardNumber = NomorKartuTextField.getText();
            
            if(cardNumber.length() != 16){
                JOptionPane.showMessageDialog(null, "Card number length must be 16 digits");
                return;
            }
            

            paymentStatus = payWithCard(
                    totalHarga,
                    totalBayar,
                    kembalian,
                    currentItem);
            
            checkPaymentStatus(paymentStatus);

        }
        else if(currentItem.equals("Cash")){
            System.out.println("you paid using Tunai");
            
            paymentStatus = payWithTunai(
                    totalHarga,
                    totalBayar,
                    kembalian,
                    currentItem);
            
            checkPaymentStatus(paymentStatus);
        }
                for(int i = 0; i < detailTransaksi.daftarIdBarang.size(); i++ ){
                    if(detailTransaksi.daftarIdBarang.get(i) > 24 && detailTransaksi.daftarIdBarang.get(i) < 29 ){
                        int id = detailTransaksi.daftarIdBarang.get(i);
                        float harga =  detailTransaksi.daftarHargaBarang.get(i);
                        float nominal = harga - (harga * 11/100);

                        String meteran = datamodel.getNomorMeteran();

                        Random random = new Random();
                        StringBuilder tokenCodeBuilder = new StringBuilder();

                        for (int j = 0; j < 20; j++) {
                            int randomNumber = random.nextInt(10); // Generate numbers between 0 and 9
                            tokenCodeBuilder.append(randomNumber);
                        }
                        String tokenCode = tokenCodeBuilder.toString();

                        System.out.println(id_transaksi);
                        Token token = new Token();
                        token.setId_item(id);
                        token.setHarga(harga);
                        token.setNominal(nominal);
                        token.setTokenCode(tokenCode);
                        token.setNoMeteran(meteran);
                        token.setId_transaksi(id_transaksi);
                        token.insertToken(token);
                        
                        receipt.setToken(token);
                        receipt.setTotalBayar(totalBayar);
                        receipt.setTotalBelanja(totalHarga);
                        receipt.setKembalian(kembalian);
                        receipt.setPaymentMethod(currentItem);

                    }
                    else if(detailTransaksi.daftarIdBarang.get(i) > 113 && detailTransaksi.daftarIdBarang.get(i) < 138 ){
                        int id = detailTransaksi.daftarIdBarang.get(i);
                        float harga =  detailTransaksi.daftarHargaBarang.get(i);
                        String noTelp = thrown.getNomorTeleponThrown();
                        String operator = thrown.getOperatorPulsaThrown();
                        String nominal = thrown.getNominalPulsaThrown();

                        System.out.println(id_transaksi);
                        Pulsa pulsa = new Pulsa();
                        pulsa.setId_item(id);
                        pulsa.setHarga(harga);
                        pulsa.setNominal(nominal);
                        pulsa.setOperator(operator);
                        pulsa.setNoTelp(noTelp);
                        pulsa.setId_transaksi(id_transaksi);
                        pulsa.insertPulsa(pulsa);
                    }

        }
    }//GEN-LAST:event_BayarButtonActionPerformed

    private void MetodeBayarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodeBayarComboBoxActionPerformed
        // TODO add your handling code here:
        String currentItem = MetodeBayarComboBox.getSelectedItem().toString();
        
        if(currentItem.equals("QRIS")){
            System.out.println("you just choose QRIS");
            QRButton.setVisible(true);
            bankOption(false);
            String totalHarga = TotalBelanjaTextField.getText();
            JumlahBayarTextField.setText(totalHarga);
            
        }
        else if(currentItem.equals("Kartu Debit")){
            System.out.println("you just choose Debit/Kredit");
            QRButton.setVisible(false);
            bankOption(true);
            String totalHarga = TotalBelanjaTextField.getText();
            JumlahBayarTextField.setText(totalHarga);
        }
        else if(currentItem.equals("Cash")){
            System.out.println("you just choose Tunai");
            QRButton.setVisible(false);
            bankOption(false);
            JumlahBayarTextField.setText("");
        }
    }//GEN-LAST:event_MetodeBayarComboBoxActionPerformed

    private void QRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QRButtonActionPerformed
        // TODO add your handling code here:
        QrisForm qrForm = new QrisForm();
        
        qrForm.setVisible(true);
    }//GEN-LAST:event_QRButtonActionPerformed

    private void JumlahBayarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBayarTextFieldActionPerformed
        // TODO add your handling code here:
        String dibayarString = JumlahBayarTextField.getText();
      dibayarString = dibayarString.replace(",", ""); // remove commas from the string

        try {
            float dibayarInput = Float.parseFloat(dibayarString);
            JumlahBayarTextField.setText(String.format("%,.0f", dibayarInput));
        } 
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JumlahBayarTextFieldActionPerformed

    private void checkPaymentStatus(boolean status){
        if(status){
            JOptionPane.showMessageDialog(null, "Payment Success");
            paymentStatusData.setPaymentStatus(status);
            receipt.setIdTransaksi(id_transaksi);
            receipt.setDetailTransaksi(detailTransaksi);
            receipt.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Payment Fail");
        }
    }
    
    
    private boolean payWithQris(
            float _totalHarga,
            float _totalBayar,
            float _kembalian,
            String _paymentMethod
     )
    {
           QRIS useQris = new QRIS();
            
            UniqueGenerator stringGenerator = new UniqueGenerator();
            
            String randomGeneratedContent = stringGenerator.generateRandomString(242);
            
            useQris.setIDPembayaran(useQris.generateRandomTransactionID());
            
            id_transaksi = useQris.getIDPembayaran();
            
            useQris.setTotalHarga(_totalHarga);
            useQris.setTotalBayar(_totalBayar);
            useQris.setKembalian(_kembalian);
            useQris.setPaymentMethod(_paymentMethod);
            useQris.setContent(randomGeneratedContent);
            
            
            useQris.insertDataTransaksi(
                    
                    useQris.getIDPembayaran(), 
                    useQris.getTotalHarga(), 
                    useQris.getTotalBayar(), 
                    useQris.getKembalian(),
                    useQris.getPaymentMethod()
            );
            
            useQris.insertQrisDetails();
            
            
            
            detailTransaksi.setDetailTransactionID(useQris.getIDPembayaran());
            
            detailTransaksi.insertDetailTransaksi();
            
            showKembalian(_kembalian);
            
            return true;
    }
    
    
    
        private boolean payWithCard(
            float _totalHarga,
            float _totalBayar,
            float _kembalian,
            String _paymentMethod
     )
    {
            Debit useDebit = new Debit();
            useDebit.setIDPembayaran(useDebit.generateRandomTransactionID());
            id_transaksi = useDebit.getIDPembayaran();
            useDebit.setTotalHarga(_totalHarga);
            useDebit.setTotalBayar(_totalBayar);
            useDebit.setKembalian(_kembalian);
            useDebit.setPaymentMethod(_paymentMethod);
            
            
            useDebit.insertDataTransaksi(
                    
                    useDebit.getIDPembayaran(), 
                    useDebit.getTotalHarga(), 
                    useDebit.getTotalBayar(), 
                    useDebit.getKembalian(),
                    useDebit.getPaymentMethod()
            );
            
            detailTransaksi.setDetailTransactionID(useDebit.getIDPembayaran());
            
            detailTransaksi.insertDetailTransaksi();
            
            showKembalian(_kembalian);
            
            return true;
    }
    
    private boolean payWithTunai(
            float _totalHarga,
            float _totalBayar,
            float _kembalian,
            String _paymentMethod
            )
    {
        Kas useTunai = new Kas();
            
            useTunai.setIDPembayaran(useTunai.generateRandomTransactionID());
            id_transaksi = useTunai.getIDPembayaran();
            useTunai.setTotalHarga(_totalHarga);
            useTunai.setTotalBayar(_totalBayar);
            useTunai.setKembalian(_kembalian);
            useTunai.setPaymentMethod(_paymentMethod);
            
            
            useTunai.insertDataTransaksi(
                    
                    useTunai.getIDPembayaran(), 
                    useTunai.getTotalHarga(), 
                    useTunai.getTotalBayar(), 
                    useTunai.getKembalian(),
                    useTunai.getPaymentMethod()
            );
            
            detailTransaksi.setDetailTransactionID(useTunai.getIDPembayaran());
            
            detailTransaksi.insertDetailTransaksi();
            
            showKembalian(_kembalian);
            
            return true;
    }
    
    private void showKembalian(float input){
        BalekTextField.setText(addComma(input));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BayarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BayarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BayarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BayarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BayarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BalekTextField;
    private javax.swing.JComboBox<String> BankComboBox;
    private javax.swing.JLabel BankOptionLabel;
    private javax.swing.JButton BayarButton;
    private javax.swing.JLabel CardNumberLabel;
    private javax.swing.JTextField JumlahBayarTextField;
    private javax.swing.JComboBox<String> MetodeBayarComboBox;
    private javax.swing.JTextField NomorKartuTextField;
    private javax.swing.JButton QRButton;
    private javax.swing.JTextField TotalBelanjaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
