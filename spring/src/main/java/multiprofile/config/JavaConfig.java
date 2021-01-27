package multiprofile.config;

import multiprofile.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfig {
    @Bean
    @Profile("dev")
    DataSource devDataSource() {
        return new DataSource("http://127.0.0.1/", "root", "123456");
    }

    @Bean
    @Profile("pro")
    DataSource proDataSource() {
        return new DataSource("http://127.0.0.2/", "root", "123456");
    }
}
