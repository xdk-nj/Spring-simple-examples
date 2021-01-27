package aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello bean = (SayHello)ctx.getBean("sayHello");
        System.out.println(bean.sayHello("aware"));
    }
}
