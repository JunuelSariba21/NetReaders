/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package netreadersproject;


import Form.Manga;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.fileModel;
import model.mangaModel;
import org.icepdf.ri.common.FileExtensionUtils;

/**
 *
 * @author ACER
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    private int iWidth2;
    private int iHeight2;
    Image image = new javax.swing.ImageIcon(getClass().getResource("/image/BGanime.jpeg")).getImage();
   
 File destination;
    public AdminForm() {
        this.iWidth2 = image.getWidth(this) / 2;
        this.iHeight2 = image.getHeight(this) / 2;
        initComponents();
        setLocationRelativeTo(null);
        
    }
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        if (image != null) {
        }
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
        jPanel9 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // paint the background image and scale it to fill the entire space

                int x = this.getParent().getWidth();
                int y = this.getParent().getHeight();
                g.drawImage(image, 0, 0, x, y, this);
            }
        };
        jButton15 = new javax.swing.JButton();
        FileNameAttached7 = new javax.swing.JTextField();
        titleField7 = new javax.swing.JTextField();
        genreField7 = new javax.swing.JComboBox<>();
        chaptersField7 = new javax.swing.JTextField();
        statusField7 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Net Readers");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton15.setText("Attach");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15jButton2ActionPerformed(evt);
            }
        });

        FileNameAttached7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileNameAttached7FileNameAttachedActionPerformed(evt);
            }
        });

        titleField7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        titleField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleField7.setText("Title");
        titleField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                titleField7titleFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                titleField7titleFieldFocusLost(evt);
            }
        });

        genreField7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genre", "Action", "Adventure", "Fantasy", "Romance", "Comedy" }));
        genreField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreField7genreFieldActionPerformed(evt);
            }
        });

        chaptersField7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        chaptersField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chaptersField7.setText("Chapter");
        chaptersField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chaptersField7chaptersFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                chaptersField7chaptersFieldFocusLost(evt);
            }
        });

        statusField7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Ongoing", "Completed", "On Hiatus" }));

        jButton16.setText("Submit");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16jButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(FileNameAttached7, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chaptersField7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusField7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FileNameAttached7, chaptersField7, titleField7});

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {genreField7, jButton15, statusField7});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FileNameAttached7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaptersField7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusField7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {FileNameAttached7, chaptersField7, titleField7});

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {genreField7, jButton15, statusField7});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF",FileExtensionUtils.pdf);
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(null);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        File file = fileChooser.getSelectedFile();
       
        
        File fileName = file.getAbsoluteFile();
        
        fileModel.setpath(fileName.getAbsolutePath());
        
        FileNameAttached7.setText(fileName.getName());
        
        System.out.println(fileModel.filepath);
        
        
        File source = new File(fileModel.filepath);
        destination = new File("C:\\Users\\ACER\\Documents\\NetBeansProjects\\NetReadersProject\\src\\uploaded_files\\"+fileName.getName());
        
        try {
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton15jButton2ActionPerformed

    private void FileNameAttached7FileNameAttachedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileNameAttached7FileNameAttachedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileNameAttached7FileNameAttachedActionPerformed

    private void titleField7titleFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleField7titleFieldFocusGained
        // TODO add your handling code here:
        if(titleField7.getText().equalsIgnoreCase("Title")){
            titleField7.setText(null);
        }
    }//GEN-LAST:event_titleField7titleFieldFocusGained

    private void titleField7titleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleField7titleFieldFocusLost
        // TODO add your handling code here:
        if(titleField7.getText().isEmpty()){
            titleField7.setText("Title");
        }
    }//GEN-LAST:event_titleField7titleFieldFocusLost

    private void genreField7genreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreField7genreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreField7genreFieldActionPerformed

    private void chaptersField7chaptersFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chaptersField7chaptersFieldFocusGained
        // TODO add your handling code here:
        if(chaptersField7.getText().equalsIgnoreCase("Chapter")){
            chaptersField7.setText(null);
        }
    }//GEN-LAST:event_chaptersField7chaptersFieldFocusGained

    private void chaptersField7chaptersFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chaptersField7chaptersFieldFocusLost
        // TODO add your handling code here:
        if(chaptersField7.getText().isEmpty()){
            chaptersField7.setText("Chapter");
        }
    }//GEN-LAST:event_chaptersField7chaptersFieldFocusLost

    private void jButton16jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16jButton1ActionPerformed
        // TODO add your handling code here:
        //        Object tmp[] = {FileNameAttached.getText(), titleField.getText(), chaptersField.getText(), genreField.getSelectedItem(), statusField.getSelectedItem()};
        Manga manga = new Manga(titleField7.getText(), chaptersField7.getText(), genreField7.getSelectedItem(),statusField7.getSelectedItem(),destination.getAbsolutePath());
        mangaModel.addManga(manga);

        JOptionPane.showMessageDialog(null,"Added Succesfully");

    }//GEN-LAST:event_jButton16jButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Choices(null,true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dispose();
        new Choices(null,true).setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    
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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FileNameAttached7;
    private javax.swing.JTextField chaptersField7;
    private javax.swing.JComboBox<String> genreField7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> statusField7;
    private javax.swing.JTextField titleField7;
    // End of variables declaration//GEN-END:variables
}
