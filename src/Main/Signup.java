
package Main;

import config.config;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;


public class Signup extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Signup() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        exitpanel = new javax.swing.JPanel();
        exitbtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Lastname = new javax.swing.JTextField();
        Contact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gender = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Confirmpass = new javax.swing.JPasswordField();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitpanel.setBackground(new java.awt.Color(255, 255, 255));

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitbtn.setText("x");
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitpanelLayout = new javax.swing.GroupLayout(exitpanel);
        exitpanel.setLayout(exitpanelLayout);
        exitpanelLayout.setHorizontalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitpanelLayout.setVerticalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 780, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(81, 164, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign up");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel3.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, 30));
        jPanel3.add(Lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, 30));
        jPanel3.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 130, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel3.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, 30));
        jPanel3.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, 30));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        Gender.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Male", "Female" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Gender);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Submit");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 70, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Login");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 20));

        Confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmpassActionPerformed(evt);
            }
        });
        jPanel3.add(Confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, 30));
        jPanel3.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 560, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ai-generated-dental-clinic-advertisment-background-with-copy-space-free-photo (1).jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ConfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmpassActionPerformed

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void exitbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseEntered
        exitpanel.setBackground(Color. red);
        exitbtn.setForeground(Color.white);
    }//GEN-LAST:event_exitbtnMouseEntered

    private void exitbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseExited
        exitpanel.setBackground(Color. white);
        exitbtn.setForeground(Color.black);
    }//GEN-LAST:event_exitbtnMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
  String fname = Name.getText();
String lname = Lastname.getText();
String address = Address.getText();
String email = Email.getText();
String contact = Contact.getText();
String rawPass = new String(Password.getPassword());
String confirmRaw = new String(Confirmpass.getPassword());

// 🔥 CORRECT gender handling from JList
final String gender = (Gender.getSelectedValue() != null) ? (String) Gender.getSelectedValue() : "Male";



// VALIDATION (no need to check gender anymore — it will never be null)
if (fname.isEmpty() || lname.isEmpty() || address.isEmpty() || email.isEmpty()
        || contact.isEmpty() || rawPass.isEmpty() || confirmRaw.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields");
    return;
}

if (!rawPass.equals(confirmRaw)) {
    JOptionPane.showMessageDialog(this, "Passwords do not match");
    return;
}

try {
    config db = new config();

    String checkSql = "SELECT COUNT(*) FROM tbl_user WHERE u_email=?";
    double count = db.getSingleValue(checkSql, email);

    if (count > 0) {
        JOptionPane.showMessageDialog(this, "Email is already in use.");
        return;
    }

    final JDialog loading = new JDialog(this, "Sending OTP...", true);
    JLabel lbl = new JLabel("Please wait, sending OTP to your email...");
    lbl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    loading.add(lbl);
    loading.pack();
    loading.setLocationRelativeTo(this);

    SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
        String otp = config.generateOtp();

        @Override
        protected Boolean doInBackground() {
            return config.sendOtpEmail(email, otp);
        }

        @Override
        protected void done() {
            loading.dispose();
            try {
                boolean sent = get();
                if (!sent) {
                    JOptionPane.showMessageDialog(null, "Failed to send OTP.");
                    return;
                }

                String inputOtp = JOptionPane.showInputDialog(null, "Enter the OTP sent to your email:");

                if (inputOtp != null && inputOtp.equals(otp)) {

                    String hashedPass = config.hashPassword(rawPass);

                    // 🔥 CORRECT SQL & ORDER
                    String sql = "INSERT INTO tbl_user("
                            + "u_name, u_lname, u_address, u_email, "
                            + "u_contact, u_password, u_gender, u_verified, u_role"
                            + ") VALUES(?,?,?,?,?,?,?,1,'customer')";

                    // 🔥 PERFECT PARAMETER ORDER
                    db.addRecord(sql,
                            fname,       // u_name
                            lname,       // u_lname
                            address,     // u_address
                            email,       // u_email
                            contact,     // u_contact
                            hashedPass,  // u_password
                            gender       // u_gender
                    );

                    JOptionPane.showMessageDialog(null, "Sign Up Successful! Account verified.");
                    dispose();
                    new Login().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect OTP.");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    };

    worker.execute();
    loading.setVisible(true);

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JPasswordField Confirmpass;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Email;
    private javax.swing.JList<String> Gender;
    private javax.swing.JTextField Lastname;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JPanel exitpanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
