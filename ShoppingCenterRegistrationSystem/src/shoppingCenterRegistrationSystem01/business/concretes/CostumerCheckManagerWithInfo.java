package shoppingCenterRegistrationSystem01.business.concretes;

import shoppingCenterRegistrationSystem01.entities.concretes.User;
import static shoppingCenterRegistrationSystem01.business.concretes.Checker.*;
import shoppingCenterRegistrationSystem01.business.abstracts.CostumerCheckManagerService;

public class CostumerCheckManagerWithInfo implements CostumerCheckManagerService {

    @Override
    public void check(User user) {

        user.getMail();

        if (checkName(user.getFisrtName())) {
            System.out.println("Firstname must be longer than two characters");
            System.exit(1);

        } else if (checkName(user.getLastName())) {
            System.out.println("Lastname must be longer than two characters");
            System.exit(1);
        } else if (checkPassWord(user.getPassWord())) {
            System.out.println("Password must be longer than six characters");
            System.exit(1);
        } else if (checkEmail(user.getMail())) {
            System.out.println("Invalid mail");
            System.exit(1);
        }
    }

}
