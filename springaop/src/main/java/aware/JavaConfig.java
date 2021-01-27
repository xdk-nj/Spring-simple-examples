package aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("aware")
    public String awareTest() {
        return "awareTest";
    }

    @Bean
    SayHello sayHello() {
        return new SayHello();
    }
}
