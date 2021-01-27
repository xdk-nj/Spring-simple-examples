package aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SayHello implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String sayHello(String name) {
        boolean b = applicationContext.containsBean(name);
        String s = b == true ? "exist " + name : "do not exist " + name;
        return s;
    }
}
