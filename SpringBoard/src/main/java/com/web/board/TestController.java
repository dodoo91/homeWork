package com.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/index")
	private String jspIndex() {
		System.out.println("index called@!!!@");
		return "index"; // jsp확장자를 생략가능
	}
	
}

