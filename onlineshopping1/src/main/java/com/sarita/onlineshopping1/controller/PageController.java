package com.sarita.onlineshopping1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import com.sarita.shoppingbackend1.dao.CategoryDAO;

@Controller
public class PageController {
//	@Autowired 
//	private CategoryDAO categoryDAO;
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome", true);
//		mv.addObject("Categories",categoryDAO.list());
//		mv.addObject("userClickHome",true);
		return mv;
	}

	// using request param 
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam("greetings") String greetings) {
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greetings", greetings);
//		return mv;
//
//	}
	
	
//	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greetings" , required=false) String greetings) {
//		if(greetings==null) {
//			greetings="Hello ! you are called without sending greeting string in the url";
//			
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greetings", greetings);
//		return mv;
//
//		
//	}
	
//	@RequestMapping(value="/test/{greetings}")
//	public ModelAndView test(@PathVariable("greetings") String greetings) {
//		if(greetings==null) {
//			greetings="Hello ! you are called without sending greeting string in the url";
//			
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greetings", greetings);
//	return mv;
//
//	}
	
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout", true);
//		mv.addObject("Categories",categoryDAO.list());
//		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact", true);
//		mv.addObject("Categories",categoryDAO.list());
//		mv.addObject("userClickHome",true);
		return mv;
	}


	
}

