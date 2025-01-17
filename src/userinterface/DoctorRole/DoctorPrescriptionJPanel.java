/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChildOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class DoctorPrescriptionJPanel extends javax.swing.JPanel {
    private EcoSystem ecosystem;
    private HealthEventWorkRequest request;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    
    private Enterprise enterprise;

    /**
     * Creates new form DoctorPrescriptionJPanel
     */
    public DoctorPrescriptionJPanel(JPanel userProcessContainer, HealthEventWorkRequest ngoEvtReq, Organization doctorOrganization, Enterprise enterprise, EcoSystem ecosystem, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.organization = (DoctorOrganization)doctorOrganization;
        this.request = ngoEvtReq;
        this.enterprise = enterprise;
        
         populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        childPrescriptionJTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        createPrescriptionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        childPrescriptionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child"
            }
        ));
        jScrollPane1.setViewportView(childPrescriptionJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(960, 220, 452, 106);

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
        backButton.setBounds(230, 10, 110, 50);

        createPrescriptionButton.setBackground(new java.awt.Color(0, 0, 0));
        createPrescriptionButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        createPrescriptionButton.setForeground(new java.awt.Color(255, 255, 255));
        createPrescriptionButton.setText("Create Prescription");
        createPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionButtonActionPerformed(evt);
            }
        });
        add(createPrescriptionButton);
        createPrescriptionButton.setBounds(1100, 370, 200, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Prescription for Children");
        add(jLabel1);
        jLabel1.setBounds(870, 80, 621, 53);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doc1.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed
 
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)childPrescriptionJTable.getModel();
        
        model.setRowCount(0);
        for(Network network : ecosystem.getNetworkList()){
            for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization org : enterprise1.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof ChildOrganization){
                        for(Employee child : org.getEmployeeDirectory().getEmpList()){
                            if(!request.getPrescribedChildList().contains(child)){
                                Object[] row = new Object[1];
               
                                row[0] = child;

                                model.addRow(row);
                            }   
                        }
                    }
                }
            }
        }
    }
    
    private void createPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrescriptionButtonActionPerformed
        int selectedRow = childPrescriptionJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select row from table");
            return;
        }

        Employee child = (Employee) childPrescriptionJTable.getValueAt(selectedRow, 0);
        CreatePrescriptionRequest createPrescriptionJPanel = new CreatePrescriptionRequest(userProcessContainer, request, organization, child, ecosystem, account);
        userProcessContainer.add("createPrescriptionJPanel", createPrescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPrescriptionButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable childPrescriptionJTable;
    private javax.swing.JButton createPrescriptionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
