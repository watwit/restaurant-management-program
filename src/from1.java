
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import java.awt.print.*;
public class from1 extends javax.swing.JFrame {
    String address;
    String username;
    String proname;
    String prousername;
    String propassword;
    String proaddress;
    int PRINTBILL=0;
    public from1() {
        initComponents();
        System.out.println("from1");
        StartPromotionFrom();
        
        
    }
    public void addProfile(String profilename,String profileusername,String profilepassword,String profileaddress)
    {
       proname=profilename;
       prousername=profileusername;
       propassword=profilepassword;
       proaddress=profileaddress;
    }
    
    public void addUserName(String n){
        
        username=n;
    }
     public void addAddress(String add){
        address=add;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KU DELIVERY");
        setBackground(new java.awt.Color(255, 204, 204));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(100, 50));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(900, 600));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kfc.png"))); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starbuck.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(144, 238, 144));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kfcthebox.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ไก่พร้อมลุย.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ไก่โดนใจ.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ไก่สุขสันต์.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ชิลลี่ชีส.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, "card2");

        jPanel6.setBackground(new java.awt.Color(254, 246, 104));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/เเฮมเเอนด์ชีส.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ว้าวคอมโบ.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/เชลด้าชีท.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ชุดเซ็ท1.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ชุดเซ็ท2.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel16)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel17)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel18)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, "card2");

        jPanel8.setBackground(new java.awt.Color(200, 164, 109));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion1.gif"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion2.gif"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion3.gif"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel23)
                .addGap(49, 49, 49)
                .addComponent(jLabel24)
                .addGap(48, 48, 48)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, "card2");

        jPanel9.setBackground(new java.awt.Color(171, 190, 130));
        jPanel9.setPreferredSize(new java.awt.Dimension(800, 522));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starbuckmenu1.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starbuckmenu2.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbuckmenu3.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbuckmenu4.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addGap(36, 36, 36)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9, "card2");

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel10.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 157, 202));

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 340, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 130, 50));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 51, 0));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel5.setText("TOTAL:");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirm.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/out.gif"))); // NOI18N
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void StartPromotionFrom(){

        sumiconpizzaclick =0;
        sumiconkfcclick=0;
        sumiconpromotionclick =1;
        sumiconstarbuckclick =0;
        ImageIcon iconpromotionclick = new ImageIcon (getClass().getResource("promotionclick.png"));
        jLabel1.setIcon(iconpromotionclick); 
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(jPanel8);
        jPanel2.repaint();
        jPanel2.revalidate();
        ImageIcon iconstarbuck  = new ImageIcon (getClass().getResource("starbuck.png"));
        jLabel3.setIcon(iconstarbuck);
        ImageIcon iconpizza = new ImageIcon (getClass().getResource("pizza.png"));
        jLabel2.setIcon(iconpizza);
        ImageIcon iconKFC1 = new ImageIcon (getClass().getResource("kfc.png"));
        jLabel6.setIcon(iconKFC1);
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //KFC
        sumiconpizzaclick =0;
        sumiconkfcclick=1;
        sumiconpromotionclick=0;
        sumiconstarbuckclick =0;
        ImageIcon iconkfcclick = new ImageIcon (getClass().getResource("kfcclick.png"));
        jLabel6.setIcon(iconkfcclick);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(jPanel4);
        jPanel2.repaint();
        jPanel2.revalidate();
        ImageIcon iconpromotion = new ImageIcon (getClass().getResource("promotion.png"));
        jLabel1.setIcon(iconpromotion);
        ImageIcon iconstarbuck  = new ImageIcon (getClass().getResource("starbuck.png"));
        jLabel3.setIcon(iconstarbuck);
        ImageIcon iconpizza = new ImageIcon (getClass().getResource("pizza.png"));
        jLabel2.setIcon(iconpizza);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //pizza
        
      
        sumiconpizzaclick =1;
        sumiconkfcclick=0;
        sumiconpromotionclick=0;
        sumiconstarbuckclick =0;
        ImageIcon iconpizzaclick = new ImageIcon (getClass().getResource("pizzaclick.png"));
        jLabel2.setIcon(iconpizzaclick);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(jPanel6);
        jPanel2.repaint();
        jPanel2.revalidate();
        ImageIcon iconpromotion = new ImageIcon (getClass().getResource("promotion.png"));
        jLabel1.setIcon(iconpromotion);
        ImageIcon iconstarbuck  = new ImageIcon (getClass().getResource("starbuck.png"));
        jLabel3.setIcon(iconstarbuck);
        ImageIcon iconKFC1 = new ImageIcon (getClass().getResource("kfc.png"));
        jLabel6.setIcon(iconKFC1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //promotion
     
        sumiconpizzaclick =0;
        sumiconkfcclick=0;
        sumiconpromotionclick =1;
        sumiconstarbuckclick =0;
        ImageIcon iconpromotionclick = new ImageIcon (getClass().getResource("promotionclick.png"));
        jLabel1.setIcon(iconpromotionclick); 
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(jPanel8);
        jPanel2.repaint();
        jPanel2.revalidate();
        ImageIcon iconstarbuck  = new ImageIcon (getClass().getResource("starbuck.png"));
        jLabel3.setIcon(iconstarbuck);
        ImageIcon iconpizza = new ImageIcon (getClass().getResource("pizza.png"));
        jLabel2.setIcon(iconpizza);
        ImageIcon iconKFC1 = new ImageIcon (getClass().getResource("kfc.png"));
        jLabel6.setIcon(iconKFC1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //starbuck
        sumiconpizzaclick =0;
        sumiconkfcclick=0;
        sumiconpromotionclick=0;
        sumiconstarbuckclick =1;
        ImageIcon iconstarbuckclick = new ImageIcon (getClass().getResource("startbuckclick.png"));
        jLabel3.setIcon(iconstarbuckclick);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        jPanel2.add(jPanel9);
        jPanel2.repaint();
        jPanel2.revalidate();
        ImageIcon iconpromotion = new ImageIcon (getClass().getResource("promotion.png"));
        jLabel1.setIcon(iconpromotion);
        ImageIcon iconpizza = new ImageIcon (getClass().getResource("pizza.png"));
        jLabel2.setIcon(iconpizza);
        ImageIcon iconKFC1 = new ImageIcon (getClass().getResource("kfc.png"));
        jLabel6.setIcon(iconKFC1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        if (sumiconpromotionclick==0){
        ImageIcon iconpromotion1 = new ImageIcon (getClass().getResource("promotion1.png"));
        jLabel1.setIcon(iconpromotion1);}       
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       if (sumiconpromotionclick==0){
        ImageIcon iconpromotion = new ImageIcon (getClass().getResource("promotion.png"));
       jLabel1.setIcon(iconpromotion);}
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
       if (sumiconkfcclick==0){
       ImageIcon iconKFC = new ImageIcon (getClass().getResource("k.png"));
       jLabel6.setIcon(iconKFC); }
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
       if (sumiconkfcclick==0){
        ImageIcon iconKFC1 = new ImageIcon (getClass().getResource("kfc.png"));
       jLabel6.setIcon(iconKFC1); } // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       if (sumiconpizzaclick==0){
        ImageIcon iconpizza1 = new ImageIcon (getClass().getResource("pizza1.png"));
       jLabel2.setIcon(iconpizza1);}
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       if (sumiconpizzaclick==0){
        ImageIcon iconpizza = new ImageIcon (getClass().getResource("pizza.png"));
       jLabel2.setIcon(iconpizza);}
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       if (sumiconstarbuckclick==0){
        ImageIcon iconstarbuck1 = new ImageIcon (getClass().getResource("starbuck1.png"));
       jLabel3.setIcon(iconstarbuck1);}
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        if (sumiconstarbuckclick==0){
        ImageIcon iconstarbuck  = new ImageIcon (getClass().getResource("starbuck.png"));
       jLabel3.setIcon(iconstarbuck);}// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
       ImageIcon iconconfirm1  = new ImageIcon (getClass().getResource("confirm1.png"));
       jLabel7.setIcon(iconconfirm1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        ImageIcon iconconfirm  = new ImageIcon (getClass().getResource("confirm.png"));
       jLabel7.setIcon(iconconfirm);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
       ImageIcon iconkfcmenu1 = new ImageIcon (getClass().getResource("kfcmenu1.png"));
       jLabel9.setIcon(iconkfcmenu1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
       ImageIcon iconkfcthebox = new ImageIcon (getClass().getResource("kfcthebox.png"));
       jLabel9.setIcon(iconkfcthebox);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        order+="KFC THE BOX 1 ชิ้น 169 บาท\n";
        jTextArea1.setText(order);
        total+=169;
        jTextField1.setText(String.valueOf(total));
        bill.add("KFC THE BOX 1 ชิ้น ");
        price1.add("169");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        ImageIcon iconkfcmenu2 = new ImageIcon (getClass().getResource("kfcmenu2.png"));
       jLabel11.setIcon(iconkfcmenu2);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
       ImageIcon iconkfcmenu22= new ImageIcon (getClass().getResource("ไก่โดนใจ.png"));
       jLabel11.setIcon(iconkfcmenu22);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        order+="KFC ไก่โดนใจ 1 ชิ้น 69 บาท\n";
        jTextArea1.setText(order);
        total+=69;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("KFC ไก่โดนใจ 1 ชิ้น");
        price1.add("69");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
       ImageIcon iconkfcmenu3= new ImageIcon (getClass().getResource("kfcmenu3.png"));
       jLabel12.setIcon(iconkfcmenu3); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        ImageIcon iconkfcmenu33= new ImageIcon (getClass().getResource("ไก่สุขสันต์.png"));
        jLabel12.setIcon(iconkfcmenu33);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        order+="KFC ไก่สุขสันต์ 1 ชิ้น 259 บาท\n";
        jTextArea1.setText(order);
        total+=259;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("KFC ไก่สุขสันต์ 1 ชิ้น");
        price1.add("259");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
         ImageIcon iconkfcmenu4= new ImageIcon (getClass().getResource("kfcmenu4.png"));
       jLabel10.setIcon(iconkfcmenu4);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        ImageIcon iconkfcmenu44= new ImageIcon (getClass().getResource("ไก่พร้อมลุย.png"));
       jLabel10.setIcon(iconkfcmenu44);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        order+="KFC ไก่พร้อมลุย 1 ชิ้น 259 บาท\n";
        jTextArea1.setText(order);
        total+=259;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("KFC ไก่พร้อมลุย 1 ชิ้น");
        price1.add("259");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        ImageIcon iconkfcmenu5= new ImageIcon (getClass().getResource("kfcmenu5.png"));
       jLabel13.setIcon(iconkfcmenu5);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
         ImageIcon iconkfcmenu55= new ImageIcon (getClass().getResource("ชิลลี่ชีส.png"));
       jLabel13.setIcon(iconkfcmenu55);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        order+="KFC ชิลลี่ชีส 1 ชิ้น 129 บาท\n";
        jTextArea1.setText(order);
        total+=129;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("KFC ชิลลี่ชีส 1 ชิ้น");
        price1.add("129");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        ImageIcon iconpizzamenu1= new ImageIcon (getClass().getResource("pizzamenu1.png"));
       jLabel14.setIcon(iconpizzamenu1);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        ImageIcon iconpizzamenu11= new ImageIcon (getClass().getResource("เเฮมเเอนด์ชีส.png"));
       jLabel14.setIcon(iconpizzamenu11);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        order+="PIZZA ว้าวคอมโบ 1 ชิ้น 299 บาท\n";
        jTextArea1.setText(order);
        total+=299;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PIZZA ว้าวคอมโบ 1 ชิ้น");
        price1.add("299");
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        order+="PIZZA เเฮมเเอนด์ชีส 1 ชิ้น 99 บาท\n";
        jTextArea1.setText(order);
        total+=99;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PIZZA เเฮมเเอนด์ชีส 1 ชิ้น");
        price1.add("99");
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        ImageIcon iconpizzamenu2= new ImageIcon (getClass().getResource("pizzamenu2.png"));
       jLabel16.setIcon(iconpizzamenu2);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
       ImageIcon iconpizzamenu22= new ImageIcon (getClass().getResource("ว้าวคอมโบ.png"));
       jLabel16.setIcon(iconpizzamenu22);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
         ImageIcon iconpizzamenu3= new ImageIcon (getClass().getResource("pizzamenu3.png"));
       jLabel15.setIcon(iconpizzamenu3);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        ImageIcon iconpizzamenu33= new ImageIcon (getClass().getResource("เชลด้าชีท.png"));
       jLabel15.setIcon(iconpizzamenu33);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        order+="PIZZA เชลด้าชีส 1 ชิ้น 299 บาท\n";
        jTextArea1.setText(order);
        total+=299;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PIZZA เชลด้าชีส 1 ชิ้น");
        price1.add("299");
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        ImageIcon iconpizzamenu4= new ImageIcon (getClass().getResource("pizzamenu4.png"));
       jLabel17.setIcon(iconpizzamenu4);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
       ImageIcon iconpizzamenu44= new ImageIcon (getClass().getResource("ชุดเซ็ท1.png"));
       jLabel17.setIcon(iconpizzamenu44); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        order+="PIZZA ชุดเติมเต็ม 1 ชิ้น 299 บาท\n";
        jTextArea1.setText(order);
        total+=299;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PIZZA ชุดเติมเต็ม 1 ชิ้น");
        price1.add("299");
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        ImageIcon iconpizzamenu5= new ImageIcon (getClass().getResource("pizzamenu5.png"));
       jLabel18.setIcon(iconpizzamenu5);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        ImageIcon iconpizzamenu55= new ImageIcon (getClass().getResource("ชุดเซ็ท2.png"));
       jLabel18.setIcon(iconpizzamenu55);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        order+="PIZZA ชุดเติมเต็ม 1 ชิ้น 199 บาท\n";
        jTextArea1.setText(order);
        total+=199;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PIZZA ชุดเติมเต็ม 1 ชิ้น");
        price1.add("199");
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        ImageIcon iconpromotionmenu1= new ImageIcon (getClass().getResource("promotionmenu1.png"));
       jLabel23.setIcon(iconpromotionmenu1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        ImageIcon iconpromotionmenu11= new ImageIcon (getClass().getResource("promotion1.gif"));
       jLabel23.setIcon(iconpromotionmenu11);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        ImageIcon iconpromotionmenu2= new ImageIcon (getClass().getResource("promotionmenu2.png"));
       jLabel24.setIcon(iconpromotionmenu2);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        ImageIcon iconpromotionmenu22= new ImageIcon (getClass().getResource("promotion2.gif"));
       jLabel24.setIcon(iconpromotionmenu22);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        ImageIcon iconpromotionmenu3= new ImageIcon (getClass().getResource("promotionmenu3.png"));
       jLabel25.setIcon(iconpromotionmenu3);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
       ImageIcon iconpromotionmenu33= new ImageIcon (getClass().getResource("promotion3.gif"));
       jLabel25.setIcon(iconpromotionmenu33);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       order+="PROMOTION ทริปเปิ้ลว้าวบ๊อกซ์ 1 ชิ้น 499 บาท\n";
        jTextArea1.setText(order);
        total+=499;
        jTextField1.setText(String.valueOf(total)); // TODO add your handling code here:
        bill.add("PROMOTION ทริปเปิ้ลว้าวบ๊อกซ์ 1 ชิ้น");
        price1.add("499");
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        order+="PROMOTION ไก่จัดใหญ่ 1 ชิ้น 199 บาท\n";
        jTextArea1.setText(order);
        total+=199;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PROMOTION ไก่จัดใหญ่ 1 ชิ้น");
        price1.add("199");
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        order+="PROMOTION MATCHA CHOCO 1 ชิ้น 235 บาท\n";
        jTextArea1.setText(order);
        total+=235;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("PROMOTION MATCHA CHOCO 1 ชิ้น");
        price1.add("235");
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        ImageIcon iconstartbuckmenu1= new ImageIcon (getClass().getResource("starbuckmenu11.png"));
       jLabel19.setIcon(iconstartbuckmenu1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        ImageIcon iconstartbuckmenu11= new ImageIcon (getClass().getResource("starbuckmenu1.png"));
       jLabel19.setIcon(iconstartbuckmenu11);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        ImageIcon iconstartbuckmenu2= new ImageIcon (getClass().getResource("starbuckmenu22.png"));
       jLabel20.setIcon(iconstartbuckmenu2);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        ImageIcon iconstartbuckmenu22= new ImageIcon (getClass().getResource("starbuckmenu2.png"));
       jLabel20.setIcon(iconstartbuckmenu22);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        ImageIcon iconstartbuckmenu3= new ImageIcon (getClass().getResource("starbuckmenu33.png"));
       jLabel21.setIcon(iconstartbuckmenu3);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        ImageIcon iconstartbuckmenu33= new ImageIcon (getClass().getResource("startbuckmenu3.png"));
       jLabel21.setIcon(iconstartbuckmenu33);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        ImageIcon iconstartbuckmenu4= new ImageIcon (getClass().getResource("starbuckmenu44.png"));
       jLabel22.setIcon(iconstartbuckmenu4);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
       ImageIcon iconstartbuckmenu44= new ImageIcon (getClass().getResource("startbuckmenu4.png"));
       jLabel22.setIcon(iconstartbuckmenu44); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        order+="STARBUCK BLACK SHOW 1 เเก้ว 200 บาท\n";
        jTextArea1.setText(order);
        total+=200;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("STARBUCK BLACK SHOW 1 เเก้ว");
        price1.add("200");
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        order+="STARBUCK CHOCO BERRY SIGNATURE 1 เเก้ว 185 บาท\n";
        jTextArea1.setText(order);
        total+=185;
        jTextField1.setText(String.valueOf(total));        // TODO add your handling code here:
        bill.add("STARBUCK CHOCO BERRY SIGNATURE 1 เเก้ว");
        price1.add("185");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        order+="STARBUCK DOUBLE CHOCO MOCHA 1 เเก้ว 215 บาท\n";
        jTextArea1.setText(order);
        total+=215;
        jTextField1.setText(String.valueOf(total));
        bill.add("STARBUCK DOUBLE CHOCO MOCHA 1 เเก้ว"); 
        price1.add("215");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        order+="STARBUCK DOUBLE LAYERS 1 เเก้ว 190 บาท\n";
        jTextArea1.setText(order);
        total+=190;
        jTextField1.setText(String.valueOf(total));// TODO add your handling code here:
        bill.add("STARBUCK DOUBLE LAYERS 1 เเก้ว"); 
        price1.add("190");
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        if (total==0)
        {JOptionPane.showMessageDialog(null,"คุณยังไม่ได้สั่งอาหาร");
        }
        else
        {   
            
            int n1 = JOptionPane.showConfirmDialog(null,"ยอดเงินที่ต้องชำระทั้งหมด"+total+"บาท","An Inane Question",JOptionPane.YES_NO_OPTION);
            if(n1==0)
            {
                int n = JOptionPane.showConfirmDialog(null,"ให้จัดส่งไปยัง "+address+" ใช่หรือไม่?","An Inane Question",JOptionPane.YES_NO_OPTION);
                if(n==0 && total !=0)
                 {
                    JOptionPane.showMessageDialog(null,"   อาหารจะไปส่งถึงคุณในอีก 40 นาที"+"\n  ขอบคุณ "+username+" ที่ใช้บริการของเรา","message",JOptionPane.PLAIN_MESSAGE);
                    
                    saveBillDatabase();
                    PRINTBILL=1;
                    bill.clear();
                    price1.clear();
                    order="";
                    jTextArea1.setText(order);
                    total=0;
                    jTextField1.setText(String.valueOf(total));
                 }
                if(n==1)
                {
                    String s = (String)JOptionPane.showInputDialog(null,"เพิ่มที่อยู่ในการจัดส่ง","Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,null,"new addres");
                    JOptionPane.showMessageDialog(null,"   อาหารจะไปส่งถึงคุณในอีก 40 นาที"+"\n  ขอบคุณ "+username+" ที่ใช้บริการของเรา","message",JOptionPane.PLAIN_MESSAGE);
                    saveBillDatabase();
                    PRINTBILL=1;
                    bill.clear();
                    price1.clear();
                    order="";
                    jTextArea1.setText(order);
                    total=0;
                    jTextField1.setText(String.valueOf(total));
                }
                
            }
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked
    public void saveBillDatabase()
    {
    bill.add("total");
    price1.add(jTextField1.getText());
    for(int i=0;i<bill.size();i++) {   
    String sql ="insert into bill(checkout,total) value('"+bill.get(i)+"','"+price1.get(i)+"')";
           try
           {
             Connection con=NewJFrame.getConnection();
             Statement  stm=con.createStatement();
             if(stm.executeUpdate(sql)!= -1)
             {
                 //JOptionPane.showMessageDialog(null,"ลงทะเบียนเรียบร้อยเเล้ว");
             }
           }
             catch(Exception e)
             {
               e.printStackTrace();
             }
    }
    }
    public void deleteBillDatabase(){
     String sql ="DELETE FROM bill";
           try
           {
             Connection con=NewJFrame.getConnection();
             Statement  stm=con.createStatement();
             if(stm.executeUpdate(sql)!= -1)
             {
                 //JOptionPane.showMessageDialog(null,"ลงทะเบียนเรียบร้อยเเล้ว");
             }
           }
             catch(Exception e)
             {
               e.printStackTrace();
             }
    }
    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
      ImageIcon iconcancel= new ImageIcon (getClass().getResource("cancel1.png"));
       jLabel28.setIcon(iconcancel);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
       ImageIcon iconcancel1= new ImageIcon (getClass().getResource("cancel.png"));
       jLabel28.setIcon(iconcancel1);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        order="";
        jTextArea1.setText(order);
        total=0;
        jTextField1.setText(String.valueOf(total)); 
        bill.clear();
        price1.clear();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       ImageIcon iconprinttobill= new ImageIcon (getClass().getResource("print1.png"));
       jLabel4.setIcon(iconprinttobill);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon iconprinttobill1= new ImageIcon (getClass().getResource("print.png"));
       jLabel4.setIcon(iconprinttobill1);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      if(PRINTBILL==0){
                 JOptionPane.showMessageDialog(null,"คุณยังไม่ได้สั่งอาหาร");
             } 
      else{
      ExporttoBill ex=new ExporttoBill();
      ex.show();
      ex.setProfile(proname, prousername, propassword, proaddress);
      ex.getData();
      
      this.dispose();}// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from1().setVisible(true);
            }
        });
    }
    ArrayList<String> bill=new ArrayList<String>();
    ArrayList<String> price1=new ArrayList<String>();
    private  int total =0;
    private String order="";
    private  int sumiconpromotionclick =0;
    private  int sumiconkfcclick =0;
    private  int sumiconpizzaclick =0;
    private  int sumiconstarbuckclick =0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
