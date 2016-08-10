package org.singlelife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/**")
public class ApimngController {

	@RequestMapping("/apimng")
	public void api(String email, Model model)
	{
		model.addAttribute("email",email);
		System.out.println(email);
	}
}
