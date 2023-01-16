package com.neo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.neo.service.UserInfoDetailsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Config {

	
	@Bean
	public UserDetailsService userDetailsService() {

		/*
		 * UserDetails admin = User.withUsername("kailas")
		 * .password(encoder.encode("kailas123")) .roles("ADMIN").build();
		 * 
		 * UserDetails user = User.withUsername("vishal")
		 * .password(encoder.encode("vishal123")).roles("USER") .build();
		 */
		
		return new UserInfoDetailsService();

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	return	http.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/api/all","/api/create").permitAll()
		.and()
		.authorizeHttpRequests()
		.requestMatchers("/api/**").authenticated()
		.and()
		.formLogin()
		.and()
		.build();
		
	}
	
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}

}
