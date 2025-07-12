package com.example.jwtauthservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for testing
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/authenticate").permitAll() // Allow access to /authenticate
                        .anyRequest().authenticated() // All other requests need authentication
                )
                .httpBasic(); // Enable Basic Auth

        return http.build();
    }
}


