package factory;

import bean.Book;
import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanTest implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        return new Book(1, "FactoryBean", 12.2);
    }

    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

