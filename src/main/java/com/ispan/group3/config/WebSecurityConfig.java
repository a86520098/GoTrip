//package com.ispan.group3.config;
//
//import com.ispan.group3.repository.User;
//import com.ispan.group3.repository.UserRepository;
//import com.ispan.group3.security.SecurityUser;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Configuration
//@EnableWebSecurity(debug = true)
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
////    private final RedisTemplate redisTemplate;
//	private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);
//
//	@Override
//    protected void configure(HttpSecurity http) throws Exception { //配置策略
//        http.csrf().disable();
//        http.authorizeRequests().
//                antMatchers("/static/**").permitAll().anyRequest().authenticated().
//                and().formLogin().loginPage("/login").permitAll().successHandler(loginSuccessHandler()).
//                and().logout().permitAll().invalidateHttpSession(true).deleteCookies("JSESSIONID").logoutSuccessHandler(logoutSuccessHandler()).
//                and().rememberMe().
//                and().sessionManagement().maximumSessions(10).expiredUrl("/login");
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//        auth.eraseCredentials(false);
//    }
//
//    @Bean
//    public TokenBasedRememberMeServices tokenBasedRememberMeServices() {
//        return new TokenBasedRememberMeServices("springRocks", userDetailsService());
//    }
//
//    //密碼加密
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(4);
//    }
//
//
//    //登出處理
//    @Bean
//    public LogoutSuccessHandler logoutSuccessHandler() {
//        return new LogoutSuccessHandler() {
//            @Override
//            public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//                try {
//                    com.ispan.group3.security.SecurityUser user = (com.ispan.group3.security.SecurityUser) authentication.getPrincipal();
//                    logger.info("USER : {} LOGOUT SUCCESS ! ", user.getUsername());
//                } catch (Exception e) {
//                    logger.error("printStackTrace", e);
//                }
//                httpServletResponse.sendRedirect("/login");
//            }
//        };
//    }
//
//    //登入處理
//    @Bean
//    public SavedRequestAwareAuthenticationSuccessHandler loginSuccessHandler() {
//        return new SavedRequestAwareAuthenticationSuccessHandler() {
//            @Override
//            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                User userDetails = (User) authentication.getPrincipal();
//                logger.info("Email : " + userDetails.getEmail() + " LOGIN SUCCESS !  ");
//                super.onAuthenticationSuccess(request, response, authentication);
//            }
//        };
//    }
//
//
//    //用戶登入實作
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() { 
//        return new UserDetailsService() {
//            @Autowired
//            private UserRepository userRepository;
//
//            @Override
//            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//                User user = userRepository.getByEmail(s);
//                if (user == null) throw new UsernameNotFoundException("Username " + s + " not found");
//                return new SecurityUser(user);
//            }
//        };
//    }
//	
//	
//	
//	
//	
//	
//	
////    @Autowired
////    private JwtTokenUtil jwtTokenUtil;
////    @Autowired
////    public WebSecurityConfig(RedisTemplate redisTemplate) {
////        this.redisTemplate = redisTemplate;
////    }
////
////    // 設置 HTTP 驗證規則
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.cors().and().csrf().disable().authorizeRequests()
////                .antMatchers("/public/**", "/html/**", "/static/**", "/vendor/**", "/**/*.js", "/fonts/**", "/**/*.css", "/index.html", "/*.js", "/api/static/files/**").permitAll()
////                .antMatchers(HttpMethod.POST, "/api/auth/**").denyAll()
////                .antMatchers("/api/qyt/report/**").permitAll()
////                .antMatchers("/api/qyt/notice/**").permitAll()
////                .antMatchers("/api/qyt/attach/**").permitAll()
////                .antMatchers("/api/qyt/job-test/**").permitAll()
////                .anyRequest().authenticated() // 所有請求需要身份認證
////                .and().headers().frameOptions().disable()// 禁用x-frame 、
////                .and()
////                .addFilter(new JwtTokenFilter(authenticationManager(), jwtTokenUtil)); //自定義攔截器
////    }
//}