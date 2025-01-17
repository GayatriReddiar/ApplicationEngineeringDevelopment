/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AgencyRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AgencyOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentCommunityOrganization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationEventWorkRequest;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.StudentApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author reddy
 */
public class DonationRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationRegistrationJPanel
     */
    private JPanel userProcessContainer;
    Organization organization;
    DonationEventWorkRequest request;
    UserAccount account;
    EcoSystem ecosystem;
    public DonationRegistrationJPanel(JPanel userProcessContainer, DonationEventWorkRequest request, UserAccount userAccount, AgencyOrganization agencyOrganization, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = userAccount;
        this.organization = (AgencyOrganization)agencyOrganization;
        this.ecosystem = ecosystem;
        titleTextField.setText(request.getEventName());
        categoryTextField.setText(request.getCategory());
        amountTextField.setText(request.getFundingAmount());
        descriptionTextField.setText(request.getDescription());
        contactPersonTextField.setText(request.getContactPerson());
        contactEmailTextField.setText(request.getContactEmail());
        elevatorPitchTextArea.setText(request.getElevatorPitch());
        registerEnabled();
    }
    
    public void registerEnabled() {
        /*for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(org instanceof AgencyOrganization){
                        for(WorkRequest r : org.getWorkQueue().getWorkRequestList()){
                                DonationEventWorkRequest grantReq = (DonationEventWorkRequest) r;*/
                                if (request.getStatus().equals("Approved") && request.getSender() == account){
                                    rejectButton.setEnabled(false);
                                    //break;
                                } 
                                else {
                                    rejectButton.setEnabled(true);
                                }
                       /* }
                    }
                }
            }
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        elevatorPitchTextArea = new javax.swing.JTextArea();
        descriptionTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contactPersonTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contactEmailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        categoryTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        amountTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rejectButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        approveButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setLayout(null);

        elevatorPitchTextArea.setEditable(false);
        elevatorPitchTextArea.setColumns(20);
        elevatorPitchTextArea.setRows(5);
        jScrollPane2.setViewportView(elevatorPitchTextArea);

        add(jScrollPane2);
        jScrollPane2.setBounds(580, 540, 270, 80);

        descriptionTextField.setEditable(false);
        add(descriptionTextField);
        descriptionTextField.setBounds(580, 390, 270, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel2.setText("Title:");
        add(jLabel2);
        jLabel2.setBounds(390, 240, 90, 30);

        contactPersonTextField.setEditable(false);
        add(contactPersonTextField);
        contactPersonTextField.setBounds(580, 440, 270, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel3.setText("Category:");
        add(jLabel3);
        jLabel3.setBounds(390, 290, 130, 30);

        contactEmailTextField.setEditable(false);
        add(contactEmailTextField);
        contactEmailTextField.setBounds(580, 490, 270, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel4.setText("Amount:");
        add(jLabel4);
        jLabel4.setBounds(390, 340, 120, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel7.setText("Contact Email:");
        add(jLabel7);
        jLabel7.setBounds(390, 490, 170, 30);

        categoryTextField.setEditable(false);
        add(categoryTextField);
        categoryTextField.setBounds(580, 290, 270, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel8.setText("Elevator Pitch:");
        add(jLabel8);
        jLabel8.setBounds(390, 540, 170, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setText("Contact Person:");
        add(jLabel5);
        jLabel5.setBounds(390, 440, 180, 30);

        titleTextField.setEditable(false);
        add(titleTextField);
        titleTextField.setBounds(580, 240, 270, 30);

        amountTextField.setEditable(false);
        add(amountTextField);
        amountTextField.setBounds(580, 340, 270, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel6.setText("Description:");
        add(jLabel6);
        jLabel6.setBounds(390, 390, 150, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setText("Grant Request Details");
        add(jLabel1);
        jLabel1.setBounds(400, 110, 416, 60);

        rejectButton.setBackground(new java.awt.Color(0, 0, 0));
        rejectButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rejectButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton);
        rejectButton.setBounds(740, 650, 130, 40);

        backButton1.setBackground(new java.awt.Color(0, 0, 0));
        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backButton1.setForeground(new java.awt.Color(255, 255, 255));
        backButton1.setText("<<Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1);
        backButton1.setBounds(30, 20, 110, 40);

        approveButton1.setBackground(new java.awt.Color(0, 0, 0));
        approveButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        approveButton1.setForeground(new java.awt.Color(255, 255, 255));
        approveButton1.setText("Approve");
        approveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButton1ActionPerformed(evt);
            }
        });
        add(approveButton1);
        approveButton1.setBounds(570, 650, 130, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donate - Copy.jpg"))); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(0, 0, 1912, 1075);
    }// </editor-fold>//GEN-END:initComponents

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        
        request.setStatus("Rejected");
        request.getAgencyList().remove(account.getEmp());
        JOptionPane.showMessageDialog(null, "Grant Request Rejected!");
        rejectButton.setEnabled(false);
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof AgencyWorkAreaJPanel) {
                AgencyWorkAreaJPanel panel = (AgencyWorkAreaJPanel) c;
                panel.populateRequestsTable();
                panel.populateApprovalsTable();
            }
        }
    }//GEN-LAST:event_backButton1ActionPerformed

    private void approveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButton1ActionPerformed
        // TODO add your handling code here:
        request.setSender(account);
        request.setStatus("Approved");
        Employee emp = account.getEmp();
        request.getAgencyList().add(emp);
        JOptionPane.showMessageDialog(null, "Grant Request Approved!");
        approveButton1.setEnabled(false);
    }//GEN-LAST:event_approveButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton approveButton1;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JTextField contactEmailTextField;
    private javax.swing.JTextField contactPersonTextField;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextArea elevatorPitchTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rejectButton;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
