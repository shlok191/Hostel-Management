/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

/**
 *
 * @author hp
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoadPersonalDetails extends javax.swing.JFrame {

    public static String name;
    
    /**
     * Creates new form LoadPerson2
     */
    public LoadPersonalDetails() {
        initComponents();
    
        name = LoadPerson.Name;
        System.out.println(name);
        CurrentHeading1.setText(name);
        
        try
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            }
            
            catch(ClassNotFoundException a)
            {
                System.out.println("Error class not Found");
            }
            
            String userID = "root";
            String password = "iamshlok";
            String URL = "jdbc:mysql://localhost:3306/hostel";
            
            Connection connect = DriverManager.getConnection(URL, userID, password);
            Statement stmnt = connect.createStatement();
            
            System.out.println("Connection Established!");
            
            String query = "SELECT * FROM pdetails WHERE(personName = '" + name + "');";
            
            ResultSet RS = stmnt.executeQuery(query);
            RS.first();
            
            PersonIDField2.setText(RS.getString(2));
            PhoneNumberField2.setText(RS.getString(4));
            BloodGroupField2.setText(RS.getString(3));
            DOB.setText(RS.getString(5));
            DiseasesField2.setText(RS.getString(6));
                      
        }
        catch(SQLException a)
        {
            System.out.println(a);
            System.out.println("Error");
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

        jSeparator1 = new javax.swing.JSeparator();
        CurrentHeading = new javax.swing.JLabel();
        PersonName2 = new javax.swing.JLabel();
        PersonName5 = new javax.swing.JLabel();
        PersonName6 = new javax.swing.JLabel();
        PersonName9 = new javax.swing.JLabel();
        PersonName10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        NumberField = new javax.swing.JTextField();
        PersonName8 = new javax.swing.JLabel();
        NameField3 = new javax.swing.JLabel();
        CurrentHeading1 = new javax.swing.JLabel();
        PersonName = new javax.swing.JLabel();
        PhoneNumber2 = new javax.swing.JLabel();
        BloodGroupField2 = new javax.swing.JLabel();
        PersonName7 = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        Diseases = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DiseasesField2 = new javax.swing.JTextPane();
        PhoneNumberField2 = new javax.swing.JTextField();
        BloodGroup2 = new javax.swing.JLabel();
        PersonIDField2 = new javax.swing.JLabel();

        jSeparator1.setAlignmentX(1.0F);

        CurrentHeading.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        CurrentHeading.setText("Current Details");

        PersonName2.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        PersonName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonName2.setText("Blood Group");

        PersonName5.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        PersonName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonName5.setText("Phone Number");

        PersonName6.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        PersonName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonName6.setText("Empty");

        PersonName9.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        PersonName9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonName9.setText("Date Of Birth");

        PersonName10.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        PersonName10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonName10.setText("Empty");

        jPasswordField1.setText("jPasswordField1");

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        NumberField.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N

        PersonName8.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName8.setText("Date Of Birth");
        PersonName8.setAutoscrolls(true);

        NameField3.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        NameField3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NameField3.setText("Empty");
        NameField3.setAutoscrolls(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CurrentHeading1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        CurrentHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentHeading1.setText("Empty");

        PersonName.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName.setText("Person ID");
        PersonName.setAutoscrolls(true);

        PhoneNumber2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PhoneNumber2.setText("Phone Number");
        PhoneNumber2.setAutoscrolls(true);

        BloodGroupField2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        BloodGroupField2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BloodGroupField2.setText("Empty");
        BloodGroupField2.setAutoscrolls(true);

        PersonName7.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        PersonName7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName7.setText("Date Of Birth");
        PersonName7.setAutoscrolls(true);

        DOB.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        DOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DOB.setText("Empty");
        DOB.setAutoscrolls(true);

        Diseases.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        Diseases.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Diseases.setText(" Diseases");

        jSeparator2.setAutoscrolls(true);
        jSeparator2.setFocusable(true);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Heading.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Personal Details");

        DiseasesField2.setEditable(false);
        DiseasesField2.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jScrollPane3.setViewportView(DiseasesField2);

        PhoneNumberField2.setEditable(false);
        PhoneNumberField2.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N

        BloodGroup2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        BloodGroup2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BloodGroup2.setText("Blood Group");
        BloodGroup2.setAutoscrolls(true);

        PersonIDField2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonIDField2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PersonIDField2.setText("Empty");
        PersonIDField2.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Diseases, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CurrentHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneNumberField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PersonIDField2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BloodGroup2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BloodGroupField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PersonName7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 178, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 177, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName)
                    .addComponent(PersonIDField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodGroup2)
                    .addComponent(BloodGroupField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonName7)
                    .addComponent(DOB))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Diseases)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 155, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 155, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoadPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadPersonalDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodGroup2;
    private javax.swing.JLabel BloodGroupField2;
    private javax.swing.JLabel CurrentHeading;
    private javax.swing.JLabel CurrentHeading1;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Diseases;
    private javax.swing.JTextPane DiseasesField2;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel NameField3;
    private javax.swing.JTextField NumberField;
    private javax.swing.JLabel PersonIDField2;
    private javax.swing.JLabel PersonName;
    private javax.swing.JLabel PersonName10;
    private javax.swing.JLabel PersonName2;
    private javax.swing.JLabel PersonName5;
    private javax.swing.JLabel PersonName6;
    private javax.swing.JLabel PersonName7;
    private javax.swing.JLabel PersonName8;
    private javax.swing.JLabel PersonName9;
    private javax.swing.JLabel PhoneNumber2;
    private javax.swing.JTextField PhoneNumberField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
