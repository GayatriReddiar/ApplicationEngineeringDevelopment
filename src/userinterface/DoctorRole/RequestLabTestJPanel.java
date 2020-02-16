/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Employee child;
    private DoctorOrganization doctorOrganization;
     private HealthEventWorkRequest request;
     private EcoSystem ecosystem;
    private UserAccount account;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, HealthEventWorkRequest request, Organization organization, Employee child, EcoSystem ecosystem, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.doctorOrganization = (DoctorOrganization)doctorOrganization;
        this.child = child;
        this.ecosystem = ecosystem;
        this.account = account;
        ngoNameTextField.setText(request.getNgoName());
        checkupTextField.setText(request.getHealthEventName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        ngoNameTextField = new javax.swing.JTextField();
        checkupTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        testNameTextField = new javax.swing.JTextField();
        childNameTextField = new javax.swing.JTextField();
        dateTextField = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(230, 20, 120, 40);

        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Request Lab Test");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(870, 70, 490, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NGO :");
        add(jLabel2);
        jLabel2.setBounds(810, 170, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Checkup Camp :");
        add(jLabel3);
        jLabel3.setBounds(810, 220, 220, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date:");
        add(jLabel15);
        jLabel15.setBounds(810, 420, 150, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Child Name :");
        add(jLabel4);
        jLabel4.setBounds(810, 270, 200, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age :");
        add(jLabel5);
        jLabel5.setBounds(810, 320, 150, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Test Name:");
        add(jLabel6);
        jLabel6.setBounds(810, 370, 150, 30);

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton);
        submitButton.setBounds(970, 500, 130, 40);

        ngoNameTextField.setEditable(false);
        add(ngoNameTextField);
        ngoNameTextField.setBounds(1060, 170, 222, 30);

        checkupTextField.setEditable(false);
        add(checkupTextField);
        checkupTextField.setBounds(1060, 220, 222, 30);
        add(ageTextField);
        ageTextField.setBounds(1060, 320, 222, 30);
        add(testNameTextField);
        testNameTextField.setBounds(1060, 370, 222, 30);
        add(childNameTextField);
        childNameTextField.setBounds(1060, 270, 222, 30);
        add(dateTextField);
        dateTextField.setBounds(1060, 420, 250, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doc1.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof DoctorLabTestJPanel) {
                DoctorLabTestJPanel panel = (DoctorLabTestJPanel) c;
                panel.populateTable(); 
            }
        }
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void disableRadio() {
        ngoNameTextField.setEnabled(false);
        checkupTextField.setEnabled(false);
        dateTextField.setEnabled(false);
        childNameTextField.setEnabled(false);
        ageTextField.setEnabled(false);
        testNameTextField.setEnabled(false);
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (childNameTextField.getText().equals("") || dateTextField.getText().equals("") || testNameTextField.getText().equals("") || ageTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return;
        }
        if (!ngoNameTextField.getText().matches("[A-Za-z]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name for the NGO A-Z/a-z !");
            return;
        }
        if (!childNameTextField.getText().matches("[A-Za-z]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name for the Child name: A-Z/a-z !");
            return;
        }
        if (!checkupTextField.getText().matches("[A-Za-z]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name for the Checkup Camp A-Z/a-z !");
            return;
        }
        try {
            Integer.parseInt(ageTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid!!  Please enter a Number for the Child's age");
            return;
        }
        if (!testNameTextField.getText().matches("[A-Za-z0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter valid test name (a-z)/(1-9) !");
            return;
        }
    
        try{
            LabTestWorkRequest presReq = new LabTestWorkRequest();
            presReq.setHealthCampName(checkupTextField.getText());
            presReq.setChildAge(Integer.parseInt(ageTextField.getText()));
            presReq.setChildName(childNameTextField.getText());
            presReq.setDate(dateTextField.getText());
            presReq.setNgoName(ngoNameTextField.getText());
            presReq.setTestName(testNameTextField.getText());
            presReq.setStatus("Sent to Lab");
            presReq.setTestResult("In Process");
            
            Organization org = null;
            for(Network network : ecosystem.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof LabOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(presReq);
                account.getQueue().getWorkRequestList().add(presReq);
            }

            JOptionPane.showMessageDialog(null, "Lab Request Created Successfully and sent to Lab");

            disableRadio();

            request.getTestedChildList().add(child);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Age!");
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField checkupTextField;
    private javax.swing.JTextField childNameTextField;
    private com.github.lgooddatepicker.components.DatePicker dateTextField;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField ngoNameTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField testNameTextField;
    // End of variables declaration//GEN-END:variables
}
