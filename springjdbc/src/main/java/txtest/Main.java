package txtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import txtest.config.JdbcConfig;
import txtest.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.transfer();
    }
}
