/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.AFASystem;
import Business.UserAccount.UserAccount;

import UserInterface.DeliveryRole.DeliveryWorkAreaJPanel;



import javax.swing.JPanel;

/**
 *
 * @author likhithng
 */
public class DeliveryRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AFASystem business) {
        return new DeliveryWorkAreaJPanel(userProcessContainer,account, organization, enterprise,business); 
    }
    
}
