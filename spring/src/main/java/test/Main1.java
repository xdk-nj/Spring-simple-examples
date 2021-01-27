package test;

import bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**简单属性的注入测试*/
public class Main1 {

    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext1.xml");
        Book book = (Book)ctx.getBean("book");
        Book bean = (Book)ctx.getBean("bookFromFactoryBeanTest");
        System.out.println(book);
        System.out.println(bean);
    }
}
