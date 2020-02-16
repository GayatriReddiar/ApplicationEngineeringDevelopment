/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HeadDoctorOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HeadDoctorApprovalWorkRequest;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reddy
 */
public class ManageHealthCampJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHealthCampJPanel
     */
    JPanel container;
    UserAccount account;
    NGOAdminOrganization ngoorganization;
    Enterprise enterprise;
    EcoSystem ecosystem;
    
    public ManageHealthCampJPanel(JPanel container, UserAccount account, NGOAdminOrganization ngoorganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.account = account;
        this.ngoorganization = ngoorganization;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)healthCampsTable.getModel();
        dtm.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof DoctorOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request instanceof HealthEventWorkRequest){
                                HealthEventWorkRequest req = (HealthEventWorkRequest) request;
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

        viewRegistrationButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        createCampButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        healthCampsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cancelCampButton = new javax.swing.JButton();
        viewCampButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        viewRegistrationButton.setBackground(new java.awt.Color(0, 0, 0));
        viewRegistrationButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewRegistrationButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRegistrationButton.setText("View Registrations");
        viewRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationButtonActionPerformed(evt);
            }
        });
        add(viewRegistrationButton);
        viewRegistrationButton.setBounds(380, 610, 210, 40);

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
        backButton.setBounds(30, 90, 110, 40);

        createCampButton.setBackground(new java.awt.Color(0, 0, 0));
        createCampButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        createCampButton.setForeground(new java.awt.Color(255, 255, 255));
        createCampButton.setText("Create Health Camp");
        createCampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCampButtonActionPerformed(evt);
            }
        });
        add(createCampButton);
        createCampButton.setBounds(380, 510, 210, 40);

        healthCampsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Health Camps"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(healthCampsTable);
        if (healthCampsTable.getColumnModel().getColumnCount() > 0) {
            healthCampsTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(260, 310, 452, 139);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Health Camp");
        add(jLabel1);
        jLabel1.setBounds(270, 190, 430, 70);

        cancelCampButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelCampButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cancelCampButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelCampButton.setText("Cancel Health Camp");
        cancelCampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCampButtonActionPerformed(evt);
            }
        });
        add(cancelCampButton);
        cancelCampButton.setBounds(380, 660, 210, 40);

        viewCampButton.setBackground(new java.awt.Color(0, 0, 0));
        viewCampButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewCampButton.setForeground(new java.awt.Color(255, 255, 255));
        viewCampButton.setText("View Camp Details");
        viewCampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCampButtonActionPerformed(evt);
            }
        });
        add(viewCampButton);
        viewCampButton.setBounds(380, 560, 210, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/international-childrens-day_136441_1280x553 - Copy.jpg"))); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, 0, 1920, 829);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createCampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCampButtonActionPerformed
        // TODO add your handling code here:
        CreateHealthCampJPanel createHealthCampJPanel = new CreateHealthCampJPanel(container, account, enterprise, ecosystem);
        container.add("CreateHealthCampJPanel", createHealthCampJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_createCampButtonActionPerformed

    private void viewCampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCampButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = healthCampsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCampsTable.getValueAt(selectedRow, 0);
        ViewHealthCampJPanel viewHealthCampJPanel = new ViewHealthCampJPanel(container, request, account, enterprise, ecosystem);
        container.add("viewHealthEventDetailsJPanel", viewHealthCampJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewCampButtonActionPerformed

    private void viewRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = healthCampsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCampsTable.getValueAt(selectedRow, 0);
        RegisteredDoctorsJPanel registeredDoctorsJPanel = new RegisteredDoctorsJPanel(container, request, account, enterprise);
        container.add("RegisteredDoctorsJPanel", registeredDoctorsJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewRegistrationButtonActionPerformed

    private void cancelCampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCampButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = healthCampsTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCampsTable.getValueAt(selectedRow, 0);
        Organization org = null;
        for(Network network : ecosystem.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof DoctorOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
            }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().remove(request);
            account.getQueue().getWorkRequestList().remove(request);
            for(Network n : ecosystem.getNetworkList()){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        for(WorkRequest req : o.getWorkQueue().getWorkRequestList()){
                            if(req instanceof HeadDoctorApprovalWorkRequest){
                                HeadDoctorApprovalWorkRequest headDocrequest = (HeadDoctorApprovalWorkRequest) req;
                                if(headDocrequest.getWorkRequest()== request){
                                    headDocrequest.setStatus("Event Cancelled");
                                }
                            }
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Health Camp is cancelled. Hospitals are notified!");
        populateTable();
    }//GEN-LAST:event_cancelCampButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelCampButton;
    private javax.swing.JButton createCampButton;
    private javax.swing.JTable healthCampsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewCampButton;
    private javax.swing.JButton viewRegistrationButton;
    // End of variables declaration//GEN-END:variables
}