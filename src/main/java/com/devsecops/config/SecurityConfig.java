package com.devsecops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // For demo purposes only
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/", "/api/health", "/api/info", "/actuator/health").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form.disable()) // Disable form login for API
            .httpBasic(httpBasic -> {}); // Enable basic auth for API testing
        
        return http.build();
    }
}