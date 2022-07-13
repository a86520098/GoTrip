package com.ispan.group3.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ispan.group3.repository.UserAccount;
import com.ispan.group3.repository.UserAccountVO;
import com.ispan.group3.service.UserAccountService;



@Controller
public class UserAccountController {

	@Autowired
	private UserAccountService userAccountService;
	
	@GetMapping({"/login"})
	public String login(
			@ModelAttribute UserAccount userAccount,
			@ModelAttribute(value = "MESSAGE") String message) {
		
		return "frontend/login";
	}
	
	@PostMapping("/login")
	public String doLogin(
			@ModelAttribute UserAccount userAccount,
			HttpSession session, 
			RedirectAttributes redirectAttributes) {
		
		UserAccountVO userAccountVO = userAccountService.login(userAccount);
		if(userAccountVO == null) {
			String message = userAccountVO == null ? "帳號或密碼錯誤" : "";	
			redirectAttributes.addFlashAttribute("MESSAGE", message);
			return "redirect:login";
		}
		session.setAttribute("user", userAccountVO);	
		return "frontend/index";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute UserAccountVO memberAccountVO) {
		
		return "frontend/register";
	}
	
	@PostMapping("/register")
	public String doRegister(
			@ModelAttribute UserAccountVO userAccountVO,
			RedirectAttributes redirectAttributes) {

		Optional<String> optional = userAccountService.register(userAccountVO);
		String message = optional.orElse("註冊成功");
		redirectAttributes.addFlashAttribute("MESSAGE", message);
		return "redirect:login";
	}

}
