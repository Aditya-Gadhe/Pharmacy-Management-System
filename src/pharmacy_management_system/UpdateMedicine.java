/*

code for updating medicine
pharmacist can search medicine by it's ID and can update it
updates will be permanent 
(pharmacist panel)

*/
package pharmacy_management_system;

import Connection.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UpdateMedicine extends javax.swing.JFrame {

    private String numberPattern = "^[0-9]*$";
    public UpdateMedicine() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMedID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMedName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCmpName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPPU = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAddQt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 850, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 102, 83, -1));

        jTextFieldMedID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 99, 300, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 97, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 173, 300, -1));

        jTextFieldMedName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 208, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 249, 300, -1));

        jTextFieldCmpName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldCmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 300, -1));

        jTextFieldQt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldQt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Price Per Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 173, 300, -1));

        jTextFieldPPU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldPPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 208, 300, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(31, 32));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 6, 23, 22));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Add Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 300, -1));

        jTextFieldAddQt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldAddQt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 300, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldQtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int checkMedicineExists = 0;
        String medID = jTextFieldMedID.getText();
        if(medID.equals(""))
        {
            JOptionPane.showMessageDialog(null, "please enter medicine ID");
        }
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from medicine where ID = '"+medID+"' ");
                while(rs.next())
                {
                    checkMedicineExists = 1;
                    jTextFieldMedName.setText(rs.getString("name"));
                    jTextFieldCmpName.setText(rs.getString("company"));
                    jTextFieldQt.setText(rs.getString("quantity"));
                    jTextFieldPPU.setText(rs.getString("price"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            if(checkMedicineExists == 0)
            {
                JOptionPane.showMessageDialog(null, "Medicine ID does not exist");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String medID = jTextFieldMedID.getText();
        String name = jTextFieldMedName.getText();
        String cmpName = jTextFieldCmpName.getText();
        String qt = jTextFieldQt.getText();
        String price = jTextFieldPPU.getText();
        String addQt = jTextFieldAddQt.getText();
        
        qt = String.valueOf(Integer.parseInt(qt) +Integer.parseInt(addQt));
        
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "name field is required");
        }
        else if(cmpName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Company Name field is required");
        }
        else if(qt.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Quantity field is required");
        }
        else if(!qt.matches(numberPattern))
        {
            JOptionPane.showMessageDialog(null,"enterted quantity is invalid");
        }
        else if(!addQt.matches(numberPattern))
        {
            JOptionPane.showMessageDialog(null,"entered add quantity is invalid");
        }
        else if(price.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Price per unit field is required");
        }
        else if(!price.matches(numberPattern))
        {
            JOptionPane.showMessageDialog(null,"entered quantity is invalid");
        }
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update medicine set name = ?, company = ? ,quantity = ? ,price = ? where ID = ?");
                ps.setString(1, name);
                ps.setString(2, cmpName);
                ps.setString(3, qt);
                ps.setString(4, price);
                ps.setString(5, medID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "medicine updated sucessfully");
                setVisible(false);
                new UpdateMedicine().setVisible(true);


            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAddQt;
    private javax.swing.JTextField jTextFieldCmpName;
    private javax.swing.JTextField jTextFieldMedID;
    private javax.swing.JTextField jTextFieldMedName;
    private javax.swing.JTextField jTextFieldPPU;
    private javax.swing.JTextField jTextFieldQt;
    // End of variables declaration//GEN-END:variables
}
