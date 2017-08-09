package com.doit.jihyuk.mvc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public void hello(Model model) {
		model.addAttribute("msg", "Hello @MVCtt");
	}
	
//  (2)
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
//	public String hello(Model model) {
//		model.addAttribute("msg", "Hello @MVC");
//		return "hello";
//	}

//	(3)
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
//	public ModelAndView hello(HttpSession session) { //이렇게 session값 받아와서 활용
//		return new ModelAndView("hello","msg","Hello @MVC annotation");
//	}
//	

}
