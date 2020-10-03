package src.ShiWu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    AccountImp account;

    @Transactional
    public void accountChange(){
        account.reduceMoney();
       int y= 1/0;
        account.addMoney();
    }
}
