package multiconfigure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext1.xml") //Java配置中引入xml配置

public class MultiConfig {
}
