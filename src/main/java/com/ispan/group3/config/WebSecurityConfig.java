//package com.ispan.group3.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableWebSecurity//(debug = true)
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    private final RedisTemplate redisTemplate;
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//    @Autowired
//    public WebSecurityConfig(RedisTemplate redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }
//
//    // 設置 HTTP 驗證規則
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable().authorizeRequests()
//                .antMatchers("/public/**", "/html/**", "/static/**", "/vendor/**", "/**/*.js", "/fonts/**", "/**/*.css", "/index.html", "/*.js", "/api/static/files/**").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/auth/**").denyAll()
//                .antMatchers("/api/qyt/report/**").permitAll()
//                .antMatchers("/api/qyt/notice/**").permitAll()
//                .antMatchers("/api/qyt/attach/**").permitAll()
//                .antMatchers("/api/qyt/job-test/**").permitAll()
//                .anyRequest().authenticated() // 所有請求需要身份認證
//                .and().headers().frameOptions().disable()// 禁用x-frame 、
//                .and()
//                .addFilter(new JwtTokenFilter(authenticationManager(), jwtTokenUtil)); //自定義攔截器
//    }
//}