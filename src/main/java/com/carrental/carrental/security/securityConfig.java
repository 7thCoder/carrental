package com.carrental.carrental.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.carrental.carrental.Repository.userRepository;
import com.carrental.carrental.model.user;

@Configuration
public class securityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(userRepository userRepo){
        return username ->{
            user user = userRepo.findByUsername(username);
            if(user != null) return user;

            throw new UsernameNotFoundException("User: " + username + "not found");
        };
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http
		.authorizeHttpRequests((authorize) -> authorize
			.requestMatchers("/addcar").hasRole("USER")
			.requestMatchers("/","/**").permitAll()

		)
       .formLogin(formLogin ->formLogin.loginPage("/login").permitAll()
        .defaultSuccessUrl("/cars")
       )
        .build();
    }
    
}
