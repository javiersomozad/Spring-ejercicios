package es.jsomoza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	// configuracion 1
	/*
	@Bean
	public SecurityFilterChain filterChain (HttpSecurity httpSecurity) throws Exception {
		
		return httpSecurity
				.authorizeHttpRequests()
					.requestMatchers("/v1/index2").permitAll()
					.anyRequest().authenticated()
				.and()
					.formLogin().permitAll()
				.and()
				.build();
	}
*/
	
	// Configuracion 2
	@Bean
	public SecurityFilterChain filterChain (HttpSecurity httpSecurity) throws Exception {
		return httpSecurity
				.authorizeHttpRequests(auth -> {
					auth.requestMatchers("/v1/index2").permitAll();
					auth.anyRequest().authenticated();
				})
				.formLogin()
					.successHandler(succesHandler())
					.permitAll()
				.and()
				.sessionManagement()
					.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
					.invalidSessionUrl("/login")
					.maximumSessions(1)
						.expiredUrl("/Login")
						.sessionRegistry(sessionRegistry())
					.and()
					.sessionFixation()
						.migrateSession()
				.and()
				.build();
	}
	
	public AuthenticationSuccessHandler succesHandler() {
		return((request, response, authentication) -> {
			response.sendRedirect("/v1/sesion");
		});
	}
	
	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
		
	}
}
