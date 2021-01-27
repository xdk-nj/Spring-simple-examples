package multiprofile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**xml版多环境切换*/
public class Main2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("pro");
        ctx.setConfigLocation("multiprofile.xml");
        ctx.refresh();
        DataSource ds = (DataSource)ctx.getBean("dataSource");
        System.out.println(ds);
    }
}
