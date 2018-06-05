package com.millky.demo.security.one;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@SpringBootApplication
public class SpringbootSecurityDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityDemo1Application.class, args);
    }

    @RequestMapping("/")
    public Principal viewPrincipal(Principal principal) {

        log.warn("principal.getName()={}", principal.getName());
        log.warn("principal={}", principal);

        return principal;
    }
}
