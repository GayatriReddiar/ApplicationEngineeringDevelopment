/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AgencyOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationEventWorkRequest;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reddy
 */
public class ManageDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonationJPanel
     */
    JPanel container;
    UserAccount account;
    NGOAdminOrganization organization;
    Enterprise enterprise;
    EcoSystem ecosystem;
    public ManageDonationJPanel(JPanel container, UserAccount account, NGOAdminOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)donationRequestsTable.getModel();
        dtm.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if(o instanceof AgencyOrganization){
                        for(WorkRequest request : o.getWorkQueue().getWorkRequestList()){
                            if(request instanceof DonationEventWorkRequest){
                                DonationEventWorkRequest req = (DonationEventWorkRequest) request;
                                Object[] row = new Object[1];
                                row[0] = req;
                                dtm.addRow(row);
                            }
                        }
                    } 
                }
            }
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

        cancelDonationButton = new javax.swing.JButton();
        viewDonationButton = new javax.swing.JButton();
        viewRegistrationsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createDonationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        donationRequestsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        cancelDonationButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelDonationButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cancelDonationButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelDonationButton.setText("Cancel Request");
        cancelDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDonationButtonActionPerformed(evt);
            }
        });
        add(cancelDonationButton);
        cancelDonationButton.setBounds(350, 530, 250, 40);

        viewDonationButton.setBackground(new java.awt.Color(0, 0, 0));
        viewDonationButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewDonationButton.setForeground(new java.awt.Color(255, 255, 255));
        viewDonationButton.setText("View Details");
        viewDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonationButtonActionPerformed(evt);
            }
        });
        add(viewDonationButton);
        viewDonationButton.setBounds(350, 430, 250, 40);

        viewRegistrationsButton.setBackground(new java.awt.Color(0, 0, 0));
        viewRegistrationsButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewRegistrationsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRegistrationsButton.setText("View Registrations");
        viewRegistrationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationsButtonActionPerformed(evt);
            }
        });
        add(viewRegistrationsButton);
        viewRegistrationsButton.setBounds(350, 480, 250, 40);

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
        backButton.setBounds(40, 40, 120, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setText("Manage Donation");
        add(jLabel1);
        jLabel1.setBounds(300, 120, 410, 80);

        createDonationButton.setBackground(new java.awt.Color(0, 0, 0));
        createDonationButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        createDonationButton.setForeground(new java.awt.Color(255, 255, 255));
        createDonationButton.setText("Create Donation Request");
        createDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDonationButtonActionPerformed(evt);
            }
        });
        add(createDonationButton);
        createDonationButton.setBounds(350, 380, 250, 40);

        donationRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donation Requests"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationRequestsTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 240, 452, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/donate - Copy.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1912, 1075);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDonationButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = donationRequestsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        DonationEventWorkRequest request = (DonationEventWorkRequest)donationRequestsTable.getValueAt(selectedRow, 0);
        Organization org = null;
        for(Network n : ecosystem.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    if (o instanceof AgencyOrganization){
                        org = o;
                        break;
                    }
                }
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().remove(request);
            account.getQueue().getWorkRequestList().remove(request);
        }
        request.setStatus("Event Cancelled");
        JOptionPane.showMessageDialog(null, "Grant Request Cancelled. Agencies notified!");
        populateTable();
    }//GEN-LAST:event_cancelDonationButtonActionPerformed

    private void viewDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonationButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = donationRequestsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        DonationEventWorkRequest request = (DonationEventWorkRequest)donationRequestsTable.getValueAt(selectedRow, 0);
        ViewDonationRequestJPanel viewDonationRequestJPanel = new ViewDonationRequestJPanel(container, request, account, enterprise, ecosystem);
        container.add("ViewDonationRequestJPanel", viewDonationRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewDonationButtonActionPerformed

    private void viewRegistrationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = donationRequestsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        DonationEventWorkRequest request = (DonationEventWorkRequest)donationRequestsTable.getValueAt(selectedRow, 0);
        RegisteredAgenciesJPanel registeredAgenciesJPanel = new RegisteredAgenciesJPanel(container, request, account, enterprise);
        container.add("RegisteredAgenciesJPanel", registeredAgenciesJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewRegistrationsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDonationButtonActionPerformed
        // TODO add your handling code here:
        CreateDonationRequestJPanel createDonationRequestJPanel = new CreateDonationRequestJPanel(container, account, enterprise, ecosystem);
        container.add("CreateDonationRequestJPanel", createDonationRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_createDonationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelDonationButton;
    private javax.swing.JButton createDonationButton;
    private javax.swing.JTable donationRequestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDonationButton;
    private javax.swing.JButton viewRegistrationsButton;
    // End of variables declaration//GEN-END:variables
}