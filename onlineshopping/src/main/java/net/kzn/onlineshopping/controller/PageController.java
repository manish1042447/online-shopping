package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView indexJ() {
		
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting","welcome to String web MVC");
	return mv;
	
	}
}
 