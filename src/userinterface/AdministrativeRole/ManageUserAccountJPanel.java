/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Employee.Employee;
import Business.Organization.ChildOrganization;
import Business.Organization.Organization;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.Role.Role;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem ecosystem;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.ecosystem = ecosystem;

        populateOrganizationComboBox();
        
        populateData();
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmpList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        createUserJButton.setBackground(new java.awt.Color(0, 0, 0));
        createUserJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton);
        createUserJButton.setBounds(860, 590, 110, 40);
        add(nameJTextField);
        nameJTextField.setBounds(940, 490, 190, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1);
        jLabel1.setBounds(810, 490, 120, 30);

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(790, 210, 375, 130);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2);
        jLabel2.setBounds(810, 530, 110, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3);
        jLabel3.setBounds(810, 410, 110, 30);

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox);
        employeeJComboBox.setBounds(940, 410, 190, 30);

        backjButton1.setBackground(new java.awt.Color(0, 0, 0));
        backjButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(40, 30, 110, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5);
        jLabel5.setBounds(810, 370, 130, 30);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(940, 370, 190, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4);
        jLabel4.setBounds(810, 456, 80, 24);

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox);
        roleJComboBox.setBounds(940, 450, 190, 30);

        passwordJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordJTextField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                passwordJTextFieldComponentAdded(evt);
            }
        });
        add(passwordJTextField);
        passwordJTextField.setBounds(940, 530, 190, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage User Account");
        add(jLabel6);
        jLabel6.setBounds(720, 30, 480, 60);

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(990, 590, 110, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/org2 - Copy.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1916, 1211);
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String name = nameJTextField.getText();
        String pass = passwordJTextField.getText();
        if (name.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No field should be blank");
            } else {
        String userName = nameJTextField.getText();
        char[] passwordCharArray = passwordJTextField.getPassword();
        String password = String.valueOf(passwordCharArray);
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        if (employee == null) {
            JOptionPane.showMessageDialog(null, "You cannot add user account as employee combo box is empty");
        } else if (ecosystem.checkIfUsernameIsUnique(userName)) {
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        JOptionPane.showMessageDialog(null, "User created Succesfully");
        } else {
            JOptionPane.showMessageDialog(null, "Username should be unique");

        }
      
        populateData();
        }
        nameJTextField.setText("");
        passwordJTextField.setText("");
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
        if (organization instanceof ChildOrganization){
            nameJTextField.setEnabled(false);
            passwordJTextField.setEnabled(false);
        }
        else{
            nameJTextField.setEnabled(true);
            passwordJTextField.setEnabled(true);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void passwordJTextFieldComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_passwordJTextFieldComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJTextFieldComponentAdded

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select the row!!!");
            return;
        }

        String uname = userJTable.getValueAt(selectedRow, 0).toString();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {  
                if (ua.getUname() == uname) {
                    organization.getUserAccountDirectory().deleteUserAccount(ua);
                    break;
                }
            }
        populateData();
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
