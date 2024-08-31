package lk.ijse.aad.springwebmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.springwebmvc")
@EnableWebMvc
public class WebAppConfig {
}
