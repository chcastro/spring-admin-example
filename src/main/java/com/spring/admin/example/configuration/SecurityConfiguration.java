package com.spring.admin.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration()
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.formLogin().loginPage("/login").permitAll();
    http.logout().logoutUrl("/logout").permitAll();
    http.csrf().ignoringAntMatchers("/actuator/**", "/instances/**", "/logout");
    http.authorizeRequests()
        .antMatchers("/**/*.css", "/assets/**", "/third-party/**", "/logout", "/login")
        .permitAll();
    http.authorizeRequests().anyRequest().authenticated();
    http.httpBasic(); // Activate Http basic Auth for the server
  }
}
