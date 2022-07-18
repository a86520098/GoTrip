package com.ispan.group3.controller;

import java.net.http.HttpClient.Redirect;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import com.ispan.group3.context.UserContext;
import com.ispan.group3.repository.RegisterForm;
import com.ispan.group3.repository.UserData;
import com.ispan.group3.repository.UserAccountVO;
import com.ispan.group3.repository.UserRepository;
import com.ispan.group3.service.impl.UserDetailsServiceImpl;




@Controller
public class UserAccountController {

//	@Autowired
//	private UserContext userContext;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDetailsServiceImpl userdetailsServletImpl;
	
//	@Autowired
//	private UserAccountService userAccountService;
	
	@RequestMapping("/frontend/index")
	public String index() {
		return "frontend/index";
	}
	
	@GetMapping({"/admin"})
	public String admin() {
		return "backend/index";
	}
	
	@GetMapping({"/logout"})
	public String logout() {
		return "frontend/index";
	}
	
	@GetMapping({"/login"})
	public String login(){
		
		return "frontend/login";
	}
	
	@GetMapping({"/default"})
	public String rederect() {
		return "frontend/index";
	}
	
	@GetMapping({"/fail"})
	@ResponseBody
	public String loginFailed() {
		return "failed";
	}
//	
//	@PostMapping("/login")
//	public String doLogin(
//			@ModelAttribute UserAccount userAccount,
//			HttpSession session, 
//			RedirectAttributes redirectAttributes) {
//		
//		UserAccountVO userAccountVO = userAccountService.login(userAccount);
//		if(userAccountVO == null) {
//			String message = userAccountVO == null ? "帳號或密碼錯誤" : "";	
//			redirectAttributes.addFlashAttribute("MESSAGE", message);
//			return "redirect:login";
//		}
//		session.setAttribute("user", userAccountVO);	
//		return "frontend/index";
//	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute UserAccountVO memberAccountVO) {
		
		return "frontend/register";
	}
	
	@PostMapping({"/register"})
	public String doRegister( @ModelAttribute RegisterForm registerForm , BindingResult result){
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		if(result.hasErrors()){
			return "registerForm"; //如果有欄位是空白則回到註冊表單網頁
		}
		
		String username=registerForm.getUsername();
		if(userRepository.findByUsername(username)!=null){
			result.rejectValue("email", "errors.register.email", "此信箱已被註冊！");
			return "registerForm";  //如果有相同使用者，則回到註冊表單網頁並顯示錯誤訊息
		}
		UserData user= new UserData();
		user.setUsername(registerForm.getUsername());
		user.setPassword(passwordEncoder.encode(registerForm.getPassword()));
		user.setAuthority("user");

		userRepository.save(user); //新增使用者到資料庫
//		userContext.setCurrentUser(user); //設定使用者為已登入
		return "redirect:/";
	}

//		Optional<String> optional = userAccountService.register(userAccountVO);
//		String message = optional.orElse("註冊成功");
//		redirectAttributes.addFlashAttribute("MESSAGE", message);
//		return "redirect:login";
//	}

}
