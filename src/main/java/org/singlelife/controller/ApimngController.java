package org.singlelife.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/**")
public class ApimngController {

	@RequestMapping("/apimng")
	public void api(String email, HttpSession session)
	{
		session.setAttribute("email", email);
		System.out.println(email);
	}
	
	@RequestMapping("/keymng")
	public void key()
	{

	}
}
