package test;

import bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    /** 复杂属性的注入*/
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User user = ctx.getBean(User.class);
        System.out.println(user);

    }
}
