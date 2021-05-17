/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCenterRegistrationSystem01.business.concretes;

import shoppingCenterRegistrationSystem01.business.abstracts.EmailVerificationService;

/**
 *
 * @author Мухаммед
 */
public class EmailVerificationManager implements EmailVerificationService {

    @Override
    public void send(String adress, String message) {
        System.out.println(message);
    }

}
