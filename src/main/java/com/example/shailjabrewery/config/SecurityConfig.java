package com.example.shailjabrewery.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(requests -> {
            requests
                    .antMatchers("/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs", "/webjars/**", "/api/v1/beer/beerdetails")
                    //.antMatchers("/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        })
                .csrf(csrf -> csrf.disable());
	}
}