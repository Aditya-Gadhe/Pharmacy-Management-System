/*

code for updating user i.e pharmacist or admin
this can be done by admin only
admin can search user by it's ID and can update it
updates will be permanent 
(admin panel)

*/
package pharmacy_management_system;

import Connection.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;


public class UpdateUser extends javax.swing.JFrame {

    private String userName;
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    private String mobileNoPattern = "^[0-9]*$";
    
    public UpdateUser() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldupdateuserName = new javax.swing.JTextField();
        jButtonupdateSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFielduserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldmobno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldadd = new javax.swing.JTextField();
        jButtonupdate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 10, 20, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 850, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 70, 20));

        jTextFieldupdateuserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldupdateuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldupdateuserNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldupdateuserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 312, -1));

        jButtonupdateSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonupdateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButtonupdateSearch.setText("search");
        jButtonupdateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonupdateSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("User Role");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 165, 300, -1));

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        jComboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoleActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 209, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, -1));

        jTextFielduserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFielduserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielduserNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielduserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 338, 300, -1));
        getContentPane().add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 311, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 165, 300, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 200, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mobile Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 250, 300, -1));

        jTextFieldmobno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldmobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 285, 300, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 338, 300, -1));

        jTextFieldadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaddActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 373, 300, -1));

        jButtonupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonupdate.setText("update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonupdateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateSearchActionPerformed
        int checkUserExists = 0;
        userName = jTextFieldupdateuserName.getText();
        if(userName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "please enter username");
        }
        else
        {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
            try
            {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from appuser where username = '"+userName+"' ");
                while(rs.next())
                {
                    //jTextFieldupdateuserName.setEditable(false);
                    checkUserExists = 1;
                    jTextFielduserName.setText(rs.getString("name"));
                    jTextFieldEmail.setText(rs.getString("email"));
                    jTextFieldmobno.setText(rs.getString("mobileNumber"));
                    jTextFieldadd.setText(rs.getString("address"));
                    String dob = rs.getString("dob");
                    if(dob != "")
                    {
                        try
                        {
                            jDateChooser.setDate(dFormat.parse(dob));
                        }
                        catch(Exception e)
                        {
                            
                        }
                    }
                    if(rs.getString("userRole").equals("Admin"))
                    {
                        jComboBoxRole.removeAllItems();
                        jComboBoxRole.addItem("Admin");
                        jComboBoxRole.addItem("Pharmacist");
                    }
                    else
                    {
                        jComboBoxRole.removeAllItems();
                        jComboBoxRole.addItem("Pharmacist");
                        jComboBoxRole.addItem("Admin");
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            if(checkUserExists == 0)
            {
                JOptionPane.showMessageDialog(null, "username does not exist");
            }
        }
       
    }//GEN-LAST:event_jButtonupdateSearchActionPerformed

    private void jTextFieldupdateuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldupdateuserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldupdateuserNameActionPerformed

    private void jTextFielduserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielduserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielduserNameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldmobnoActionPerformed

    private void jTextFieldaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaddActionPerformed

    private void jComboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoleActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        String userRole = (String) jComboBoxRole.getSelectedItem();
        String name = jTextFielduserName.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date date =jDateChooser.getDate();
        String dob = "";
        if(date != null )
        {
            dob = dFormat.format(jDateChooser.getDate());
        }
        String email = jTextFieldEmail.getText();
        String mobNo = jTextFieldmobno.getText();
        String add = jTextFieldadd.getText();
        
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "name field is required");
        }
        else if(dob.equals(""))
        {
            JOptionPane.showMessageDialog(null, "DOB field is required");
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "email field is required");
        }
        else if(!email.matches(emailPattern))
        {
            JOptionPane.showMessageDialog(null, "entered email format is invalid");
        }
        else if(mobNo.equals(""))
        {
            JOptionPane.showMessageDialog(null, "mobile number field is required");
        }
        else if(!mobNo.matches(mobileNoPattern) || mobNo.length() != 10)
        {
            JOptionPane.showMessageDialog(null,"enterted mobile number format is invalid");
        }
        else if(add.equals(""))
        {
            JOptionPane.showMessageDialog(null, "address field is required");
        }
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update appuser set userRole = ?, name = ? ,dob = ? ,mobileNumber = ?,email = ?,address = ? where username = ?");
                ps.setString(1, userRole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, mobNo);
                ps.setString(5, email);
                ps.setString(6, add);
                ps.setString(7, userName);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "user updated sucessfully");
                setVisible(false);
                new UpdateUser().setVisible(true);


            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    
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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JButton jButtonupdateSearch;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldadd;
    private javax.swing.JTextField jTextFieldmobno;
    private javax.swing.JTextField jTextFieldupdateuserName;
    private javax.swing.JTextField jTextFielduserName;
    // End of variables declaration//GEN-END:variables
}
