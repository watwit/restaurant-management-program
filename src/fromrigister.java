
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class fromrigister extends javax.swing.JFrame {

    public fromrigister() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jTextFieldpassword = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KU DELIVERY");
        setLocation(new java.awt.Point(100, 50));

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel1.setText("NAME:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 58, -1, -1));

        jTextFieldname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jTextFieldname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 61, 311, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel2.setText("USERNAME:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, -1, 41));

        jLabel3.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel3.setText("PASSWORD:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 206, -1, 58));

        jLabel4.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel4.setText("ADDRESS:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 292, -1, 49));

        jTextFieldusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.add(jTextFieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 139, 293, 41));

        jTextFieldpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jTextFieldpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 216, 295, 44));

        jTextFieldaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jTextFieldaddress.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        jTextFieldaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaddressActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 292, 307, 134));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newregister.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newback.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 168, 80));

        jLabelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2.png"))); // NOI18N
        jPanel2.add(jLabelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnameActionPerformed

    private void jTextFieldpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpasswordActionPerformed

    private void jTextFieldaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaddressActionPerformed
    public void saveDatabase()
    {   NewJFrame newframe=new NewJFrame();
        String checkuser=newframe.checkData(jTextFieldusername.getText());
        System.out.println("nnn"+checkuser);
        
        
        if(checkuser.equals("ok"))
        {
           JOptionPane.showMessageDialog(null,"username นี้ได้มีการลงทะเบัยนไปเเล้ว"); 
           jTextFieldname.setText("");
           jTextFieldusername.setText("");
           jTextFieldpassword.setText("");
           jTextFieldaddress.setText("");
        }
        else if(checkuser.equals("no ok"))
        {
          if(!(jTextFieldname.getText().equals(""))&&!(jTextFieldusername.getText().equals(""))&&!(jTextFieldpassword.getText().equals(""))&&!(jTextFieldaddress.getText().equals("")))
          {
           String sql ="insert into kuemployee(name, user, pass, address) value('"+jTextFieldname.getText()+"','"+jTextFieldusername.getText()+"','"+jTextFieldpassword.getText()+"','"+jTextFieldaddress.getText()+"')";
           try
           {
             Connection con=NewJFrame.getConnection();
             Statement  stm=con.createStatement();
             if(stm.executeUpdate(sql)!= -1)
             {
               JOptionPane.showMessageDialog(null,"ลงทะเบียนเรียบร้อยเเล้ว");
               jTextFieldname.setText("");
               jTextFieldusername.setText("");
               jTextFieldpassword.setText("");
               jTextFieldaddress.setText("");
             }
           }
             catch(Exception e)
             {
               e.printStackTrace();
             }
           }
          else{JOptionPane.showMessageDialog(null,"โปรดกรอกข้อมูลให้ครบถ้วน");
          }
        }
        
    
    }
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       NewJFrame frame=new NewJFrame();
       frame.show();
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          saveDatabase();       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon iconregieter = new ImageIcon (getClass().getResource("newregister1.png"));
        jLabel5.setIcon(iconregieter);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon iconregieter1 = new ImageIcon (getClass().getResource("newregister.png"));
        jLabel5.setIcon(iconregieter1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        ImageIcon iconback = new ImageIcon (getClass().getResource("newback1.png"));
        jLabel6.setIcon(iconback);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        ImageIcon iconback1 = new ImageIcon (getClass().getResource("newback.png"));
        jLabel6.setIcon(iconback1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(fromrigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromrigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromrigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromrigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromrigister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelbackground;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldpassword;
    private javax.swing.JTextField jTextFieldusername;
    // End of variables declaration//GEN-END:variables

   

    
}
