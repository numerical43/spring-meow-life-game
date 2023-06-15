package catholic.meowlife.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"repository", "catholic.meowlife"})
public class ContextConfiguration {
}
