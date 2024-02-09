package com.example.samuraitravel.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
		     .authorizeHttpRequests((requests) -> requests
		    		 .requestMatchers("/css/**", "/images/**", "/js/**", "/storage/**", "/", "/signup/**","/houses","/houses/{id}","/stripe/webhook").permitAll()
		    		 .requestMatchers("/admin/**").hasRole("ADMIN")
		    		 .anyRequest().authenticated()
		    		 )
		     .formLogin((form) -> form
		    		 .loginPage("/login")
		    		 .loginProcessingUrl("/login")
		    		 .defaultSuccessUrl("/?loggedIn")
		    		 .failureUrl("/login?error")
		    		 .permitAll()
		    		 )
		     .logout((logout) -> logout
		    		 .logoutSuccessUrl("/?loggedOut")
		    		 .permitAll()
		    		 )
		     .csrf().ignoringRequestMatchers("/stripe/webhook");
		     return http.build();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
