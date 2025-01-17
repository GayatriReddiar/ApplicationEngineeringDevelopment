/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import Business.Network.Network;
import java.awt.Component;
import Business.Employee.Employee;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reddy
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel container;
    private EcoSystem ecosystem;
    public ManageEnterpriseAdminJPanel(JPanel container, EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;

        populateTable();
        populateNtwkComboBox();
    }

    //to get all networks in combobox
    private void populateNtwkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    //To populate table
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUname();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(680, 250, 523, 95);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1);
        jLabel1.setBounds(730, 410, 140, 30);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(920, 410, 210, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Username:");
        add(jLabel2);
        jLabel2.setBounds(730, 510, 150, 30);
        add(usernameJTextField);
        usernameJTextField.setBounds(920, 510, 210, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Enterprise:");
        add(jLabel3);
        jLabel3.setBounds(730, 460, 150, 36);

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(920, 460, 210, 30);

        submitJButton.setBackground(new java.awt.Color(0, 0, 0));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("ADD");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(800, 670, 110, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4);
        jLabel4.setBounds(730, 560, 140, 30);
        add(nameJTextField);
        nameJTextField.setBounds(920, 610, 210, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("Name:");
        add(jLabel5);
        jLabel5.setBounds(730, 610, 110, 30);
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(920, 560, 210, 30);

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(30, 50, 110, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel6.setText("Manage Enterprise Admin ");
        add(jLabel6);
        jLabel6.setBounds(720, 100, 460, 50);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(940, 670, 120, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin11n.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 2059, 1368);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String user = usernameJTextField.getText();
        String pass = String.valueOf(passwordJPasswordField.getPassword());

        String name = nameJTextField.getText();

        if (name.isEmpty() || pass.isEmpty() || user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields Cannot be blank!!!!");
        } else {
            try {
                Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

                String uName = usernameJTextField.getText();
                String pword = String.valueOf(passwordJPasswordField.getPassword());

                Employee employee = enterprise.getEmployeeDirectory().createEmp(name, 1);
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.NGO) {
                    if (ecosystem.checkIfUsernameIsUnique(uName)) {
                        UserAccount acc = enterprise.getUserAccountDirectory().createUserAccount(uName, pword, employee, new AdminRole());
                    } else {
                        JOptionPane.showMessageDialog(null, "Username already exist");
                    }

                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HealthCare) {
                    if (ecosystem.checkIfUsernameIsUnique(uName)) {
                        UserAccount acc = enterprise.getUserAccountDirectory().createUserAccount(uName, pword, employee, new AdminRole());
                    } else {
                        JOptionPane.showMessageDialog(null, "Username already exist");
                    }
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.StudentCommunityBuilder) {
                    if (ecosystem.checkIfUsernameIsUnique(uName)) {
                        UserAccount acc = enterprise.getUserAccountDirectory().createUserAccount(uName, pword, employee, new AdminRole());
                    } else {
                        JOptionPane.showMessageDialog(null, "Username already exist");
                    }
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Agencies) {
                    if (ecosystem.checkIfUsernameIsUnique(uName)) {
                        UserAccount acc = enterprise.getUserAccountDirectory().createUserAccount(uName, pword, employee, new AdminRole());
                    } else {
                        JOptionPane.showMessageDialog(null, "Usename already exist");
                    }
                }

                populateTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Something is wrong! You dont have an enterprise it seems");
            }
        }

        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        nameJTextField.setText("");

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaJPanel sysAdminwjp = (SysAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select the row!!!");
            return;
        }
        
        String uname = enterpriseJTable.getValueAt(selectedRow, 2).toString();
        
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                  
                    if(userAccount.getUname()== uname)
                    {
                    enterprise.getUserAccountDirectory().deleteUserAccount(userAccount);
                    break;
                    }
                }
            }
        }
        
        populateTable();
   
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
