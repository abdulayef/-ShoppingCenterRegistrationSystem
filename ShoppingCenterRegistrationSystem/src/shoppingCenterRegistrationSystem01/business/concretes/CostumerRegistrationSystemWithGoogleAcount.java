/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCenterRegistrationSystem01.business.concretes;

import shoppingCenterRegistrationSystem01.business.abstracts.CostumerRegistrationBase;

/**
 *
 * @author Мухаммед
 */
public class CostumerRegistrationSystemWithGoogleAcount extends CostumerRegistrationBase {

    @Override
    public void register() {
        System.out.println("Registered with google acount");
    }

} 
