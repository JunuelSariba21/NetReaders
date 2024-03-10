/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smallinventorysystem;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OrnnDeSmith
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form menuFrame
     */
    DefaultTableModel categoryTable;
    MainFrame mainframe;

    ArrayList<CategoryModel> categList = new ArrayList();

    public Category(MainFrame mainframe) {
        initComponents();
        this.mainframe = mainframe;
        this.categList = mainframe.categList;
        categoryTable = (DefaultTableModel) tableManageCategory.getModel();
        populateData();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManageCategory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldCategory = new javax.swing.JTextField();
        btnSubmitCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        btnEditCategory = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CATEGORY MANAGEMENT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(252, 236, 200));

        jPanel2.setBackground(new java.awt.Color(205, 94, 67));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CATEGORY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tableManageCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableManageCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableManageCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableManageCategory);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CATEGORY NAME");

        fieldCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnSubmitCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmitCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloadcheckicon.png"))); // NOI18N
        btnSubmitCategory.setText("SUBMIT");
        btnSubmitCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSubmitCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloaddeleteicon.png"))); // NOI18N
        btnDeleteCategory.setText("DELETE");
        btnDeleteCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        btnEditCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloadediticon.png"))); // NOI18N
        btnEditCategory.setText("EDIT");
        btnEditCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCategoryActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mini_downloadleaveicon.png"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSubmitCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeleteCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fieldCategory)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(221, 221, 221))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteCategory)
                            .addComponent(btnSubmitCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditCategory)
                            .addComponent(btnClose))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame(categList);
        mainFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSubmitCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCategoryActionPerformed
        // TODO add your handling code here:
        Random ran = new Random();
        int id = Math.abs((ran.nextInt() / 2) * 2);
        if (!fieldCategory.getText().isEmpty()) {
            CategoryModel cm = new CategoryModel(id, fieldCategory.getText());
            categList.add(cm);
            populateData();
            JOptionPane.showMessageDialog(this, "CATEGORY ADDED SUCCESSFULY", "Message", JOptionPane.INFORMATION_MESSAGE);
            fieldCategory.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "PLEASE ENTER NEW CATEGORY", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnSubmitCategoryActionPerformed

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "ARE YOU SURE YOU WANT TO DELETE THIS DATA?", "Message", JOptionPane.YES_NO_OPTION);

        if (choice == 0) {
            categoryTable.removeRow(tableManageCategory.getSelectedRow());
        }
//        System.out.println(tableCategory.getSelectedRow());
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void tableManageCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableManageCategoryMouseClicked
        // TODO add your handling code here:
        String categoryName = categoryTable.getValueAt(tableManageCategory.getSelectedRow(), 1).toString();

        fieldCategory.setText(categoryName);
    }//GEN-LAST:event_tableManageCategoryMouseClicked

    private void btnEditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCategoryActionPerformed
        // TODO add your handling code here:
        if (!fieldCategory.getText().isEmpty()) {
            int selected = tableManageCategory.getSelectedRow();

            tableManageCategory.setValueAt(fieldCategory.getText(), selected, 1);

            JOptionPane.showMessageDialog(this, "CATEGORY ADDED SUCCESSFULY", "Message", JOptionPane.INFORMATION_MESSAGE);
            fieldCategory.setText(null);
        }
    }//GEN-LAST:event_btnEditCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnEditCategory;
    private javax.swing.JButton btnSubmitCategory;
    private javax.swing.JTextField fieldCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableManageCategory;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
//        for (int i = 0; i < mainframe.categList.size(); i++) {
//            CategoryModel category = mainframe.categList.get(i);
//            categoryTable.addRow(new Object[]{category.id, category.category});
//        }

        tableManageCategory.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "CATEGORY"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        categoryTable = (DefaultTableModel) tableManageCategory.getModel();
        for (CategoryModel category : categList) {
            categoryTable.addRow(new Object[]{category.id, category.category});
        }
    }
}