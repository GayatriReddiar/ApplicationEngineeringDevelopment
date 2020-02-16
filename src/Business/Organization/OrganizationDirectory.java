/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Agency.getValue())){
            organization = new AgencyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HeadDoctor.getValue())){
            organization = new HeadDoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOAdmin.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Child.getValue())){
            organization = new ChildOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.StudentCommunity.getValue())){
            organization = new StudentCommunityOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Student.getValue())){
            organization = new StudentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization organization){
         organizationList.remove(organization);
    }
}