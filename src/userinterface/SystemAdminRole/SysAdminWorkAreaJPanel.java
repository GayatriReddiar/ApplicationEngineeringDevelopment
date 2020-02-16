/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author reddy
 */
public class SysAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SysAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel1.setText("System Admin Work Area");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(500, 90, 490, 50);

        btnManageNetwork.setBackground(new java.awt.Color(0, 0, 0));
        btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork);
        btnManageNetwork.setBounds(590, 200, 230, 50);

        btnManageEnterprise.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEnterprise);
        btnManageEnterprise.setBounds(590, 290, 230, 50);

        btnManageAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnManageAdmin.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin);
        btnManageAdmin.setBounds(570, 380, 280, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin11n.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 2059, 1368);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
