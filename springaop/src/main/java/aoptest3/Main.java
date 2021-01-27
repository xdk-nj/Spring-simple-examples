package aoptest3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aoptest3.xml");
        Cal cal = ctx.getBean(Cal.class);
        cal.add(1, 2);
        cal.div(1, 0);
    }
}
