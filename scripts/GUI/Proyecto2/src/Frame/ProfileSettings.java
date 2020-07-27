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
public class ProfileSettings extends javax.swing.JFrame {

    /**
     * Creates new form ProfileSettings
     */
    public ProfileSettings() {
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
        jLabel1 = new javax.swing.JLabel();
        ButtonWishlist = new javax.swing.JButton();
        ButtonPicture = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        FieldMiddleName = new javax.swing.JTextField();
        FieldLastName = new javax.swing.JTextField();
        FieldId = new javax.swing.JTextField();
        FieldBirthday = new javax.swing.JFormattedTextField();
        FieldEmail = new javax.swing.JTextField();
        FieldPhone = new javax.swing.JTextField();
        FieldUsername = new javax.swing.JTextField();
        FieldPassword = new javax.swing.JTextField();
        BoxCountry = new javax.swing.JComboBox<>();
        BoxState = new javax.swing.JComboBox<>();
        BoxCity = new javax.swing.JComboBox<>();
        BoxDistrict = new javax.swing.JComboBox<>();
        BoxNationality = new javax.swing.JComboBox<>();
        BoxGender = new javax.swing.JComboBox<>();
        BoxPayment = new javax.swing.JComboBox<>();
        Decoration = new javax.swing.JPanel();
        PanelDecoration1 = new javax.swing.JPanel();
        PanelDecoration2 = new javax.swing.JPanel();
        ButtonCancel = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        ButtonWishlist1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        BoxUserType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 40, 130));
        jLabel1.setText("Profile Settings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        ButtonWishlist.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlist.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlist.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/like.png"))); // NOI18N
        ButtonWishlist.setText(" Wishlist");
        ButtonWishlist.setBorder(null);
        ButtonWishlist.setContentAreaFilled(false);
        jPanel1.add(ButtonWishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 121, 50));

        ButtonPicture.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPicture.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonPicture.setForeground(new java.awt.Color(76, 40, 130));
        ButtonPicture.setText("Picture");
        ButtonPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 40, 130), 2, true));
        ButtonPicture.setContentAreaFilled(false);
        jPanel1.add(ButtonPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 120, 150));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 40, 130));
        jLabel4.setText("Middle name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 40, 130));
        jLabel8.setText("Birthday:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 40, 130));
        jLabel11.setText("Gender:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 40, 130));
        jLabel9.setText("Id:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 40, 130));
        jLabel10.setText("Nationality:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 40, 130));
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 40, 130));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 40, 130));
        jLabel5.setText("Last name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 40, 130));
        jLabel12.setText("District:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(76, 40, 130));
        jLabel14.setText("Residence");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 40, 130));
        jLabel15.setText("Country:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 40, 130));
        jLabel16.setText("State:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(76, 40, 130));
        jLabel17.setText("City:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(76, 40, 130));
        jLabel18.setText("Username:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(76, 40, 130));
        jLabel19.setText("Password:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 40, 130));
        jLabel13.setText("Phone number:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(76, 40, 130));
        jLabel20.setText("Payment method:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        FieldName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 190, 30));

        FieldMiddleName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldMiddleName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 150, 190, 30));

        FieldLastName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldLastName.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 190, 190, 30));

        FieldId.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldId.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 190, 30));

        FieldBirthday.setForeground(new java.awt.Color(76, 40, 130));
        FieldBirthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        FieldBirthday.setCaretColor(new java.awt.Color(76, 40, 130));
        FieldBirthday.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FieldBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPanel1.add(FieldBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 120, 30));

        FieldEmail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldEmail.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 230, 190, 30));

        FieldPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldPhone.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 190, 30));

        FieldUsername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldUsername.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 350, 190, 30));

        FieldPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        FieldPassword.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(FieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 390, 190, 30));

        BoxCountry.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCountry.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 310, 170, 30));

        BoxState.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxState.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 350, 170, 30));

        BoxCity.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCity.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 390, 170, 30));

        BoxDistrict.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxDistrict.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 170, 30));

        BoxNationality.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxNationality.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 170, 30));

        BoxGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxGender.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 170, 30));

        BoxPayment.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxPayment.setForeground(new java.awt.Color(76, 40, 130));
        jPanel1.add(BoxPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 170, 30));

        Decoration.setBackground(new java.awt.Color(255, 255, 255));
        Decoration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDecoration1.setBackground(new java.awt.Color(76, 40, 130));

        javax.swing.GroupLayout PanelDecoration1Layout = new javax.swing.GroupLayout(PanelDecoration1);
        PanelDecoration1.setLayout(PanelDecoration1Layout);
        PanelDecoration1Layout.setHorizontalGroup(
            PanelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        PanelDecoration1Layout.setVerticalGroup(
            PanelDecoration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Decoration.add(PanelDecoration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 580));

        PanelDecoration2.setBackground(new java.awt.Color(239, 184, 16));

        javax.swing.GroupLayout PanelDecoration2Layout = new javax.swing.GroupLayout(PanelDecoration2);
        PanelDecoration2.setLayout(PanelDecoration2Layout);
        PanelDecoration2Layout.setHorizontalGroup(
            PanelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        PanelDecoration2Layout.setVerticalGroup(
            PanelDecoration2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Decoration.add(PanelDecoration2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 580));

        ButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonCancel.setForeground(new java.awt.Color(76, 40, 130));
        ButtonCancel.setText("Cancel");
        ButtonCancel.setBorder(null);
        Decoration.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 110, 30));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setText("Confirm");
        ButtonConfirm.setBorder(null);
        Decoration.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 110, 30));

        ButtonWishlist1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonWishlist1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonWishlist1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonWishlist1.setText("Products");
        ButtonWishlist1.setBorder(null);
        ButtonWishlist1.setContentAreaFilled(false);
        Decoration.add(ButtonWishlist1, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 355, 120, 40));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(76, 40, 130));
        jLabel21.setText("User type:");
        Decoration.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        BoxUserType.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxUserType.setForeground(new java.awt.Color(76, 40, 130));
        Decoration.add(BoxUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 170, -1));

        jPanel1.add(Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCity;
    private javax.swing.JComboBox<String> BoxCountry;
    private javax.swing.JComboBox<String> BoxDistrict;
    private javax.swing.JComboBox<String> BoxGender;
    private javax.swing.JComboBox<String> BoxNationality;
    private javax.swing.JComboBox<String> BoxPayment;
    private javax.swing.JComboBox<String> BoxState;
    private javax.swing.JComboBox<String> BoxUserType;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonPicture;
    private javax.swing.JButton ButtonWishlist;
    private javax.swing.JButton ButtonWishlist1;
    private javax.swing.JPanel Decoration;
    private javax.swing.JFormattedTextField FieldBirthday;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldId;
    private javax.swing.JTextField FieldLastName;
    private javax.swing.JTextField FieldMiddleName;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldPassword;
    private javax.swing.JTextField FieldPhone;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JPanel PanelDecoration1;
    private javax.swing.JPanel PanelDecoration2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
