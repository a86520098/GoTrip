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



@Configuration
@EnableWebSecurity //Enable springFliterChain
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig{
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.antMatchers("/login","/","/resources/**","/css/**","/fonts/**","/images/**","/js/**","/vendors/**","/register").permitAll() //resource資料夾靜態資料可匿名存取
//		.antMatchers("/login") //對象為所有網址
		.antMatchers("/admin","/vendors/**").hasRole("ADMIN") //admin才可以訪問後台
		.antMatchers("/frontend/user/**").hasRole("USER") //user只能訪問前台user畫面
		.antMatchers("/frontend/**").hasAnyRole("DEALER","ADMIN") //dealer可以訪問前台所有畫面
		.anyRequest().authenticated() //存取必須通過驗證
	.and()
	.formLogin() 
		.loginProcessingUrl("/login")
		.loginPage("/login") //則產生自訂login表單
		.failureForwardUrl("/fail") //如果認證失敗，則導往/login並帶參數error
//		.defaultSuccessUrl("/backend/index") //認證通過後導往的Url
		.successForwardUrl("/frontend/index")
		.permitAll()
	.and()
	.logout()
		.logoutSuccessUrl("/logout") //
	    .permitAll()
	.and()
	.userDetailsService(userDetailsService)
	.csrf().disable() //關閉csrf防護
	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS); 
	
	return http.build();
		

		
//		http.authorizeRequests()
//			.antMatchers("/resources/**").permitAll() //resource資料夾靜態資料可匿名存取
//			.antMatchers("/login") //對象為所有網址
////			.antMatchers("/backend/index").hasRole("ADMIN") //admin才可以訪問後台
////			.antMatchers("/frontend/user/**").hasRole("USER") //user只能訪問前台user畫面
////			.antMatchers("/frontend/**").hasAnyRole("DEALER","ADMIN") //dealer可以訪問前台所有畫面
//			.authenticated() //存取必須通過驗證
//		.and()
//		.formLogin() 
//			.loginProcessingUrl("/login")
//			.loginPage("/login") //則產生自訂login表單
//			.failureForwardUrl("/fail") //如果認證失敗，則導往/login並帶參數error
////			.defaultSuccessUrl("/backend/index") //認證通過後導往的Url
//			.successForwardUrl("/")
//			.permitAll()
//		.and()
//		.logout()
//			.logoutSuccessUrl("/login?logout") //
//		    .permitAll()
//		.and()
//		.userDetailsService(userDetailsService)
//		.csrf().disable() //關閉csrf防護
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS); 
//		
//		return http.build();
	}
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() throws Exception{
		return (web) -> web.ignoring().antMatchers("/");
	}

}