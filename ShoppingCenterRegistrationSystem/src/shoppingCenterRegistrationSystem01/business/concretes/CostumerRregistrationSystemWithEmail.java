package shoppingCenterRegistrationSystem01.business.concretes;

import shoppingCenterRegistrationSystem01.business.abstracts.CheckManagerService;
import shoppingCenterRegistrationSystem01.business.abstracts.CostumerRegistrationBase;
import shoppingCenterRegistrationSystem01.business.abstracts.VerificationService;
import shoppingCenterRegistrationSystem01.entities.concretes.Costumer;

public class CostumerRregistrationSystemWithEmail extends CostumerRegistrationBase {

    public CheckManagerService checkManagerService;
    public Costumer costumer;
    public VerificationService verificationService;

    public CostumerRregistrationSystemWithEmail(CheckManagerService checkManagerService, Costumer costumer, VerificationService verificationService) {
        this.checkManagerService = checkManagerService;
        this.costumer = costumer;
        this.verificationService = verificationService;
    }

    @Override
    public void register() {
        checkManagerService.check(costumer);
        System.out.println("Message sending to " + costumer.getMail());
        verificationService.send(costumer.getMail(), "Successfully registered");

    }

}
