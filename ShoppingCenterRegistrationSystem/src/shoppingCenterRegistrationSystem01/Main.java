package shoppingCenterRegistrationSystem01;

import shoppingCenterRegistrationSystem01.business.concretes.CostumerCheckManagerWithInfo;
import shoppingCenterRegistrationSystem01.business.concretes.CostumerRregistrationSystemWithEmail;
import shoppingCenterRegistrationSystem01.business.concretes.EmailVerificationManager;
import shoppingCenterRegistrationSystem01.entities.concretes.Costumer;

public class Main {

    public static void main(String[] args) {
        Costumer costumer = new Costumer("Mahammad", "Abdullayev", "admin1233", "mhmmdabdullayev6@mail.com");

        CostumerRregistrationSystemWithEmail crs = new CostumerRregistrationSystemWithEmail(new CostumerCheckManagerWithInfo(), costumer,new EmailVerificationManager());
        crs.register();
    }

}
