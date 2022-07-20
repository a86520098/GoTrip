package com.ispan.group3.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import com.ispan.group3.repository.UserData;
import com.ispan.group3.service.UserService;

@Controller
@RequestMapping(path = "user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

//	@GetMapping(path = "/membersmain.controller")
//	public String processMainAction(Model m) {
//		MemberBean mem = new MemberBean();
//		m.addAttribute("members", mem);
//		return "index";
//	}
	
	//顯示所有會員資料
	@GetMapping("/list")
	public String showAllUsers(Model m) {
		List<UserData> Users = userService.getAllUsers();
		m.addAttribute("Users", Users);
		return "backend/user-list";
	}
	
	//導向新增畫面
	@GetMapping(path = "/addUser")
	public String toAdd() {
		return "backend/user-insert";
	}
	
	//確定新增、修改
	@PostMapping(path = "/SaveUser")
	public String add(UserData mb) {
		   
		return "redirect:/user/list";
	}
	
	//導向更新畫面
	@GetMapping(path = "/user/{user_id}")
	public String toUpdate(@PathVariable("user_id") Integer user_id, Model m) {
		UserData user = userService.getUser(user_id);
		m.addAttribute("User", user);
		return "backend/user-edit";
	}
	
	//刪除資料
	@PostMapping(path = "/userDel/{user_id}")
	public String delete(@PathVariable("user_id") Integer user_id, Model m, SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		userService.deleteUser(user_id);
		return "redirect:/user/list";
	}
	
	//檢查Email是否已存在
	@ResponseBody
	@PostMapping(value = "/CheckEmail", produces = "application/json; charset = UTF-8")
	public boolean checkUser(@RequestParam String username) {
		UserData mem = userService.findByUsername(username);
		if (mem == null) {
			return true;
		}
		return false;
	}

}
