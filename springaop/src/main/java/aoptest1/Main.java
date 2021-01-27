package aoptest1;

import aoptest1.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Cal cal = ctx.getBean(Cal.class);
        cal.add(1, 0);
        cal.div(1, 0);
    }
}
