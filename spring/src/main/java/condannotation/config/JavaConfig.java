package condannotation.config;

import condannotation.LinuxShowCmd;
import condannotation.ShowCmd;
import condannotation.WinShowCmd;
import condannotation.condition.LinCondition;
import condannotation.condition.WinCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("showCmd")
    /**条件注解match方法返回true是生效，定义的bean生效*/
    @Conditional(WinCondition.class)
    ShowCmd winCmd() {
        return new WinShowCmd();
    }

    @Bean("showCmd")
    @Conditional(LinCondition.class)
    ShowCmd linCmd() {
        return new LinuxShowCmd();
    }
}
