package com.millky.demo.security.one;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // It is almost the same as the default.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
            .authorizeRequests()
                .anyRequest().authenticated()
            .and()
                .formLogin();
        // @formatter:on
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // @formatter:off
        auth
            .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER");
        // @formatter:on
    }

    // If you do not extend WebSecurityConfigurerAdapter ...
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        // @formatter:off
//        auth
//            .inMemoryAuthentication()
//                .withUser("user").password("{noop}password").roles("USER");
//        // @formatter:on
//    }
}
