package txtest3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import txtest3.service.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotationtx3.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.transfer();
    }
}
