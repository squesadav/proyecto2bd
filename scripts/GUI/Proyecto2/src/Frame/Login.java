/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

/**
 *
 * @author sebas
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
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

        jPanel1 = new javax.swing.JPanel();
        PanelBackground = new javax.swing.JPanel();
        PanelLogin = new javax.swing.JPanel();
        IconSignIn = new javax.swing.JLabel();
        IconPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldPassword = new javax.swing.JTextField();
        FieldUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ButtonConfirm = new javax.swing.JButton();
        PanelDecoration = new javax.swing.JPanel();
        ButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setBackground(new java.awt.Color(76, 40, 130));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        PanelLogin.add(IconSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        IconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/padlock.png"))); // NOI18N
        PanelLogin.add(IconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register here");
        PanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        PanelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        PanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        FieldPassword.setBackground(new java.awt.Color(76, 40, 130));
        FieldPassword.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        FieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        FieldPassword.setBorder(null);
        PanelLogin.add(FieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 150, -1));

        FieldUsername.setBackground(new java.awt.Color(76, 40, 130));
        FieldUsername.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        FieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        FieldUsername.setBorder(null);
        PanelLogin.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, -1));
        PanelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 185, 150, 10));
        PanelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 465, 86, 10));
        PanelLogin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 365, 150, 10));

        ButtonConfirm.setBackground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setText("Confirm");
        ButtonConfirm.setAlignmentX(0.5F);
        ButtonConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ButtonConfirm.setContentAreaFilled(false);
        PanelLogin.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 390, 120, 40));

        PanelBackground.add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

        PanelDecoration.setBackground(new java.awt.Color(239, 184, 16));

        javax.swing.GroupLayout PanelDecorationLayout = new javax.swing.GroupLayout(PanelDecoration);
        PanelDecoration.setLayout(PanelDecorationLayout);
        PanelDecorationLayout.setHorizontalGroup(
            PanelDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        PanelDecorationLayout.setVerticalGroup(
            PanelDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        PanelBackground.add(PanelDecoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 580));

        ButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack.setBorder(null);
        ButtonBack.setContentAreaFilled(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        PanelBackground.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 10, 50, 50));

        jPanel1.add(PanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        PanelPrincipalPage m = new PanelPrincipalPage();
        m.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JTextField FieldPassword;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JLabel IconPassword;
    private javax.swing.JLabel IconSignIn;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelDecoration;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
