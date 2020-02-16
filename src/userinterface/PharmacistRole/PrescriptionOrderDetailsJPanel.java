/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author adity
 */
public class PrescriptionOrderDetailsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer; 
    PrescriptionOrderWorkRequest request;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;

    /**
     * Creates new form PrescriptionOrderDetailsJPanel
     */
    public PrescriptionOrderDetailsJPanel(JPanel userProcessContainer, PrescriptionOrderWorkRequest request, UserAccount account,Organization organization, EcoSystem business) {
        initComponents();
        //this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.request = request;
        
        ngoTextField.setText(request.getNgoName());
        checkupTextField.setText(request.getHealthCampName());
        childNameTextField.setText(request.getChildName());
        ageOfChildTextFIeld.setText(String.valueOf(request.getChildAge()));
        prescriptionTextField.setText(request.getDetails());
        dateTextField.setText(request.getDate());
        processEnabled();
    }
    
    public void processEnabled() {
        if (request.getStatus().equals("Approved") && request.getSender() == account){
            processjButton.setEnabled(false);
        }
        else {
            processjButton.setEnabled(true);
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

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ngoTextField = new javax.swing.JTextField();
        childNameTextField = new javax.swing.JTextField();
        ageOfChildTextFIeld = new javax.swing.JTextField();
        checkupTextField = new javax.swing.JTextField();
        prescriptionTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        processjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setText("Prescription Orders Details");
        add(jLabel1);
        jLabel1.setBounds(260, 150, 630, 53);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(40, 30, 120, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel2.setText("NGO :");
        add(jLabel2);
        jLabel2.setBounds(280, 250, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel3.setText("Checkup Camp :");
        add(jLabel3);
        jLabel3.setBounds(280, 290, 220, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel15.setText("Date:");
        add(jLabel15);
        jLabel15.setBounds(280, 330, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel4.setText("Name of the Child:");
        add(jLabel4);
        jLabel4.setBounds(280, 370, 240, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setText("Age of the Child:");
        add(jLabel5);
        jLabel5.setBounds(280, 410, 220, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel6.setText("Prescription Details:");
        add(jLabel6);
        jLabel6.setBounds(280, 450, 240, 30);

        ngoTextField.setEditable(false);
        ngoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoTextFieldActionPerformed(evt);
            }
        });
        add(ngoTextField);
        ngoTextField.setBounds(540, 250, 214, 30);

        childNameTextField.setEditable(false);
        childNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childNameTextFieldActionPerformed(evt);
            }
        });
        add(childNameTextField);
        childNameTextField.setBounds(540, 370, 214, 30);

        ageOfChildTextFIeld.setEditable(false);
        ageOfChildTextFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageOfChildTextFIeldActionPerformed(evt);
            }
        });
        add(ageOfChildTextFIeld);
        ageOfChildTextFIeld.setBounds(540, 410, 214, 30);

        checkupTextField.setEditable(false);
        checkupTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkupTextFieldActionPerformed(evt);
            }
        });
        add(checkupTextField);
        checkupTextField.setBounds(540, 290, 214, 30);

        prescriptionTextField.setEditable(false);
        prescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionTextFieldActionPerformed(evt);
            }
        });
        add(prescriptionTextField);
        prescriptionTextField.setBounds(540, 450, 214, 30);

        dateTextField.setEditable(false);
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });
        add(dateTextField);
        dateTextField.setBounds(540, 330, 214, 30);

        processjButton.setBackground(new java.awt.Color(0, 0, 0));
        processjButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        processjButton.setForeground(new java.awt.Color(255, 255, 255));
        processjButton.setText("Process");
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });
        add(processjButton);
        processjButton.setBounds(450, 510, 140, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharm2 - Copy.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1920, 1004);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = userProcessContainer.getComponents();
        for (Component c : comps) {
            if (c instanceof PharmacistWorkAreaJPanel) {
                PharmacistWorkAreaJPanel panel = (PharmacistWorkAreaJPanel) c;
                panel.populateOrdersTable();
            }
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void ngoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngoTextFieldActionPerformed

    private void childNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childNameTextFieldActionPerformed

    private void ageOfChildTextFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageOfChildTextFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageOfChildTextFIeldActionPerformed

    private void checkupTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkupTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkupTextFieldActionPerformed

    private void prescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prescriptionTextFieldActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:
        request.setStatus("Order sent to NGO");
        JOptionPane.showMessageDialog(null, "Order is complete!");
        processjButton.setEnabled(false);
    }//GEN-LAST:event_processjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageOfChildTextFIeld;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField checkupTextField;
    private javax.swing.JTextField childNameTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField ngoTextField;
    private javax.swing.JTextField prescriptionTextField;
    private javax.swing.JButton processjButton;
    // End of variables declaration//GEN-END:variables
}
