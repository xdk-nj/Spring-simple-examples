package config;

import bean.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean("book")
    @Scope("prototype") //多实例
    Book getBook() {
        return new Book(1, "JavaConfig", 12.1);
    }
}
