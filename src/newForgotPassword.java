
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAVINDU
 */
public class newForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form newForgotPassword
     */
    public newForgotPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtSecurityQ = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtAnswer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Forgot Password");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security Question");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password");

        txtUsername.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        txtSecurityQ.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        txtNewPassword.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 51));
        btnReset.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 51, 51));
        btnSearch.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtAnswer.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAnswer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtSecurityQ, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSecurityQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 990, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Forget password.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
       String username =txtUsername.getText();
       try{
          Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/traindb","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select securityQ from newregister where username='"+username+"'");
          if(rs.next())
          {
              txtSecurityQ.setText(rs.getString(1));
          }
          else
              JOptionPane.showMessageDialog(null, "Please write correct Username");
              con.close();
              rs.close();
       }
       catch(Exception e)
         {
         }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        String username = txtUsername.getText();
         String newPassword = txtNewPassword.getText();
          String securityQ = txtSecurityQ.getText();
           String answer = txtAnswer.getText();
           
        
       try{
          Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/traindb","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from newregister where username='"+username+"' and answer = '"+answer+"'");
          if(rs.next())
          {
              st.executeUpdate("Update newregister set password ='"+newPassword+"' where username = '"+username+"' and answer='"+answer+"'");
              JOptionPane.showMessageDialog(null, "Your password is succesfully updated");
              setVisible(false);
              new login().setVisible(true);
              
          }
          else
              JOptionPane.showMessageDialog(null, "Please write correct Username or Answer");
              con.close();
              rs.close();
       }
       catch(Exception e)
         {
         }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        login A = new login();
        A.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(newForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtSecurityQ;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
