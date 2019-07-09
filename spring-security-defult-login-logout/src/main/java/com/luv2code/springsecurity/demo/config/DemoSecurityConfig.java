package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import com.sun.org.apache.xpath.internal.operations.And;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder users=User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(users.username("jemy").password("admin123").roles("ADMIN"));
		auth.inMemoryAuthentication()
		.withUser(users.username("zizo").password("admin123").roles("MANGER"));
		auth.inMemoryAuthentication()
		.withUser(users.username("dina").password("admin123").roles("EMPLOYEE"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().anyRequest().authenticated()
	.and()
	.formLogin()
	.loginPage("/LoginForm") ///
	.loginProcessingUrl("/authenticateTheUser")
	.permitAll()
	.and().logout()
	.permitAll();
	}
	
	

	
}
