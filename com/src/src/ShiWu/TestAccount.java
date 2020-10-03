package src.ShiWu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void testAccount(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");

        AccountService account= (AccountService) context.getBean("accountService",AccountService.class);

        account.accountChange();
    }
}
