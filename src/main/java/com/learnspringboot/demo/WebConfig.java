package com.learnspringboot.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requiresChannel()
                .requestMatchers(httpServletRequest -> httpServletRequest.getHeader("X-Forwarded-Proto")!=null)
                .requiresSecure();
        super.configure(http);
    }
}
