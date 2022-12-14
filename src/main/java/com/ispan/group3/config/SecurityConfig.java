package com.ispan.group3.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.ispan.group3.enums.MyAccessDeniedHandler;
import com.ispan.group3.service.impl.UserDetailsServiceImpl;



@Configuration
@EnableWebSecurity //Enable springFliterChain
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig{
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private MyAccessDeniedHandler myAccessDeniedHandler;
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.antMatchers("/login","/","/index","/resources/**","/css/**","/fonts/**","/images/**","/js/**","/vendors/**","/vendor/**","/register","/CheckEmail","/logout","/data/**","/ticket/**","/findHotelList/**","/cars/**","/api/**","/use/**","/showCartItems","/verify").permitAll() //resource????????????????????????????????????
//		.antMatchers("/login") //?????????????????????
		.antMatchers("/admin","/vendors/**","/vendor/**").hasRole("ADMIN") //admin?????????????????????
		.antMatchers("/vendors/**","/vendor/**").hasRole("DEALER") //admin?????????????????????
		.antMatchers("/userdetails","/userdetals/update").hasAnyRole("USER","DEALER") //user??????????????????user??????
		.antMatchers("/vendors/**","/userdetails","/userdetals/update","/vendor/**").hasAnyRole("DEALER","ADMIN") //dealer??????????????????????????????
		.anyRequest().authenticated() //????????????????????????
	.and()
	.formLogin() 
		.loginProcessingUrl("/login")
		.loginPage("/login") //???????????????login??????
		.failureForwardUrl("/fail") //??????????????????????????????/login????????????error
//		.defaultSuccessUrl("/backend/index") //????????????????????????Url
		.successForwardUrl("/frontend/index")
		.permitAll()
	.and()
	.logout()
		.deleteCookies("JSESSIONID")
		.logoutUrl("/logout")
        .logoutSuccessUrl("/")
//		.logoutSuccessUrl("/logout") //
	    .permitAll()
	.and()
		.exceptionHandling()
//		.accessDeniedPage("/??????????????????")
		.accessDeniedHandler(myAccessDeniedHandler)
	.and()
		.rememberMe()
		.userDetailsService(userDetailsService)
		.tokenValiditySeconds(60*60*24*5) //5???
	.and()
	.userDetailsService(userDetailsService)
	.csrf().disable() //??????csrf??????
	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS); 
	
	return http.build();
	}
	
//	@Bean
//	public WebSecurityCustomizer webSecurityCustomizer() throws Exception{
//		return (web) -> web.ignoring().antMatchers("/");
//	}

}