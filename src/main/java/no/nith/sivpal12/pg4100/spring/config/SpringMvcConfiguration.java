package no.nith.sivpal12.pg4100.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="no.nith.sivpal12.pg4100")
public class SpringMvcConfiguration extends WebMvcConfigurerAdapter {
}