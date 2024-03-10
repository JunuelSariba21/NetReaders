/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smallinventorysystem;

import javax.swing.JOptionPane;

/**
 *
 * @author OrnnDeSmith
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public Login() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwdField = new javax.swing.JPasswordField();
        submitLogIn = new javax.swing.JButton();
        submitLogIn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NoAccYext = new javax.swing.JLabel();
        Signupbutton = new javax.swing.JLabel();
        AntStashLogo = new javax.swing.JLabel();
        LoginBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN\n");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(252, 236, 200));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 80, 50, 17);
        jPanel1.add(emailField);
        emailField.setBounds(510, 100, 310, 40);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 180, 80, 17);
        jPanel1.add(pwdField);
        pwdField.setBounds(510, 200, 310, 40);

        submitLogIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloadcheckicon.png"))); // NOI18N
        submitLogIn.setText("SUBMIT");
        submitLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLogInActionPerformed(evt);
            }
        });
        jPanel1.add(submitLogIn);
        submitLogIn.setBounds(681, 250, 140, 34);

        submitLogIn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitLogIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloadleaveicon.png"))); // NOI18N
        submitLogIn1.setText("BACK");
        submitLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLogIn1ActionPerformed(evt);
            }
        });
        jPanel1.add(submitLogIn1);
        submitLogIn1.setBounds(510, 250, 120, 34);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 0);

        NoAccYext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoAccYext.setText("Don't have an account yet?");
        jPanel1.add(NoAccYext);
        NoAccYext.setBounds(510, 350, 220, 25);

        Signupbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Signupbutton.setText("Sign up");
        Signupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupbuttonMouseClicked(evt);
            }
        });
        jPanel1.add(Signupbutton);
        Signupbutton.setBounds(740, 350, 80, 25);

        AntStashLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Login Icon.png"))); // NOI18N
        jPanel1.add(AntStashLogo);
        AntStashLogo.setBounds(0, 0, 490, 490);

        LoginBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20240226_074427_0000.png"))); // NOI18N
        jPanel1.add(LoginBanner);
        LoginBanner.setBounds(470, 0, 350, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLogInActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "LOG IN SUCCESSFUL", "Message", JOptionPane.INFORMATION_MESSAGE);
        new MainFrame().setVisible(true);
        dispose();


    }//GEN-LAST:event_submitLogInActionPerformed

    private void submitLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLogIn1ActionPerformed
        // TODO add your handling code here:
        new FirstMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_submitLogIn1ActionPerformed

    private void SignupbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbuttonMouseClicked
        // TODO add your handling code here:
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_SignupbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AntStashLogo;
    private javax.swing.JLabel LoginBanner;
    private javax.swing.JLabel NoAccYext;
    private javax.swing.JLabel Signupbutton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JButton submitLogIn;
    private javax.swing.JButton submitLogIn1;
    // End of variables declaration//GEN-END:variables
}
