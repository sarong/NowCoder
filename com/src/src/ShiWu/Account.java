package src.ShiWu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Account implements AccountImp {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
   public void reduceMoney(){
       String sql="update account set money=money-? where name=?";
       jdbcTemplate.update(sql,"100","Lucy");
   }
    @Override
   public void addMoney(){
       String sql="update account set money=money+? where name=?";
       jdbcTemplate.update(sql,"100","Brucy");
   }
}
