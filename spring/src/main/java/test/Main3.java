package test;

import bean.Book;
import bean.User;
import config.JavaConfig;
import config.UserServiceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**使用Java配置代替配置文件*/
public class Main3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Book book1 = ctx.getBean(Book.class);
        Book book2 = (Book)ctx.getBean("book");
        System.out.println(book2);


        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(UserServiceConfig.class);
        UserService userService = (UserService)ctx2.getBean("userService");
        System.out.println(userService.getAllBooks());


        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService service = (UserService)ctx3.getBean("userService");
        System.out.println(service.getAllBooks());
    }
}
