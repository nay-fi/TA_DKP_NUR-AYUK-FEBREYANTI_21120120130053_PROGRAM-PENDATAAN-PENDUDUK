package pendataan_penduduk;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Flogin extends javax.swing.JFrame {
   
    public Flogin() {
        initComponents();
        
    }
    public void hanyaangka(KeyEvent evt){
    if(Character.isAlphabetic(evt.getKeyChar())){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Hanya Boleh Masukkan Angka");
        }
    }
    public void reset(){
        innama.setText("");
        innik.setText("");
        innamaAyah.setText("");
    }
    public void hanyahuruf(KeyEvent avt){
    if(Character.isDigit(avt.getKeyChar())){
           avt.consume();
           JOptionPane.showMessageDialog(null, "Hanya Boleh Masukkan Huruf");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        innama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        innamaAyah = new javax.swing.JTextField();
        innik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(108, 105, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO PENDATAAN PENDUDUK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 23));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        innama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innamaActionPerformed(evt);
            }
        });
        innama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                innamaKeyTyped(evt);
            }
        });
        jPanel1.add(innama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 142, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 471, 10));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Ayah Kandung");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        innamaAyah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                innamaAyahKeyTyped(evt);
            }
        });
        jPanel1.add(innamaAyah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 142, -1));

        innik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                innikKeyTyped(evt);
            }
        });
        jPanel1.add(innik, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 142, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Praktikum DKP\\JAVA\\icon\\wallpaper-login.png")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 461, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String anik = "21120120130053";
        String anama = "Nur Ayuk Febreyanti";
        String aortu = "Bambang";
        if(anik.equalsIgnoreCase(innik.getText())|| anama.equalsIgnoreCase(innama.getText())
                || aortu.equalsIgnoreCase(innamaAyah.getText())){
            this.setVisible(true);
            new Finterface().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "LOGIN FAILED \n\t PLEASE ENTER NAME, NIK, AND FATHER'S NAME CORRECTLY");
            innama.setText("");
            innik.setText("");
            innamaAyah.setText("");
            innik.requestFocus();
        }
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void innamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innamaActionPerformed
        
    }//GEN-LAST:event_innamaActionPerformed

    private void innamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_innamaKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_innamaKeyTyped

    private void innikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_innikKeyTyped
        hanyaangka(evt);
    }//GEN-LAST:event_innikKeyTyped

    private void innamaAyahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_innamaAyahKeyTyped
        hanyahuruf(evt);
    }//GEN-LAST:event_innamaAyahKeyTyped

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
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField innama;
    private javax.swing.JTextField innamaAyah;
    private javax.swing.JTextField innik;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
