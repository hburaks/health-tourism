package com.allianz.healthtourism.util.security;


import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private static final String[] AUTH_WHITELIST = {
            "/auth/**",
            "/swagger-ui/**",
            "v3/api-docs/**",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            "/v3/api-docs/**",
            "/api/public/**",
            "/api/public/authenticate",
            "/actuator/*",
            "*/register/**",
            "*/login/**",
            "/examination-record"
    };
    private static final String[] USER_AUTH_WHITELIST = {
            "hospital/*/forPatient",
            "doctor/*/forPatient",
            "appointment/save-with-id",
            "patient/**",
            "hotel/city/*",
            "booking",
            "flight/city/**",
            "/plane-ticket",
            "health-care-service/get-all-filter",
    };

    private static final String[] ADMIN_AUTH_WHITELIST = {
            "/**",
            "health-care-service/**"
    };
    private static final String[] DOCTOR_AUTH_WHITELIST = {
            "/examination-record"
    };
    private static final String[] PATIENT_AUTH_WHITELIST = {
            "hospital/*/forPatient",
            "doctor/*/forPatient",
            "appointment/save-with-id",
            "patient/*",
            "hotel/city/*",
            "booking",
            "flight/city/**",
            "/plane-ticket",
            "health-care-service/get-all-filter"
    };
    private final JWTFilter filter;
    private final SecurityService uds;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.csrf().disable().httpBasic().disable().cors().configurationSource(request -> {
                    CorsConfiguration configuration = new CorsConfiguration();
                    configuration.setAllowedOrigins(List.of("*"));
                    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
                    configuration.setAllowedHeaders(List.of("*"));
                    configuration.setExposedHeaders(List.of("Content-Disposition"));
                    return configuration;
                }).and().authorizeHttpRequests()
                .requestMatchers(AUTH_WHITELIST).permitAll()
                .requestMatchers(USER_AUTH_WHITELIST).hasRole("user")
                .requestMatchers(ADMIN_AUTH_WHITELIST).hasRole("admin")
                .requestMatchers(DOCTOR_AUTH_WHITELIST).hasRole("doctor")
                .requestMatchers(PATIENT_AUTH_WHITELIST).hasRole("patient")
                .and()
                .userDetailsService(uds).exceptionHandling().authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized")).and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);


        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }


}
