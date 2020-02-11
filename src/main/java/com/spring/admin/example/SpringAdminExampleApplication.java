package com.spring.admin.example;

import com.spring.admin.example.configuration.SecurityConfiguration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableAdminServer
@Import({SecurityConfiguration.class})
public class SpringAdminExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAdminExampleApplication.class, args);
    }
}