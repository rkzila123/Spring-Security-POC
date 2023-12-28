package com.rohit.security.config;
/*package com.javatechie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfigOld extends WebSecurityConfigurerAdapter{
	
	
	
	@Override
	//Authentication
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
				
		auth.inMemoryAuthentication().withUser("Rohit")
		.password(bcryptPasswordEncoder().encode("Pwd1"))
		.roles("USER");
		
		auth.inMemoryAuthentication().withUser("Ankit")
		.password(bcryptPasswordEncoder().encode("Pwd2"))
		.roles("ADMIN");
	}
	
	
	
	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
		
	
	@Bean(name =BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}
	
	
	@Override
	//Authorization
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
		.authorizeRequests().antMatchers("/products/welcome","/products/new").permitAll()
		.and().authorizeRequests().antMatchers("/products/**").authenticated()
		.and().formLogin().and().build();	
		
	}

}
*/
