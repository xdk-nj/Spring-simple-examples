package txtest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import txtest2.service.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotationtx2.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.transfer();
    }
}
