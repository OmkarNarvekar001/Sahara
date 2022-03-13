
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishabh
 */
public class DonorForm extends javax.swing.JFrame {
    public String name1,phno1,address1,email1,dropdown1,type1,pass1,cpass1;
    /**
     * Creates new form DonorForm
     */
    public DonorForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
        ImageIcon image = new ImageIcon("bg4.jpg");
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    label.setIcon(newImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        phno = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        type = new javax.swing.JCheckBox();
        back = new javax.swing.JButton();
        plab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        adlab = new javax.swing.JLabel();
        cplab = new javax.swing.JLabel();
        nlab = new javax.swing.JLabel();
        pslab = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 37, 130));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("registeration");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Donor");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mobile no.");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 217, 40));

        jPanel5.setBackground(new java.awt.Color(36, 37, 130));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, -1));

        phno.setBackground(new java.awt.Color(255, 255, 255));
        phno.setBorder(null);
        phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phnoKeyReleased(evt);
            }
        });
        jPanel3.add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 217, 40));

        jPanel6.setBackground(new java.awt.Color(36, 37, 130));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, -1));

        jPanel8.setBackground(new java.awt.Color(36, 37, 130));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 217, 40));

        jPanel9.setBackground(new java.awt.Color(36, 37, 130));
        jPanel9.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        submit.setBackground(new java.awt.Color(36, 37, 130));
        submit.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Register");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 140, 60));

        jPanel10.setBackground(new java.awt.Color(36, 37, 130));
        jPanel10.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Confirm");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Password");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setBorder(null);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 217, 40));

        jPanel11.setBackground(new java.awt.Color(36, 37, 130));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        cpass.setBackground(new java.awt.Color(255, 255, 255));
        cpass.setBorder(null);
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });
        jPanel3.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 220, 40));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setBorder(null);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 40));

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setText("Check the box if you belong to an organization");
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        back.setBackground(new java.awt.Color(36, 37, 130));
        back.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 70, 60));

        plab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        plab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(plab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, 30));

        elab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        elab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(elab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 130, 30));

        adlab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        adlab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(adlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 120, 30));

        cplab.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cplab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(cplab, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 160, 30));

        nlab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nlab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(nlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 130, 30));

        pslab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        pslab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(pslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 130, 30));

        panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 590, 680));

        label.setBackground(new java.awt.Color(204, 204, 204));
        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 670, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

         name1=name.getText();
            phno1=phno.getText();
            address1=address.getText();
            email1=email.getText();
           
            pass1=pass.getText();
            cpass1=cpass.getText();
            
            
            if(type.isSelected()) type1="organization";
            else type1="individual";
            
           // System.out.println(name1+"\n"+phno1+"\n"+address1+"\n"+email1+"\n"+dropdown1+"\n"+type1+"\n");
            
            
            
            
            try {
                if(name1.isEmpty()||phno1.isEmpty()||address1.isEmpty()||email1.isEmpty()||pass1.isEmpty()||cpass1.isEmpty()) 
                    JOptionPane.showMessageDialog(null, "Please make sure all fields are filled in");
                else if(phno1.length()!=10) 
                    JOptionPane.showMessageDialog(null, "Invalid mobile number");
                else if(email1.indexOf("@")==-1)
                    JOptionPane.showMessageDialog(null, "Invalid email id");
                else if(pass1.length()<6 || cpass1.length()<6)
                    JOptionPane.showMessageDialog(null, "Password shoulld be minimum of 6 characters");
                else if(!pass1.equals(cpass1))
                    JOptionPane.showMessageDialog(null, "Passwords don't match");
                else
                {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahara", "root", "12345678");
            String query="INSERT INTO donor(name,phno,email_id,address,type,pass)"+" values ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString (1, name1);
            pst.setString (2, phno1);
            pst.setString (3, email1);
            pst.setString (4, address1);
            pst.setString (5, type1);
            pst.setString (6, pass1);
        
            int x=pst.executeUpdate();
            Statement sta = connection.createStatement();
                    
                    if (x == 0) {
                         JOptionPane.showMessageDialog(null,"Already registered");
                    } else {
                       JOptionPane.showMessageDialog(null,"Welcome, " + name1 + "\nYour account is sucessfully created\nNow proceed to Login");
                       new DonorLogin();
                       this.dispose();
                    }
                    connection.close();
                }
                } catch (Exception e) {
                       e.printStackTrace();
                      //JOptionPane.showMessageDialog( ok, "This mobile no. is already registered");
                }  

    }//GEN-LAST:event_submitActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new DonorLogin();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
          String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match= patt.matcher(name.getText());
        if(!match.matches())
        {
            nlab.setText("Invalid");
        }
        else
        {
            nlab.setText(null);
        }
    }//GEN-LAST:event_nameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
       String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][A-Za-z]{0,5}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match= patt.matcher(email.getText());
        if(!match.matches())
        {
            elab.setText("Invalid");
        }
        else
        {
            elab.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
         String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match= patt.matcher(address.getText());
        if(!match.matches())
        {
            adlab.setText("Validate address");
        }
        else
        {
            adlab.setText(null);
        }
    }//GEN-LAST:event_addressKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
               String PATTERN="^[a-zA-Z0-9]{0,8}$";
                Pattern patt= Pattern.compile(PATTERN);
        Matcher match= patt.matcher(pass.getText());
        if(!match.matches())
        {
            pslab.setText("Enter only 8 characters/digits");
        }
        else
        {
            pslab.setText(null);
        }
    }//GEN-LAST:event_passKeyReleased

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
          
        if(!pass.getText().equals(cpass.getText()))
        {
            cplab.setText("Invalid Password");
        }
        else
        {
            cplab.setText("Password Matched");
        }
    }//GEN-LAST:event_cpassKeyReleased

    private void phnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnoKeyReleased
               String PATTERN="^[7-9][0-9]{9}$";
               Pattern patt= Pattern.compile(PATTERN);
        Matcher match= patt.matcher(phno.getText());
        if(!match.matches())
        {
            plab.setText("Invalid");
        }
        else
        {
            plab.setText(null);
        }
    }//GEN-LAST:event_phnoKeyReleased

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
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel adlab;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JLabel cplab;
    private javax.swing.JLabel elab;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nlab;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phno;
    private javax.swing.JLabel plab;
    private javax.swing.JLabel pslab;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox type;
    // End of variables declaration//GEN-END:variables
}
