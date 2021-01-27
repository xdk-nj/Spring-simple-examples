package multiprofile;

import multiprofile.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**注解版多环境切换*/
public class Main1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("pro");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds);
    }
}
