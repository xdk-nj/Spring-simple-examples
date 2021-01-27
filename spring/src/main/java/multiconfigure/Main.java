package multiconfigure;

import bean.Book;
import multiconfigure.config.MultiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MultiConfig.class);
        System.out.println((Book)ctx.getBean("book"));
    }
}
