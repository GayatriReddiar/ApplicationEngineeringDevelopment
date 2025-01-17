/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOAdminOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author reddy
 */
public class NGOAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminWorkAreaJP
     */
    JPanel container;
    UserAccount account;
    NGOAdminOrganization organization;
    Enterprise enterprise;
    EcoSystem ecosystem;
    public NGOAdminWorkAreaJPanel(JPanel container, UserAccount account, NGOAdminOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.container=container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
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
        eduWorkshopButton = new javax.swing.JButton();
        healthCampButton = new javax.swing.JButton();
        donationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 45)); // NOI18N
        jLabel1.setText("NGO ADMIN PORTAL");
        add(jLabel1);
        jLabel1.setBounds(1000, 130, 480, 60);

        eduWorkshopButton.setBackground(new java.awt.Color(0, 0, 0));
        eduWorkshopButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        eduWorkshopButton.setForeground(new java.awt.Color(255, 255, 255));
        eduWorkshopButton.setText("Educational Workshop");
        eduWorkshopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduWorkshopButtonActionPerformed(evt);
            }
        });
        add(eduWorkshopButton);
        eduWorkshopButton.setBounds(1120, 240, 235, 50);

        healthCampButton.setBackground(new java.awt.Color(0, 0, 0));
        healthCampButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        healthCampButton.setForeground(new java.awt.Color(255, 255, 255));
        healthCampButton.setText("Health Camp");
        healthCampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthCampButtonActionPerformed(evt);
            }
        });
        add(healthCampButton);
        healthCampButton.setBounds(1150, 330, 149, 50);

        donationButton.setBackground(new java.awt.Color(0, 0, 0));
        donationButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        donationButton.setForeground(new java.awt.Color(255, 255, 255));
        donationButton.setText("Donation");
        donationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationButtonActionPerformed(evt);
            }
        });
        add(donationButton);
        donationButton.setBounds(1170, 430, 115, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main-image - Copy.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1953, 945);
    }// </editor-fold>//GEN-END:initComponents

    private void eduWorkshopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduWorkshopButtonActionPerformed
        // TODO add your handling code here:
        ManageEducationalWorkshopJPanel manageEducationalWorkshopJPanel = new ManageEducationalWorkshopJPanel(container, account, organization, enterprise, ecosystem);
        container.add("ManageEducationalWorkshopJPanel", manageEducationalWorkshopJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_eduWorkshopButtonActionPerformed

    private void healthCampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthCampButtonActionPerformed
        // TODO add your handling code here:
        ManageHealthCampJPanel manageHealthCampJPanel = new ManageHealthCampJPanel(container, account, organization, enterprise, ecosystem);
        container.add("ManageHealthCampJPanel", manageHealthCampJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_healthCampButtonActionPerformed

    private void donationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationButtonActionPerformed
        // TODO add your handling code here:
        ManageDonationJPanel manageDonationJPanel = new ManageDonationJPanel(container, account, organization, enterprise, ecosystem);
        container.add("ManageDonationJPanel", manageDonationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_donationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donationButton;
    private javax.swing.JButton eduWorkshopButton;
    private javax.swing.JButton healthCampButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
