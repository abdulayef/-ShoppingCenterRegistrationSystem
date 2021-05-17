package shoppingCenterRegistrationSystem01.business.concretes;

import shoppingCenterRegistrationSystem01.business.abstracts.CostumerLoginService;

/**
 *
 * @author Мухаммед
 */
public class CostumerLoginManager implements CostumerLoginService {

    @Override
    public void login(String email, String PassWord) {
        //simulasyon
        System.out.println("Logined");
    }

}
