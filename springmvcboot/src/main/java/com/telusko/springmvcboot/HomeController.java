package com.telusko.springmvcboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	

	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		
		int num3 = i + j;
		mv.addObject("num3", num3);
		
		return mv;
	}
	
	@RequestMapping("addAlien")
	public String addAlien() {
		return null;
		
	}
}
