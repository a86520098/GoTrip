package com.ispan.group3.controller;

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

import com.ispan.group3.repository.Member;
import com.ispan.group3.service.MemberService;

@Controller
@RequestMapping(path = "members")
public class MemberController {
	
	private MemberService mService;
	
	@Autowired
	public MemberController(MemberService mService) {
		this.mService = mService;
	}

//	@GetMapping(path = "/membersmain.controller")
//	public String processMainAction(Model m) {
//		MemberBean mem = new MemberBean();
//		m.addAttribute("members", mem);
//		return "index";
//	}
	
	//顯示所有會員資料
	@GetMapping("/list")
	public String showAllMembers(Model m) {
		List<Member> Members = mService.getAllMembers();
		m.addAttribute("Members", Members);
		return "backend/member-list";
	}
	
	//導向新增畫面
	@GetMapping(path = "/addMem")
	public String toAdd() {
		return "backend/member-insert";
	}
	
	//確定新增、修改
	@PostMapping(path = "/SaveMem")
	public String add(Member mb) {
		mService.saveOrUpdate(mb);
		return "redirect:/members/list";
	}
	
	//導向更新畫面
	@GetMapping(path = "/mem/{user_id}")
	public String toUpdate(@PathVariable("user_id") Integer user_id, Model m) {
		Member mem = mService.getMember(user_id);
		m.addAttribute("MemberData", mem);
		return "backend/member-edit";
	}
	
	//刪除資料
	@PostMapping(path = "/memDel/{user_id}")
	public String delete(@PathVariable("user_id") Integer user_id, Model m) {
		mService.deleteMember(user_id);
		return "redirect:/members/list";
	}
	
	//檢查Email是否已存在
	@ResponseBody
	@PostMapping(value = "/CheckEmail", produces = "application/json; charset = UTF-8")
	public boolean checkUser(@RequestParam String email) {
		Member mem = mService.getByEmail(email);
		if (mem == null) {
			return true;
		}
		return false;
	}

}
