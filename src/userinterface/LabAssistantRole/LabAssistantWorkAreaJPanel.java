/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import userinterface.PharmacistRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PrescriptionOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {
      
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization organization;
    private Enterprise enterprise;

    /**
     * Creates new form PharmacistWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization= (LabOrganization)organization;
        this.enterprise = enterprise;
        
        populateOrdersTable();
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
        jLabel2 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        viewDetailsjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setText("Lab Assistant Work Area");
        add(jLabel1);
        jLabel1.setBounds(980, 150, 480, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Orders:");
        add(jLabel2);
        jLabel2.setBounds(1160, 250, 110, 30);

        refreshButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton);
        refreshButton.setBounds(1000, 430, 160, 40);

        viewDetailsjButton.setBackground(new java.awt.Color(0, 0, 0));
        viewDetailsjButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewDetailsjButton.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsjButton.setText("View Details");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });
        add(viewDetailsjButton);
        viewDetailsjButton.setBounds(1260, 430, 170, 40);

        labJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGO", "Name of the Child"
            }
        ));
        jScrollPane1.setViewportView(labJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(1000, 290, 423, 106);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lab2 - Copy.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents
public void populateOrdersTable(){
        DefaultTableModel model = (DefaultTableModel) labJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof LabOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request instanceof LabTestWorkRequest){
                                if(request.getStatus().equals("Sent to Lab")){                                  
                                LabTestWorkRequest req = (LabTestWorkRequest) request;
                                Object[] row = new Object[2];
                    //            row[0] = request;
                    //            row[1] = request.getSender().getEmployee().getName();
                    //            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    //            row[3] = request.getStatus();
                                row[0] = req;
                                row[1] = req.getChildName();

                                model.addRow(row);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
    populateOrdersTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = labJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        LabTestWorkRequest request = (LabTestWorkRequest)labJTable.getValueAt(selectedRow, 0);
        LabOrderDetailsJPanel labOrderDetailsJPanel = new LabOrderDetailsJPanel(userProcessContainer, request, userAccount, organization, business);
        userProcessContainer.add("LabOrderDetailsJPanel", labOrderDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labJTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton viewDetailsjButton;
    // End of variables declaration//GEN-END:variables
}