
package Main;

import config.config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Login() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginbtnpane = new javax.swing.JPanel();
        loginbtn = new javax.swing.JLabel();
        signuppanel = new javax.swing.JPanel();
        signupbtn = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        exitpane = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DENTAL CLINIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 830, 40));

        jPanel2.setBackground(new java.awt.Color(81, 164, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 135, 184, 30));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 194, 184, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOG IN ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        loginbtnpane.setBackground(new java.awt.Color(255, 255, 255));

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtn.setText("Login");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginbtnpaneLayout = new javax.swing.GroupLayout(loginbtnpane);
        loginbtnpane.setLayout(loginbtnpaneLayout);
        loginbtnpaneLayout.setHorizontalGroup(
            loginbtnpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        loginbtnpaneLayout.setVerticalGroup(
            loginbtnpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel2.add(loginbtnpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 20));

        signuppanel.setBackground(new java.awt.Color(255, 255, 255));

        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        signupbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupbtn.setText("Sign up");
        signupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout signuppanelLayout = new javax.swing.GroupLayout(signuppanel);
        signuppanel.setLayout(signuppanelLayout);
        signuppanelLayout.setHorizontalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        signuppanelLayout.setVerticalGroup(
            signuppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel2.add(signuppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 360, 320));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitpane.setBackground(new java.awt.Color(255, 255, 255));
        exitpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exitpane.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Header.add(exitpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 30, 35));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setText("The dental care system is designed to maintain ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 360, 20));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setText("and improve oral health by preventing, ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 340, 20));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setText("diagnosing, and treating dental problems.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 340, 20));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setText("Caring for smiles, protecting oral health.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 340, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ai-generated-dental-clinic-advertisment-background-with-copy-space-free-photo (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 448));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked

        String email = username.getText();
        String rawPass = new String(password.getPassword());

        try {
            Connection conn = config.connectDB();

            String hashedPass = config.hashPassword(rawPass);

            String sql = "SELECT * FROM tbl_user WHERE u_email=? AND u_password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, hashedPass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String verified = rs.getString("u_verified");
                if (!"1".equals(verified)) {
                    JOptionPane.showMessageDialog(this, "Your account is not verified. Please check your email.");
                    return;
                }


                String role = rs.getString("u_role");
                String name = rs.getString("u_name");


                switch (role.toLowerCase()) {
                    case "customer":
                        dashboard customerDash = new dashboard(name);
                        this.dispose();
                        customerDash.setVisible(true);
                        break;
                    case "staff":
//                        StaffDashboard staffDash = new StaffDashboard(name);
//                        this.dispose();
//                        staffDash.setVisible(true);
                        break;
                    case "admin":
                        Admin adminDash = new Admin(name); 
                        this.dispose();
                        adminDash.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Unknown role: " + role);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Email or Password");
            }

        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
        }
         
    }//GEN-LAST:event_loginbtnMouseClicked

    private void loginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseEntered
        loginbtnpane.setBackground(new Color(147, 199, 237));
        loginbtn.setForeground(Color.white);
    }//GEN-LAST:event_loginbtnMouseEntered

    private void loginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseExited
        loginbtnpane.setBackground(Color.white);
        loginbtn.setForeground(Color.black);
    }//GEN-LAST:event_loginbtnMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exitpane.setBackground(Color. red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exitpane.setBackground(Color. white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void signupbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbtnMouseClicked
        Signup signup = new Signup();
        this.dispose();
        signup.setVisible(true);
    }//GEN-LAST:event_signupbtnMouseClicked

    private void signupbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbtnMouseEntered
        signuppanel.setBackground(new Color(147, 199, 237));
        signupbtn.setForeground(Color.white);
    }//GEN-LAST:event_signupbtnMouseEntered

    private void signupbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbtnMouseExited
        signuppanel.setBackground(Color.white);
        signupbtn.setForeground(Color.black);
    }//GEN-LAST:event_signupbtnMouseExited

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitpane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JPanel loginbtnpane;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel signupbtn;
    private javax.swing.JPanel signuppanel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
