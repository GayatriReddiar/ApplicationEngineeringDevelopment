/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
//import Business.Role.ChildRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author reddy
 */
public class ChildOrganization extends Organization{

    public ChildOrganization() {
        super(Type.Child.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
    
}
