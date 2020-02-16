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
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.PrescriptionOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reddy
 */
public class ViewPrescriptionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPrescriptionsJPanel
     */
    private EcoSystem ecosystem;
    private HealthEventWorkRequest request;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    public ViewPrescriptionsJPanel(JPanel userProcessContainer, HealthEventWorkRequest ngoEvtReq, Organization doctorOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.organization = (DoctorOrganization)doctorOrganization;
        this.request = ngoEvtReq;
        this.enterprise = enterprise;
        
         populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)prescriptionsJTable.getModel();
        
        model.setRowCount(0);
        for(Network network : ecosystem.getNetworkList()){
            for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization org : enterprise1.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof PharmacyOrganization){
                            for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                            if(request instanceof PrescriptionOrderWorkRequest){
                                PrescriptionOrderWorkRequest req = (PrescriptionOrderWorkRequest) request;         
                                Object[] row = new Object[2];
                                row[0] = req.getChildName();
                                row[1] = req.getStatus();
                                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionsJTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        prescriptionsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child", "Prescription Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prescriptionsJTable);
        if (prescriptionsJTable.getColumnModel().getColumnCount() > 0) {
            prescriptionsJTable.getColumnModel().getColumn(0).setResizable(false);
            prescriptionsJTable.getColumnModel().getColumn(1).setResizable(false);
        }

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Prescriptions for Children");
        add(jLabel1);
        jLabel1.setBounds(870, 80, 621, 53);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doc1.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prescriptionsJTable;
    // End of variables declaration//GEN-END:variables
}
