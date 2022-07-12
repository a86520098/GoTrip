package com.ispan.group3.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.group3.enums.HttpState;
import com.ispan.group3.repository.UserAccount;
import com.ispan.group3.service.UserAccountService;
import com.ispan.group3.util.JsonResult;

@RestController
@RequestMapping(value = "/api/userAccount")
public class UserAccountRestController {

	@Autowired
	private UserAccountService userAccountService;
	
	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public JsonResult<Boolean> checkEmailDuplicate(@RequestParam(value = "email") String email) {
		
		UserAccount result = userAccountService.findMemberAccountByEmail(email);
		return new JsonResult<Boolean>(HttpState.SUCCESS.getState(), result != null ? true : false);
	}

}
