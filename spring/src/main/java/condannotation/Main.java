package condannotation;

import condannotation.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd bean = (ShowCmd)ctx.getBean("showCmd");
        System.out.println(bean.showCmd());
    }

}
