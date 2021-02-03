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

public class LoadFamilyDetails extends javax.swing.JFrame {

    /**
     * Creates new form LoadFamilyDetails
     */
    String name;
    
    public LoadFamilyDetails() {
        initComponents();
        
        name = LoadPerson.Name;
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
            
            String query = "SELECT * FROM FDetails WHERE(personName = '" + name + "');";
            
            ResultSet RS = stmnt.executeQuery(query);
            RS.first();

            
            FatherNameField.setText(RS.getString(2));
            FatherNumberField.setText(RS.getString(5));
            MotherNameField.setText(RS.getString(3));
            MotherNumberField.setText(RS.getString(4));
            LandlineNumberField.setText(RS.getString(7));
            Address.setText(RS.getString(6));
            
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

        PersonName3 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        PersonName7 = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        PersonName = new javax.swing.JLabel();
        BloodGroup = new javax.swing.JLabel();
        PersonName11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Diseases = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        CurrentHeading1 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        PersonName4 = new javax.swing.JLabel();
        FatherNumberField = new javax.swing.JLabel();
        PersonName8 = new javax.swing.JLabel();
        MotherNameField = new javax.swing.JLabel();
        PersonName1 = new javax.swing.JLabel();
        FatherNameField = new javax.swing.JLabel();
        PersonName5 = new javax.swing.JLabel();
        MotherNumberField = new javax.swing.JLabel();
        PersonName9 = new javax.swing.JLabel();
        LandlineNumberField = new javax.swing.JLabel();
        PersonName12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        PersonName3.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName3.setText("Phone Number");
        PersonName3.setAutoscrolls(true);

        PhoneNumber.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PhoneNumber.setText("Empty");
        PhoneNumber.setAutoscrolls(true);

        PersonName7.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName7.setText("Date Of Birth");
        PersonName7.setAutoscrolls(true);

        DOB.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        DOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DOB.setText("Empty");
        DOB.setAutoscrolls(true);

        PersonName.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName.setText("Blood Group");
        PersonName.setAutoscrolls(true);

        BloodGroup.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        BloodGroup.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BloodGroup.setText("Empty");
        BloodGroup.setAutoscrolls(true);

        PersonName11.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName11.setText(" Diseases");

        Diseases.setEditable(false);
        Diseases.setColumns(20);
        Diseases.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        Diseases.setRows(5);
        jScrollPane3.setViewportView(Diseases);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator2.setAutoscrolls(true);
        jSeparator2.setFocusable(true);

        CurrentHeading1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        CurrentHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentHeading1.setText("Empty");

        Heading.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Family Details");

        PersonName4.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName4.setText("Father's Number");
        PersonName4.setAutoscrolls(true);

        FatherNumberField.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        FatherNumberField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FatherNumberField.setText("Empty");
        FatherNumberField.setAutoscrolls(true);

        PersonName8.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName8.setText("Mother's Name");
        PersonName8.setAutoscrolls(true);

        MotherNameField.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        MotherNameField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MotherNameField.setText("Empty");
        MotherNameField.setAutoscrolls(true);

        PersonName1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName1.setText("Father's Name");
        PersonName1.setAutoscrolls(true);

        FatherNameField.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        FatherNameField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FatherNameField.setText("Empty");
        FatherNameField.setAutoscrolls(true);

        PersonName5.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName5.setText("Mother's Number");
        PersonName5.setAutoscrolls(true);

        MotherNumberField.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        MotherNumberField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MotherNumberField.setText("Empty");
        MotherNumberField.setAutoscrolls(true);

        PersonName9.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName9.setText("Landline Number");
        PersonName9.setAutoscrolls(true);

        LandlineNumberField.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        LandlineNumberField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LandlineNumberField.setText("Empty");
        LandlineNumberField.setAutoscrolls(true);

        PersonName12.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonName12.setText("Address");

        Address.setEditable(false);
        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        Address.setRows(5);
        jScrollPane4.setViewportView(Address);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CurrentHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MotherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FatherNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LandlineNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MotherNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PersonName12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName1)
                    .addComponent(FatherNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName4)
                    .addComponent(FatherNumberField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName8)
                    .addComponent(MotherNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName5)
                    .addComponent(MotherNumberField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName9)
                    .addComponent(LandlineNumberField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(PersonName12))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(LoadFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadFamilyDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JLabel BloodGroup;
    private javax.swing.JLabel CurrentHeading1;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextArea Diseases;
    private javax.swing.JLabel FatherNameField;
    private javax.swing.JLabel FatherNumberField;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel LandlineNumberField;
    private javax.swing.JLabel MotherNameField;
    private javax.swing.JLabel MotherNumberField;
    private javax.swing.JLabel PersonName;
    private javax.swing.JLabel PersonName1;
    private javax.swing.JLabel PersonName11;
    private javax.swing.JLabel PersonName12;
    private javax.swing.JLabel PersonName3;
    private javax.swing.JLabel PersonName4;
    private javax.swing.JLabel PersonName5;
    private javax.swing.JLabel PersonName7;
    private javax.swing.JLabel PersonName8;
    private javax.swing.JLabel PersonName9;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}