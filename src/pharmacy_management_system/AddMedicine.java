/*

code for add medine (pharmacist panel)
add data in db table medicine

*/
package pharmacy_management_system;

import java.sql.*;
import Connection.ConnectionProvider;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class AddMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    public AddMedicine() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMedID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMedName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMedCompanyName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMedQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMedPPU = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 104, 300, -1));

        jTextFieldMedID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 139, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 190, 300, -1));

        jTextFieldMedName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 225, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 277, 300, -1));

        jTextFieldMedCompanyName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 312, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 353, 300, -1));

        jTextFieldMedQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 388, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Price Per Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 104, 300, -1));

        jTextFieldMedPPU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedPPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 139, 300, -1));

        jButtonSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonSave.setText("save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 180, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 850, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 6, 23, 23));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String medID = jTextFieldMedID.getText();
        String medName = jTextFieldMedName.getText();
        String cmpName = jTextFieldMedCompanyName.getText();
        String medQt = jTextFieldMedQuantity.getText();
        String medPrice = jTextFieldMedPPU.getText();
        
        if(medID.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine Id field is required");
        }
        else if(medName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine Name field is required");
        }
        else if(cmpName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Company Name field is required");
        }
        else if(medQt.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine Price per unit field is required");
        }
        else if(!medQt.matches(numberPattern))
        {
            JOptionPane.showMessageDialog(null, "Medicine Quantity is not valid");
        }
        else if(medPrice.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine Quantity field is required");
        }
        else if(!medPrice.matches(numberPattern))
        {
            JOptionPane.showMessageDialog(null, "Medicine Price per unit is not valid");
        }
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into medicine (ID,name,company,quantity,price) values (?,?,?,?,?)");
                ps.setString(1, medID);
                ps.setString(2, medName);
                ps.setString(3, cmpName);
                ps.setString(4,medQt);
                ps.setString(5,medPrice);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "medicine added sucessfully");
                setVisible(false);
                new AddMedicine().setVisible(true);
                
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldMedCompanyName;
    private javax.swing.JTextField jTextFieldMedID;
    private javax.swing.JTextField jTextFieldMedName;
    private javax.swing.JTextField jTextFieldMedPPU;
    private javax.swing.JTextField jTextFieldMedQuantity;
    // End of variables declaration//GEN-END:variables
}
