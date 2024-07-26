/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BloodBankManagment;


import PackageClasses.Donor;
import PackageClasses.DonorDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update() {
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

        jLabel13 = new javax.swing.JLabel();
        try {
            jLabel1 =(javax.swing.JLabel)java.beans.Beans.instantiate(getClass().getClassLoader(), "BloodBankManagment.Update_jLabel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        DonorId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        FullName = new javax.swing.JTextField();
        FatherName = new javax.swing.JTextField();
        MotherName = new javax.swing.JTextField();
        MobileNumber = new javax.swing.JTextField();
        DateOfBirth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BloodGroup = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompleteAddress = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/all page background image.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank Managment System");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 6, 600, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 650, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Donor ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 65, 70, 24));

        DonorId.setBackground(new java.awt.Color(254, 254, 254));
        DonorId.setForeground(new java.awt.Color(0, 0, 0));
        DonorId.setCaretColor(new java.awt.Color(0, 0, 0));
        DonorId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(DonorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 64, 211, -1));

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/search1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 61, 107, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 70, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 748, 10));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 89, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Mother Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 279, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Date Of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 329, 93, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 374, 67, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 371, 222, -1));

        FullName.setBackground(java.awt.Color.white);
        FullName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        FullName.setForeground(new java.awt.Color(0, 0, 0));
        FullName.setCaretColor(new java.awt.Color(0, 0, 0));
        FullName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 133, 222, -1));

        FatherName.setBackground(java.awt.Color.white);
        FatherName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        FatherName.setForeground(new java.awt.Color(0, 0, 0));
        FatherName.setCaretColor(new java.awt.Color(0, 0, 0));
        FatherName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNameActionPerformed(evt);
            }
        });
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 175, 222, -1));

        MotherName.setBackground(java.awt.Color.white);
        MotherName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        MotherName.setForeground(new java.awt.Color(0, 0, 0));
        MotherName.setCaretColor(new java.awt.Color(0, 0, 0));
        MotherName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(MotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 225, 222, -1));

        MobileNumber.setBackground(java.awt.Color.white);
        MobileNumber.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(0, 0, 0));
        MobileNumber.setCaretColor(new java.awt.Color(0, 0, 0));
        MobileNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 275, 222, -1));

        DateOfBirth.setBackground(java.awt.Color.white);
        DateOfBirth.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        DateOfBirth.setForeground(new java.awt.Color(0, 0, 0));
        DateOfBirth.setCaretColor(new java.awt.Color(0, 0, 0));
        DateOfBirth.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 325, 222, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 41, -1));

        Email.setBackground(java.awt.Color.white);
        Email.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setCaretColor(new java.awt.Color(0, 0, 0));
        Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 210, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Blood Group");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        BloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 210, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("City");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 229, 48, -1));

        City.setBackground(java.awt.Color.white);
        City.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        City.setForeground(new java.awt.Color(0, 0, 0));
        City.setCaretColor(new java.awt.Color(0, 0, 0));
        City.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 210, -1));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Comlete Address");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        CompleteAddress.setBackground(java.awt.Color.white);
        CompleteAddress.setColumns(20);
        CompleteAddress.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        CompleteAddress.setForeground(new java.awt.Color(0, 0, 0));
        CompleteAddress.setRows(5);
        CompleteAddress.setCaretColor(new java.awt.Color(0, 0, 0));
        CompleteAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(CompleteAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 298, 180, 100));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, 650, 10));

        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 448, -1, 39));

        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/Update details.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 448, 102, 39));

        jButton4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/Exit application.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 448, 91, 39));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodBankManagment/all page background image.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Donor obj = DonorDirectory.searchById(DonorId.getText());
                FullName.setText(obj.getFullName());
                FatherName.setText(obj.getFatherName());
                MotherName.setText(obj.getMotherName());
                MobileNumber.setText(obj.getMobileNumber());
                DateOfBirth.setText(obj.getDateOfBirth());
                Gender.setSelectedItem(obj.getGender());
                Email.setText(obj.getEmail());
                BloodGroup.setSelectedItem(obj.getBloodGroup());
                City.setText(obj.getCity());
                CompleteAddress.setText(obj.getCompleteAddress());
                
                
                
                
                
                
                   
         
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void FatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherNameActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Update().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Donor d=new Donor();
       d.setDonorId(DonorId.getText());
       d.setFullName(FullName.getText());
       d.setFatherName(FatherName.getText());
       d.setMotherName(MotherName.getText());
       d.setMobileNumber(MobileNumber.getText());
       d.setDateOfBirth(DateOfBirth.getText());
       d.setGender((String) Gender.getSelectedItem());
       d.setEmail(Email.getText());
       d.setBloodGroup((String) BloodGroup.getSelectedItem());
       d.setCity(City.getText());
       d.setCompleteAddress(CompleteAddress.getText());
       DonorDirectory.updateDonor(d,DonorId.getText());
    

    
     
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodGroup;
    private javax.swing.JTextField City;
    private javax.swing.JTextArea CompleteAddress;
    private javax.swing.JTextField DateOfBirth;
    private javax.swing.JTextField DonorId;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FatherName;
    private javax.swing.JTextField FullName;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField MobileNumber;
    private javax.swing.JTextField MotherName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
