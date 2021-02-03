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

public class LoadPerson extends javax.swing.JFrame {
public static String Name;
    /**
     * Creates new form LoadStudent
     */
    
    ResultSet resultSet;
    String[] NameList = new String[15];
    String framename;
    
    public static LoadPersonalDetails f1;
    public static LoadFamilyDetails f2;
    public static LocationDetails f3;
    public static LoadCurrentDetails f4;
    public static LoadHostelDetails f5;
    
    public LoadPerson() {
        initComponents();
    
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
            
            String query = "SELECT * FROM PDetails;";
            resultSet = stmnt.executeQuery(query);
         
            int c = 0;
            NameComboBox.addItem("<Empty>");
            while(resultSet.next())
            {
                NameList[c] = resultSet.getString("PersonName");
                
                System.out.println("Name: " + NameList[c]);
                NameComboBox.addItem(NameList[c]);
                
                c++;
            }
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

        LoadDetailsHeading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        NameComboBox = new javax.swing.JComboBox<>();
        NameLabel = new javax.swing.JLabel();
        PreviewButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Load Student");
        setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N

        LoadDetailsHeading.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        LoadDetailsHeading.setText("Load Details");

        jSeparator1.setAlignmentX(1.0F);

        NameComboBox.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        NameComboBox.setMaximumRowCount(15);
        NameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameComboBoxActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        NameLabel.setText("Name");

        PreviewButton.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        PreviewButton.setText("Preview Details");
        PreviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviewButtonActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Personal Details", "Family Details", "Current Details", "Location", "Hostel Details" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadDetailsHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoadDetailsHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(PreviewButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviewButtonActionPerformed
        // TODO add your handling code here:
        
            this.setVisible(false);
            framename = (String)jComboBox1.getSelectedItem();
        
          if(framename.equalsIgnoreCase("personal details"))
          {
                f1 = new LoadPersonalDetails();
                f1.setVisible(true);
          }
        
            else if(framename.equalsIgnoreCase("family details"))
            {
                f2 = new LoadFamilyDetails();
                f2.setVisible(true);
            }
        
            else if(framename.equalsIgnoreCase("Location"))
            {
                f3 = new LocationDetails();
                f3.setVisible(true);
            }
        
            else if(framename.equalsIgnoreCase("Current Details"))
            {
                f4 = new LoadCurrentDetails();
                f4.setVisible(true);
            }
        
            else if(framename.equalsIgnoreCase("hostel Details"))
            {
                f5 = new LoadHostelDetails();
                f5.setVisible(true);
            }
        
            this.setVisible(false);    
    }//GEN-LAST:event_PreviewButtonActionPerformed

    private void NameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameComboBoxActionPerformed
        // TODO add your handling code here:
        Name = (String)NameComboBox.getSelectedItem();
        System.out.println("Name");
        if(Name.equals("<Empty>"))
            PreviewButton.setEnabled(false);
    
        else
            PreviewButton.setEnabled(true);
    }//GEN-LAST:event_NameComboBoxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadPerson().setVisible(true);
            }
        });    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadDetailsHeading;
    private javax.swing.JComboBox<String> NameComboBox;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton PreviewButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
