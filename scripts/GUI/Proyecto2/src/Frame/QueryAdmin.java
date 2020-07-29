package Frame;

import Connection.ConnectDB;

public class QueryAdmin extends javax.swing.JFrame {
    
    public QueryAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelMostSales = new javax.swing.JPanel();
        ButtonBack = new javax.swing.JButton();
        ButtonConfirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FieldNumberMostSales = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUserMostSales = new javax.swing.JTable();
        PanelMostPurchases = new javax.swing.JPanel();
        ButtonBack1 = new javax.swing.JButton();
        ButtonConfirm1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        FieldNumberMostPurchases = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUserMostPurchases = new javax.swing.JTable();
        PanelBetterRatings = new javax.swing.JPanel();
        ButtonBack2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableUserBetterRatings = new javax.swing.JTable();
        PanelWorseRatings = new javax.swing.JPanel();
        ButtonBack3 = new javax.swing.JButton();
        ButtonBack6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableUserWorseRatings = new javax.swing.JTable();
        PanelExpensiveProducts = new javax.swing.JPanel();
        ButtonBack4 = new javax.swing.JButton();
        ButtonConfirm2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FieldNumberMostSales1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        BoxCategoryExpensive = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListMostExpensive = new javax.swing.JList<>();
        PanelMinimumMaximumProducts = new javax.swing.JPanel();
        ButtonBack5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BoxCategoryExpensive1 = new javax.swing.JComboBox<>();
        ButtonConfirm3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableMinMaxProducts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(79, 40, 130));
        jTabbedPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        PanelMostSales.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostSales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        PanelMostSales.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonConfirm.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm.setText("Confirm");
        ButtonConfirm.setBorder(null);
        ButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmActionPerformed(evt);
            }
        });
        PanelMostSales.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 110, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 40, 130));
        jLabel3.setText("Number of the top:");
        PanelMostSales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        FieldNumberMostSales.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FieldNumberMostSales.setForeground(new java.awt.Color(76, 40, 130));
        FieldNumberMostSales.setBorder(null);
        PanelMostSales.add(FieldNumberMostSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 69, 80, 20));

        jSeparator1.setForeground(new java.awt.Color(76, 40, 130));
        jSeparator1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PanelMostSales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 80, 30));

        TableUserMostSales.setAutoCreateColumnsFromModel(false);
        TableUserMostSales.setAutoCreateRowSorter(true);
        TableUserMostSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableUserMostSales.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableUserMostSales.setForeground(new java.awt.Color(76, 40, 130));
        TableUserMostSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "User", "Sales"
            }
        ));
        TableUserMostSales.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane1.setViewportView(TableUserMostSales);

        PanelMostSales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 340));

        jTabbedPane1.addTab("Top users with the most sales", PanelMostSales);

        PanelMostPurchases.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostPurchases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack1.setBorder(null);
        ButtonBack1.setContentAreaFilled(false);
        ButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack1ActionPerformed(evt);
            }
        });
        PanelMostPurchases.add(ButtonBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonConfirm1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm1.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm1.setText("Confirm");
        ButtonConfirm1.setBorder(null);
        ButtonConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm1ActionPerformed(evt);
            }
        });
        PanelMostPurchases.add(ButtonConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 40, 130));
        jLabel4.setText("Number of the top:");
        PanelMostPurchases.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        FieldNumberMostPurchases.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FieldNumberMostPurchases.setForeground(new java.awt.Color(76, 40, 130));
        FieldNumberMostPurchases.setBorder(null);
        PanelMostPurchases.add(FieldNumberMostPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 69, 80, 20));

        jSeparator2.setForeground(new java.awt.Color(76, 40, 130));
        jSeparator2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PanelMostPurchases.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 80, 30));

        TableUserMostPurchases.setAutoCreateColumnsFromModel(false);
        TableUserMostPurchases.setAutoCreateRowSorter(true);
        TableUserMostPurchases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableUserMostPurchases.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableUserMostPurchases.setForeground(new java.awt.Color(76, 40, 130));
        TableUserMostPurchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "User", "Sales"
            }
        ));
        TableUserMostPurchases.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane2.setViewportView(TableUserMostPurchases);

        PanelMostPurchases.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 340));

        jTabbedPane1.addTab("Top users with the most purchases", PanelMostPurchases);

        PanelBetterRatings.setBackground(new java.awt.Color(255, 255, 255));
        PanelBetterRatings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack2.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack2.setBorder(null);
        ButtonBack2.setContentAreaFilled(false);
        ButtonBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack2ActionPerformed(evt);
            }
        });
        PanelBetterRatings.add(ButtonBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        TableUserBetterRatings.setAutoCreateColumnsFromModel(false);
        TableUserBetterRatings.setAutoCreateRowSorter(true);
        TableUserBetterRatings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableUserBetterRatings.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableUserBetterRatings.setForeground(new java.awt.Color(76, 40, 130));
        TableUserBetterRatings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Seller", "Buyer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUserBetterRatings.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane3.setViewportView(TableUserBetterRatings);

        PanelBetterRatings.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 390));

        jTabbedPane1.addTab("Users with better ratings", PanelBetterRatings);

        PanelWorseRatings.setBackground(new java.awt.Color(255, 255, 255));
        PanelWorseRatings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack3.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack3.setBorder(null);
        ButtonBack3.setContentAreaFilled(false);
        ButtonBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack3ActionPerformed(evt);
            }
        });
        PanelWorseRatings.add(ButtonBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonBack6.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack6.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack6.setBorder(null);
        ButtonBack6.setContentAreaFilled(false);
        ButtonBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack6ActionPerformed(evt);
            }
        });
        PanelWorseRatings.add(ButtonBack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        TableUserWorseRatings.setAutoCreateColumnsFromModel(false);
        TableUserWorseRatings.setAutoCreateRowSorter(true);
        TableUserWorseRatings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableUserWorseRatings.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableUserWorseRatings.setForeground(new java.awt.Color(76, 40, 130));
        TableUserWorseRatings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Seller", "Buyer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUserWorseRatings.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane4.setViewportView(TableUserWorseRatings);

        PanelWorseRatings.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 390));

        jTabbedPane1.addTab("Users with worse ratings", PanelWorseRatings);

        PanelExpensiveProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelExpensiveProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack4.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack4.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack4.setBorder(null);
        ButtonBack4.setContentAreaFilled(false);
        ButtonBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack4ActionPerformed(evt);
            }
        });
        PanelExpensiveProducts.add(ButtonBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        ButtonConfirm2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm2.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm2.setText("Confirm");
        ButtonConfirm2.setBorder(null);
        ButtonConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm2ActionPerformed(evt);
            }
        });
        PanelExpensiveProducts.add(ButtonConfirm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 40, 130));
        jLabel5.setText("Number of the top:");
        PanelExpensiveProducts.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        FieldNumberMostSales1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FieldNumberMostSales1.setForeground(new java.awt.Color(76, 40, 130));
        FieldNumberMostSales1.setBorder(null);
        PanelExpensiveProducts.add(FieldNumberMostSales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 20));

        jSeparator3.setForeground(new java.awt.Color(76, 40, 130));
        jSeparator3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PanelExpensiveProducts.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 40, 130));
        jLabel6.setText("Category:");
        PanelExpensiveProducts.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        BoxCategoryExpensive.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCategoryExpensive.setForeground(new java.awt.Color(76, 40, 130));
        PanelExpensiveProducts.add(BoxCategoryExpensive, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 170, 30));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(76, 40, 130));
        jScrollPane5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        ListMostExpensive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        ListMostExpensive.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ListMostExpensive.setForeground(new java.awt.Color(76, 40, 130));
        ListMostExpensive.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(ListMostExpensive);

        PanelExpensiveProducts.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 260, 300));

        jTabbedPane1.addTab("Top of most expensive products by category", PanelExpensiveProducts);

        PanelMinimumMaximumProducts.setBackground(new java.awt.Color(255, 255, 255));
        PanelMinimumMaximumProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack5.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        ButtonBack5.setForeground(new java.awt.Color(76, 40, 130));
        ButtonBack5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back-arrow.png"))); // NOI18N
        ButtonBack5.setBorder(null);
        ButtonBack5.setContentAreaFilled(false);
        ButtonBack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack5ActionPerformed(evt);
            }
        });
        PanelMinimumMaximumProducts.add(ButtonBack5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 40, 130));
        jLabel7.setText("Category:");
        PanelMinimumMaximumProducts.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        BoxCategoryExpensive1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        BoxCategoryExpensive1.setForeground(new java.awt.Color(76, 40, 130));
        PanelMinimumMaximumProducts.add(BoxCategoryExpensive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 170, 30));

        ButtonConfirm3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonConfirm3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ButtonConfirm3.setForeground(new java.awt.Color(76, 40, 130));
        ButtonConfirm3.setText("Confirm");
        ButtonConfirm3.setBorder(null);
        ButtonConfirm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirm3ActionPerformed(evt);
            }
        });
        PanelMinimumMaximumProducts.add(ButtonConfirm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 110, 30));

        TableMinMaxProducts.setAutoCreateColumnsFromModel(false);
        TableMinMaxProducts.setAutoCreateRowSorter(true);
        TableMinMaxProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 40, 130)));
        TableMinMaxProducts.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        TableMinMaxProducts.setForeground(new java.awt.Color(76, 40, 130));
        TableMinMaxProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Product", "Minimum amount", "Maximum amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMinMaxProducts.setGridColor(new java.awt.Color(76, 40, 130));
        jScrollPane6.setViewportView(TableMinMaxProducts);

        PanelMinimumMaximumProducts.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 390));

        jTabbedPane1.addTab("Minimum and maximum amounts of products by category", PanelMinimumMaximumProducts);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed
      /*  ConnectDB c = new ConnectDB();
        var id = FieldId.getText();
        var first_name = FieldName.getText();
        var middle_name = " ";
        try {
            middle_name = FieldMiddleName.getText();
        }
        catch (NullPointerException e) {}
        var last_name = FieldLastName.getText();
        var email = FieldEmail.getText();
        var phone_number = FieldPhone.getText();
        java.util.Date birthday = null;
        try {
            birthday = new SimpleDateFormat("dd/MM/yy").parse(FieldBirthday.getText());
        }
        catch (Exception e){}
        java.sql.Date birthday_sql = new java.sql.Date(birthday.getTime());
        var picture_path = "";
        var username = FieldUsername.getText();
        var password = FieldPassword.getText();
        String id_gender_element = (String) BoxGender.getSelectedItem();
        String id_district_element = (String) BoxDistrict.getSelectedItem();
        String id_user_type_element = (String) BoxUserType.getSelectedItem();
        if(id_gender_element == "Default")
        JOptionPane.showMessageDialog(this, "Select the gender box.");
        else if(id_district_element == "Default")
        JOptionPane.showMessageDialog(this, "Select the district box.");
        else if(id_user_type_element == "Default")
        JOptionPane.showMessageDialog(this, "Select the user type box.");
        else if(id == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the id field.");
        }
        else if(first_name == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the first name field.");
        }
        else if(last_name == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the last name field.");
        }
        else if(email == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the email field.");
        }
        else if(phone_number == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the email field.");
        }
        else if(FieldBirthday.getText() == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the birthday field.");
        }
        else if(username == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the username field.");
        }
        else if(password == "")
        {
            JOptionPane.showMessageDialog(this, "Fill the username field.");
        }
        else
        {
            try{
                var id_gender = c.getIntWithString(id_gender_element, "getId_gender", false);
                var id_district = c.getIntWithString(id_district_element, "getId_district", false);
                var id_user_type = c.getIntWithString(id_user_type_element, "getId_userType", true);
                person p = new person(id, first_name, middle_name, last_name, email, phone_number, birthday_sql, picture_path, id_gender, id_district, username);
                user u = new user(username, password, 0, 0, id_user_type);
                c.updatePerson(p);
                c.updateUser(u);
                JOptionPane.showMessageDialog(this, "The person was updated successfully in the system.");
            }
            catch(Exception e)
            {
                System.out.println("Error:" +e);
            }
        }*/
    }//GEN-LAST:event_ButtonConfirmActionPerformed

    private void ButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack1ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack1ActionPerformed

    private void ButtonConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonConfirm1ActionPerformed

    private void ButtonBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack2ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack2ActionPerformed

    private void ButtonBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack3ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack3ActionPerformed

    private void ButtonBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack6ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack6ActionPerformed

    private void ButtonBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack4ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack4ActionPerformed

    private void ButtonConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonConfirm2ActionPerformed

    private void ButtonBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack5ActionPerformed
        PanelPrincipalPage w = new PanelPrincipalPage();
        w.show();
        this.dispose();
    }//GEN-LAST:event_ButtonBack5ActionPerformed

    private void ButtonConfirm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirm3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonConfirm3ActionPerformed

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
            java.util.logging.Logger.getLogger(QueryAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCategoryExpensive;
    private javax.swing.JComboBox<String> BoxCategoryExpensive1;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBack1;
    private javax.swing.JButton ButtonBack2;
    private javax.swing.JButton ButtonBack3;
    private javax.swing.JButton ButtonBack4;
    private javax.swing.JButton ButtonBack5;
    private javax.swing.JButton ButtonBack6;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonConfirm1;
    private javax.swing.JButton ButtonConfirm2;
    private javax.swing.JButton ButtonConfirm3;
    private javax.swing.JTextField FieldNumberMostPurchases;
    private javax.swing.JTextField FieldNumberMostSales;
    private javax.swing.JTextField FieldNumberMostSales1;
    private javax.swing.JList<String> ListMostExpensive;
    private javax.swing.JPanel PanelBetterRatings;
    private javax.swing.JPanel PanelExpensiveProducts;
    private javax.swing.JPanel PanelMinimumMaximumProducts;
    private javax.swing.JPanel PanelMostPurchases;
    private javax.swing.JPanel PanelMostSales;
    private javax.swing.JPanel PanelWorseRatings;
    private javax.swing.JTable TableMinMaxProducts;
    private javax.swing.JTable TableUserBetterRatings;
    private javax.swing.JTable TableUserMostPurchases;
    private javax.swing.JTable TableUserMostSales;
    private javax.swing.JTable TableUserWorseRatings;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
