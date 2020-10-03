package src.ShiWu;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountImp {
    public void reduceMoney();
    public void addMoney();
}
