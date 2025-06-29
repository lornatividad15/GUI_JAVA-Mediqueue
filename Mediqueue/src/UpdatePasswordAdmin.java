
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author acer
 */
public class UpdatePasswordAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePasswordAdmin
     */
    public UpdatePasswordAdmin() {
        initComponents();
        
        String path = "/Images/1766.png"; 
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image scaledImage = icon.getImage().getScaledInstance(exitICON.getWidth(), exitICON.getHeight(), Image.SCALE_SMOOTH);
        exitICON.setIcon(new ImageIcon(scaledImage));
        
        // Placeholder: CURRENT PASSWORD
        currentpassword_adminmenuTF.setText("Current password");
        currentpassword_adminmenuTF.setEchoChar((char) 0);
        currentpassword_adminmenuTF.setForeground(Color.GRAY);
        currentpassword_adminmenuTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (new String(currentpassword_adminmenuTF.getPassword()).equals("Current password")) {
                    currentpassword_adminmenuTF.setText("");
                    currentpassword_adminmenuTF.setForeground(Color.BLACK);
                    currentpassword_adminmenuTF.setEchoChar('•');
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (new String(currentpassword_adminmenuTF.getPassword()).isEmpty()) {
                    currentpassword_adminmenuTF.setText("Current password");
                    currentpassword_adminmenuTF.setEchoChar((char) 0);
                    currentpassword_adminmenuTF.setForeground(Color.GRAY);
                }
            }
        });

        // Placeholder: NEW PASSWORD
        newpassword_adminmenuTF.setText("New password");
        newpassword_adminmenuTF.setEchoChar((char) 0);
        newpassword_adminmenuTF.setForeground(Color.GRAY);
        newpassword_adminmenuTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (new String(newpassword_adminmenuTF.getPassword()).equals("New password")) {
                    newpassword_adminmenuTF.setText("");
                    newpassword_adminmenuTF.setForeground(Color.BLACK);
                    newpassword_adminmenuTF.setEchoChar('•');
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (new String(newpassword_adminmenuTF.getPassword()).isEmpty()) {
                    newpassword_adminmenuTF.setText("New password");
                    newpassword_adminmenuTF.setEchoChar((char) 0);
                    newpassword_adminmenuTF.setForeground(Color.GRAY);
                }
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        currentpassword_adminmenuTF = new javax.swing.JPasswordField();
        showPasswordCB = new javax.swing.JCheckBox();
        update_passwordBTN = new javax.swing.JButton();
        exitICON = new javax.swing.JLabel();
        newpassword_adminmenuTF = new javax.swing.JPasswordField();
        showPasswordCB1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 161, 241));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE PASSWORD");

        jPanel2.setBackground(new java.awt.Color(244, 243, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        currentpassword_adminmenuTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        currentpassword_adminmenuTF.setText("Current Password");

        showPasswordCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCBActionPerformed(evt);
            }
        });

        update_passwordBTN.setBackground(new java.awt.Color(243, 241, 241));
        update_passwordBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update_passwordBTN.setText("UPDATE");
        update_passwordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_passwordBTNActionPerformed(evt);
            }
        });

        exitICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitICONMouseClicked(evt);
            }
        });

        newpassword_adminmenuTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        newpassword_adminmenuTF.setText("New Password");

        showPasswordCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(exitICON, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(newpassword_adminmenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPasswordCB1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(currentpassword_adminmenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPasswordCB)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(update_passwordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitICON, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(showPasswordCB))
                    .addComponent(currentpassword_adminmenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(showPasswordCB1))
                    .addComponent(newpassword_adminmenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(update_passwordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCBActionPerformed
        String currentText = new String(currentpassword_adminmenuTF.getPassword());

        if (currentText.equals("Enter password")) {
            return; // Don't show actual password if it's the placeholder
        }

        if (showPasswordCB.isSelected()) {
            currentpassword_adminmenuTF.setEchoChar((char) 0); // Show text
        } else {
            currentpassword_adminmenuTF.setEchoChar('•'); // Hide text
        }
    }//GEN-LAST:event_showPasswordCBActionPerformed

    private void update_passwordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_passwordBTNActionPerformed
        String currentPassword = currentpassword_adminmenuTF.getText().trim();
        String newPassword = newpassword_adminmenuTF.getText().trim();

        if (currentPassword.isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both current and new password.");
            return;
        }

        if (currentPassword.equals(newPassword)) {
            JOptionPane.showMessageDialog(this, "New password must be different from the current one.");
            return;
        }

        // Hash passwords
        String hashedCurrentPassword = HashUtil.hashPassword(currentPassword);
        String hashedNewPassword = HashUtil.hashPassword(newPassword);

        try (Connection conn = DBConnection.getConnection()) {
            // Step 1: Validate current password
            String checkQuery = "SELECT * FROM admin WHERE password = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, hashedCurrentPassword);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Current password is incorrect.");
                return;
            }

            // Optional confirmation
            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to change your password?",
                "Confirm Password Change",
                JOptionPane.YES_NO_OPTION
            );
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            // Step 2: Update password
            String updateQuery = "UPDATE admin SET password = ? WHERE password = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, hashedNewPassword);
            updateStmt.setString(2, hashedCurrentPassword);

            int result = updateStmt.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Password updated successfully.");

                // Reset field placeholders
                currentpassword_adminmenuTF.setText("Current password");
                newpassword_adminmenuTF.setText("New password");
                currentpassword_adminmenuTF.setForeground(Color.GRAY);
                newpassword_adminmenuTF.setForeground(Color.GRAY);
                currentpassword_adminmenuTF.setEchoChar((char) 0);
                newpassword_adminmenuTF.setEchoChar((char) 0);
            } else {
                JOptionPane.showMessageDialog(this, "Password update failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error occurred.");
        }
    }//GEN-LAST:event_update_passwordBTNActionPerformed

    private void exitICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitICONMouseClicked
        MenuDashboard menu = new MenuDashboard(); // Create new MainMenu frame
        menu.setVisible(true); // Show MainMenu window
        this.dispose(); // Close login windo
    }//GEN-LAST:event_exitICONMouseClicked

    private void showPasswordCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCB1ActionPerformed
        String currentText = new String(newpassword_adminmenuTF.getPassword());

        if (currentText.equals("Enter password")) {
            return; // Don't show actual password if it's the placeholder
        }

        if (showPasswordCB1.isSelected()) {
            newpassword_adminmenuTF.setEchoChar((char) 0); // Show text
        } else {
            newpassword_adminmenuTF.setEchoChar('•'); // Hide text
        }
    }//GEN-LAST:event_showPasswordCB1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jPanel1.requestFocusInWindow();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(UpdatePasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePasswordAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePasswordAdmin().setVisible(true);
            }
        });
    }
    
    public class DBConnection {
        public static Connection getConnection() {
            try {
                String url = "jdbc:mysql://localhost:3306/mediqueue";
                String user = "root";
                String password = ""; 
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField currentpassword_adminmenuTF;
    private javax.swing.JLabel exitICON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newpassword_adminmenuTF;
    private javax.swing.JCheckBox showPasswordCB;
    private javax.swing.JCheckBox showPasswordCB1;
    private javax.swing.JButton update_passwordBTN;
    // End of variables declaration//GEN-END:variables
}
