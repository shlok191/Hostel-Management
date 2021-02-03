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

import static hostel.EntryForm3.Error;
import static hostel.EntryForm3.Landline;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class AlterFamilyDetails extends javax.swing.JFrame {

    static String name = AlterPerson.Name;
    public static String FNumber;
    public static String MNumber;
    public static String Landline;
    
    ResultSet RS;
    Statement stmnt;
    
    /**
     * Creates new form AlterFamilyDetails
     */
    public AlterFamilyDetails() {
        initComponents();
        
        CurrentHeading1.setText(AlterPerson.Name);
        
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
            stmnt = connect.createStatement();
            
            System.out.println("Connection Established!");
            
            String query = "SELECT * FROM FDetails Where(personName = '" + name + "');";
            
            RS = stmnt.executeQuery(query);
            RS.next();
            
            FatherName.setText(RS.getString(2));
            FatherNumber.setText(RS.getString(5));
            MotherName.setText(RS.getString(3));
            MotherNumber.setText(RS.getString(4));
            LandlineNumber.setText(RS.getString(7));
            Address.setText(RS.getString(6));
        }
        
        catch(SQLException a)
        {
            System.out.println("Error");
            System.out.println(a);
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

        CurrentHeading1 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        PersonName1 = new javax.swing.JLabel();
        FatherName = new javax.swing.JTextField();
        PersonName2 = new javax.swing.JLabel();
        FatherNumber = new javax.swing.JTextField();
        PersonName3 = new javax.swing.JLabel();
        MotherName = new javax.swing.JTextField();
        PersonName4 = new javax.swing.JLabel();
        MotherNumber = new javax.swing.JTextField();
        PersonName5 = new javax.swing.JLabel();
        LandlineNumber = new javax.swing.JTextField();
        PersonName6 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CurrentHeading1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        CurrentHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentHeading1.setText("Empty");

        Heading.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Family Details");

        jSeparator2.setAutoscrolls(true);
        jSeparator2.setFocusable(true);

        PersonName1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName1.setText("Father's Name");

        FatherName.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N

        PersonName2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName2.setText("Father's Number");

        FatherNumber.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        FatherNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FatherNumberFocusLost(evt);
            }
        });

        PersonName3.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName3.setText("Mother's Name");

        MotherName.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N

        PersonName4.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName4.setText("Mother's Number");

        MotherNumber.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        MotherNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotherNumberFocusLost(evt);
            }
        });

        PersonName5.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName5.setText("Landline Number (0731)");

        LandlineNumber.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        LandlineNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LandlineNumberFocusLost(evt);
            }
        });

        PersonName6.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PersonName6.setText("Address");

        SaveButton.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        SaveButton.setText("Save & Exit");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        Address.setRows(5);
        jScrollPane2.setViewportView(Address);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CurrentHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PersonName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(FatherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PersonName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MotherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(LandlineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName2)
                    .addComponent(FatherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName3)
                    .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName4)
                    .addComponent(MotherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonName5)
                    .addComponent(LandlineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PersonName6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    if(FatherName.getText().equals(""))
    {
        Error = new InvalidData();
        Error.setVisible(true);
    }
    
    else
    {
        if(FatherNumber.getText().equals(""))
        {
            Error = new InvalidData();
            Error.setVisible(true);
        }
        
        else
        {
            if(MotherNumber.getText().equals(""))
            {
                Error = new InvalidData();
                Error.setVisible(true);
            }
            
            else
            {
                if(MotherName.getText().equals(""))
                {
                    Error = new InvalidData();
                    Error.setVisible(true);
                }
                
                else
                {
                    if(LandlineNumber.getText().equals(""))
                    {
                        Error = new InvalidData();
                        Error.setVisible(true);
                    }
                    
                    else
                    {
                        if(Address.getText().equals(""))
                        {
                            Error = new InvalidData();
                            Error.setVisible(true);
                        }
                        
                        else
                        {
                            try
                            {
                               String query = "DELETE FROM FDetails WHERE(personName = '" + name + "');";
                               stmnt.executeUpdate(query);

                               System.out.println("DELETE DONE!");

                               query = "INSERT INTO FDetails VALUES('" + name + "', '" + FatherName.getText() + "', '" + MotherName.getText() + "', " + MotherNumber.getText()
                                       + ", " + FatherNumber.getText() + ", '" + Address.getText() + "', " + LandlineNumber.getText() + ");";

                               stmnt.executeUpdate(query);
                               System.out.println("Save DONE!");

                            }

                            catch(SQLException b)
                            {
                                System.out.println("Error");
                                System.out.println(b);
                            }

                            this.setVisible(false);
                        }
                    }
                }
            }
        }
    }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void FatherNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FatherNumberFocusLost
        // TODO add your handling code here:
    if(FatherNumber.getText().equals(""))
        FNumber = "";
    
    else
    {
        try
        {
            FNumber = FatherNumber.getText();
            long p = Long.parseLong(FNumber);
        }
        
        catch(NumberFormatException a)
        {
            System.out.println("The Format is incorrect");
            Error = new InvalidData();
            Error.setVisible(true);
            FatherNumber.setText("");
        }
        FNumber = FatherNumber.getText();
    }
    }//GEN-LAST:event_FatherNumberFocusLost

    private void MotherNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotherNumberFocusLost
        // TODO add your handling code here:
        if(MotherNumber.getText().equals(""))
        MNumber = "";
    
    else
    {
        try
        {
            MNumber = MotherNumber.getText();
            long p = Long.parseLong(MNumber);
        }
        
        catch(NumberFormatException a)
        {
            System.out.println("The Format is incorrect");
            Error = new InvalidData();
            Error.setVisible(true);
            MotherNumber.setText("");
        }
        MNumber = MotherNumber.getText();
    }
    }//GEN-LAST:event_MotherNumberFocusLost

    private void LandlineNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LandlineNumberFocusLost
        // TODO add your handling code here:
        if(LandlineNumber.getText().equals(""))
            Landline = "";
        else
        {
            try
            {
                Landline = LandlineNumber.getText();
                int p = Integer.parseInt(Landline);
            }

            catch(NumberFormatException a)
            {
                System.out.println("The Format is wrong");
                LandlineNumber.setText("");
                Error = new InvalidData();
                Error.setVisible(true);
            }
            Landline = LandlineNumber.getText();
        }
    }//GEN-LAST:event_LandlineNumberFocusLost

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
            java.util.logging.Logger.getLogger(AlterFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterFamilyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterFamilyDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JLabel CurrentHeading1;
    private javax.swing.JTextField FatherName;
    private javax.swing.JTextField FatherNumber;
    private javax.swing.JLabel Heading;
    private javax.swing.JTextField LandlineNumber;
    private javax.swing.JTextField MotherName;
    private javax.swing.JTextField MotherNumber;
    private javax.swing.JLabel PersonName1;
    private javax.swing.JLabel PersonName2;
    private javax.swing.JLabel PersonName3;
    private javax.swing.JLabel PersonName4;
    private javax.swing.JLabel PersonName5;
    private javax.swing.JLabel PersonName6;
    private javax.swing.JButton SaveButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
