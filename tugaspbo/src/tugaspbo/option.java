/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author Acer
 */
public class option extends javax.swing.JFrame {

    /**
     * Creates new form option
     */
    public option() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonKadaluarsa = new javax.swing.JButton();
        ButtonBelanja = new javax.swing.JButton();
        ButtonToken = new javax.swing.JButton();
        ButtonPulsa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonKadaluarsa.setBackground(new java.awt.Color(204, 204, 204));
        ButtonKadaluarsa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ButtonKadaluarsa.setText("Cek Kadaluarsa");
        ButtonKadaluarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKadaluarsaActionPerformed(evt);
            }
        });

        ButtonBelanja.setBackground(new java.awt.Color(204, 204, 204));
        ButtonBelanja.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ButtonBelanja.setText("Belanja");
        ButtonBelanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBelanjaActionPerformed(evt);
            }
        });

        ButtonToken.setBackground(new java.awt.Color(204, 204, 204));
        ButtonToken.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ButtonToken.setText("Token Listrik");
        ButtonToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTokenActionPerformed(evt);
            }
        });

        ButtonPulsa.setBackground(new java.awt.Color(204, 204, 204));
        ButtonPulsa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ButtonPulsa.setText("Pulsa");
        ButtonPulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPulsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ButtonKadaluarsa)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonPulsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonToken, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(ButtonBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ButtonPulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonToken, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(ButtonBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKadaluarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKadaluarsaActionPerformed
        // TODO add your handling code here:
        dispose();
            POSFrameMakanan mainForm = new POSFrameMakanan();
            mainForm.setVisible(true);
    }//GEN-LAST:event_ButtonKadaluarsaActionPerformed

    private void ButtonBelanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBelanjaActionPerformed
        // TODO add your handling code here:
        dispose();
            POSFrame mainForm = new POSFrame();
            mainForm.setVisible(true);
    }//GEN-LAST:event_ButtonBelanjaActionPerformed

    private void ButtonTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTokenActionPerformed

    private void ButtonPulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPulsaActionPerformed
        // TODO add your handling code here:
        dispose();
//            PulsaForm mainForm = new PulsaForm();
//            mainForm.setVisible(true);
        
    }//GEN-LAST:event_ButtonPulsaActionPerformed

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
            java.util.logging.Logger.getLogger(option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBelanja;
    private javax.swing.JButton ButtonKadaluarsa;
    private javax.swing.JButton ButtonPulsa;
    private javax.swing.JButton ButtonToken;
    // End of variables declaration//GEN-END:variables
}
