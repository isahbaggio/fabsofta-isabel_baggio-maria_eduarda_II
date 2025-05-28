package br.univille.restocchefmaisa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests((authz) -> authz
                .antMatchers("/", "/index.html", "/static/**", "/api/receitas", "/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            .headers().frameOptions().disable()
            .and()
            .httpBasic();
        return http.build();
    }
}
