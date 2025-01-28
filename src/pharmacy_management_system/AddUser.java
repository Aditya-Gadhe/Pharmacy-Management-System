/*

code for adding new user (admin panel)
add data in db table appuser

*/
package pharmacy_management_system;

import Connection.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import java.util.Date;

public class AddUser extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public int checkUsername = 0;
    
    
    public AddUser() {
        this.setLocationRelativeTo(null);
        initComponents();
        jLabelChecktype.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelUserRole = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelDOB = new javax.swing.JLabel();
        jLabelMobileNo = new javax.swing.JLabel();
        jTextFieldMobileNo = new javax.swing.JTextField();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelChecktype = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 6, -1, 53));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 888, -1));

        jLabelUserRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUserRole.setText("User Role");
        getContentPane().add(jLabelUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 300, -1));

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        jComboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoleActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 300, -1));

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, -1));

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 300, -1));

        jDateChooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 300, -1));

        jLabelDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDOB.setText("DOB (Date of Birth)");
        getContentPane().add(jLabelDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 300, -1));

        jLabelMobileNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMobileNo.setText("Mobile Number");
        getContentPane().add(jLabelMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, -1));

        jTextFieldMobileNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMobileNoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 300, -1));

        jLabelMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMail.setText("Email");
        getContentPane().add(jLabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 300, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 300, -1));

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsername.setText("Username");
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 300, -1));

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, -1));
        getContentPane().add(jLabelChecktype, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 37, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 300, -1));

        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 300, -1));

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAddress.setText("Address");
        getContentPane().add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 300, -1));

        jTextFieldAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 300, -1));

        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonSave.setText("save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoleActionPerformed

    private void jTextFieldMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMobileNoActionPerformed

    private void jTextFieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyReleased
        String userName = jTextFieldUsername.getText();
        if(!userName.equals(""))
        {
            jLabelChecktype.setVisible(true);
            jLabelChecktype.setIcon(new ImageIcon("C:\\Users\\Aditya\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy management system\\src\\images\\yes.png"));
            jLabelChecktype.setText("");
            checkUsername =0;
            try
            {
                Connection con =ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from appuser where username = '"+userName+"' ");
                while(rs.next())
                {
                    checkUsername = 1;
                    jLabelChecktype.setIcon(new ImageIcon("C:\\Users\\Aditya\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy management system\\src\\images\\no.png"));
                    jLabelChecktype.setText("");
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else
        {
            jLabelChecktype.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldUsernameKeyReleased

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        
        String role = (String) jComboBoxRole.getSelectedItem();
        String name = jTextFieldName.getText();
        SimpleDateFormat dFormat =new SimpleDateFormat("dd-MM-yyyy");
        Date date = jDateChooser.getDate();
        String dob = "";
        if(date != null)
        {
            dob = dFormat.format(jDateChooser.getDate());
        }
        String mobno = jTextFieldMobileNo.getText();
        String email = jTextFieldEmail.getText();
        String username = jTextFieldUsername.getText();
        String pass = jTextFieldPassword.getText();
        String address = jTextFieldAddress.getText();
        
        if(role.equals(""))
        {
            JOptionPane.showMessageDialog(null,"role field is required");
        }
        else if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"name field is required");
        }
        else if(dob.equals(""))
        {
            JOptionPane.showMessageDialog(null,"DOB field is required");
        }
        else if(mobno.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Mobile Number field is required");
        }
        else if(!mobno.matches(mobileNumberPattern) || mobno.length() != 10)
        {
            JOptionPane.showMessageDialog(null,"entered mobile number format is invalid");
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null,"email field is required");
        }
        else if(!email.matches(emailPattern))
        {
            JOptionPane.showMessageDialog(null,"enterted email format is invalid");
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"password field is required");
        }
        else if(address.equals(""))
        {
            JOptionPane.showMessageDialog(null,"address field is required");
        }
        else if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null,"username field is required");
        }
        else if(checkUsername == 1)
        {
            JOptionPane.showMessageDialog(null,"username already exists");
        }
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
               PreparedStatement ps= con.prepareStatement("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values (? ,? ,? ,? ,? ,? ,? , ?)");
               ps.setString(1,role);
               ps.setString(2,name);
               ps.setString(3,dob);
               ps.setString(4,mobno);
               ps.setString(5,email);
               ps.setString(6,username);
               ps.setString(7,pass);
               ps.setString(8,address);
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"user added sucessfully");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            
            setVisible(false);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelChecktype;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelMobileNo;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserRole;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMobileNo;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
