package com.example.itassetmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF only for H2 console (safe in dev)
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**")
                )

                // PERMIT THESE URLs WITHOUT LOGIN
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",                     // ← landing page
                                "/home",
                                "/index",
                                "/auth/**",              // login, logout
                                "/register",             // registration page
                                "/css/**",
                                "/js/**",
                                "/images/**"
                        ).permitAll()
                        .anyRequest().authenticated()  // everything else needs login
                )

                // FORM LOGIN CONFIG
                .formLogin(form -> form
                        .loginPage("/auth/login")                    // your login page
                        .loginProcessingUrl("/auth/login")
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .successHandler((request, response, authentication) -> {
                            // Save username in session (for your dashboards)
                            request.getSession().setAttribute("username", authentication.getName());

                            String role = authentication.getAuthorities().iterator().next().getAuthority();

                            if ("ROLE_ADMIN".equals(role)) {
                                response.sendRedirect("/admin/dashboard");
                            } else {
                                response.sendRedirect("/employee/dashboard");
                            }
                        })
                        .failureUrl("/auth/login?error=true")
                        .permitAll()
                )

                // LOGOUT → GO BACK TO LANDING PAGE
                .logout(logout -> logout
                        .logoutUrl("/auth/logout")
                        .logoutSuccessUrl("/")                      // ← BACK TO index.html
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll()
                )

                // For H2 console in dev
                .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()));

        return http.build();
    }
}