/**
 * @author Juan Manuel Nava Rosales
 * @date 11/septiembre/2022
 * @brief Bidif Cipher Algorithm - View
 * @version 1.0
 */

package Vista;
import Controlador.Bifid;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
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

        labTitulo = new javax.swing.JLabel();
        labKey = new javax.swing.JLabel();
        tfKey = new javax.swing.JTextField();
        labMsg = new javax.swing.JLabel();
        tfMsg = new javax.swing.JTextField();
        bEncrypt = new javax.swing.JButton();
        bDecrypt = new javax.swing.JButton();
        labResult = new javax.swing.JLabel();
        labResult1 = new javax.swing.JLabel();
        labResultMsg = new javax.swing.JLabel();
        labResult3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BC - PRACTICE 1");
        setName("Principal"); // NOI18N
        setResizable(false);

        labTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labTitulo.setText("Bifid Cipher (419048901)");

        labKey.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labKey.setText("Key:");

        tfKey.setEditable(false);
        tfKey.setText("ENCRYPT");
        tfKey.setToolTipText("");
        tfKey.setEnabled(false);
        tfKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeyActionPerformed(evt);
            }
        });

        labMsg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labMsg.setText("Text:");

        tfMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMsgActionPerformed(evt);
            }
        });

        bEncrypt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEncrypt.setText("ENCRYPT");
        bEncrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEncryptMouseClicked(evt);
            }
        });
        bEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEncryptActionPerformed(evt);
            }
        });

        bDecrypt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bDecrypt.setText("DECRYPT");
        bDecrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDecryptMouseClicked(evt);
            }
        });
        bDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecryptActionPerformed(evt);
            }
        });

        labResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labResult.setForeground(new java.awt.Color(102, 0, 0));
        labResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labResult1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labResult1.setForeground(new java.awt.Color(204, 0, 0));
        labResult1.setText("Cipher Text");

        labResultMsg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labResultMsg.setForeground(new java.awt.Color(0, 0, 51));
        labResultMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labResult3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labResult3.setForeground(new java.awt.Color(0, 0, 204));
        labResult3.setText("Decrypted Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bEncrypt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(bDecrypt))
                            .addComponent(labTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labKey)
                                    .addComponent(labMsg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMsg)
                                    .addComponent(tfKey))))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labResult1)
                        .addGap(108, 108, 108))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labResult, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(labResultMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(labResult3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labKey)
                    .addComponent(tfKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMsg)
                    .addComponent(tfMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEncrypt)
                    .addComponent(bDecrypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResult1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResult3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResultMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKeyActionPerformed

    private void tfMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMsgActionPerformed

    private void bDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDecryptActionPerformed

    private void bEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEncryptActionPerformed

    private void bEncryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEncryptMouseClicked
        if(tfMsg.getText().matches("[A-Z]*")){
            labResult.setText( Bifid.Encryption( Bifid.PermutAlphabet,tfMsg.getText()) );
            labResultMsg.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Enter text in uppercase and without letters. [A-Z]",
               "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_bEncryptMouseClicked

    private void bDecryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDecryptMouseClicked
        if(tfMsg.getText().matches("[A-Z]*")){
            labResultMsg.setText( Bifid.Decryption(Bifid.PermutAlphabet,tfMsg.getText()) );
        labResult.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Enter text in uppercase and without letters. [A-Z]",
               "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_bDecryptMouseClicked

    public static void GUIPrincipal() {
        /* LOOK AND FEEL */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* SHOW DISPLAY */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDecrypt;
    private javax.swing.JButton bEncrypt;
    private javax.swing.JLabel labKey;
    private javax.swing.JLabel labMsg;
    private javax.swing.JLabel labResult;
    private javax.swing.JLabel labResult1;
    private javax.swing.JLabel labResult3;
    private javax.swing.JLabel labResultMsg;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField tfKey;
    private javax.swing.JTextField tfMsg;
    // End of variables declaration//GEN-END:variables
}
