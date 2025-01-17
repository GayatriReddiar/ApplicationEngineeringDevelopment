/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount getUserAccount(int id) {
        UserAccount userAccount = new UserAccount();
        for(UserAccount ua : getUserAccountList()){
           if(id == ua.getEmp().getEmpID()) 
               userAccount = ua;
        }
        return userAccount;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUname().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUname(username);
        userAccount.setPassword(password);
        userAccount.setEmp(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        System.out.println(userAccountList);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUname().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount ua) { 
        userAccountList.remove(ua);
    }
}
