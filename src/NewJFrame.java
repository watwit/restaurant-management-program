
import javax.swing.ImageIcon;

import java.sql.*;
import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame {
    
    String checkdata;
    ResultSet rs;
    public NewJFrame() {
       
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KU DElivery");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 212, 92));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(100, 50));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 328));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 22, -1, 80));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.darkGray, java.awt.Color.pink, java.awt.Color.white));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 175, 213, 36));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.lightGray, java.awt.Color.orange, java.awt.Color.gray));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 255, 213, 36));

        jLabel3.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 264, -1, 27));

        jLabel4.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel4.setText("USERNAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 170, 166, 36));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 356, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register.png"))); // NOI18N
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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 356, 169, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 454, 345, 43));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Connection getConnection(){
       String db_Name="ku_delivery";
        String user="root";
        String pass="123456";
        String hostName="localhost";
        String driver="com.mysql.jdbc.Driver";
        try
        {
            Class.forName(driver);
            String url="jdbc:mysql://"+hostName+"/"+db_Name;
            Connection con=DriverManager.getConnection(url, user, pass);
            System.out.println("OKOK");
            return con;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;        }
    }    
    public void getData(String textuser,String textpassword){
        String sql="select * from kuemployee where user=? and pass=?";
        try{
            Connection con = getConnection();
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, textuser);
            pst.setString(2, textpassword);
            rs=pst.executeQuery();
            if(rs.next())
            {   
                nameuser=rs.getString(2);
                username=rs.getString(3);
                password=rs.getString(4);
                address=rs.getString(5);
                showFrom1();
            }
            else{
                
                jLabel7.setText("!!ใส่ usernsme เเละ password ให้ถูกต้อง");
                jTextField1.setText("");
                jPasswordField1.setText("");
            }  
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
    public void showFrom1()
    {from1 f1 = new from1();
     f1.show();
     f1.deleteBillDatabase();
     f1.addUserName(nameuser);
     f1.addAddress(address);
     f1.addProfile(nameuser,username,password,address);
     this.dispose();
    }
     public String  checkData(String username){
        String sql="select * from kuemployee";
        String user="no ok";
       
        try{
            Connection con = getConnection();
            PreparedStatement pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {   
              
                if(username.equals(rs.getString(3)))
                {
                  user="ok";
                 
                  break;
                }
                
            } 
            return user;
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
     
    }
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.out.println("login");
        String a=jTextField1.getText();
        String b=jPasswordField1.getText();
        getData(a,b);   
    }//GEN-LAST:event_jLabel5MouseClicked
    
    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon iconlongin1 = new ImageIcon (getClass().getResource("login1.png"));
        jLabel5.setIcon(iconlongin1);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon iconlongin2 = new ImageIcon (getClass().getResource("login.png"));
        jLabel5.setIcon(iconlongin2);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        ImageIcon iconrigister1 = new ImageIcon (getClass().getResource("register1.png"));
        jLabel6.setIcon(iconrigister1);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        ImageIcon iconrigister2 = new ImageIcon (getClass().getResource("register.png"));
        jLabel6.setIcon(iconrigister2);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        fromrigister f2 = new fromrigister();
        f2.show(); 
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    public static void main(String args[]) {
        new NewJFrame().getConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    String nameuser;
    String username;
    String password;
    String address;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   

    

   
}
