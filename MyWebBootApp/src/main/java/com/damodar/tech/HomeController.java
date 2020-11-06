package com.damodar.tech;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	//using Servlet
	/*public String home(HttpServletRequest req,HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("hi"+ name);
		session.setAttribute("name", name);
		return "home";*/
	/*public String home(@RequestParam("name")String myname,HttpSession session) {  
		//@RequestParam is helpfule when we are passing multiple parameter
		System.out.println("hi"+ myname);
		session.setAttribute("name", myname);
		return "home";*/
	@RequestMapping("home")
	//public ModelAndView home(@RequestParam("name")String myName) {
	public ModelAndView home(Alien alien) {
		
		
		ModelAndView mv = new ModelAndView();
		//mv.addObject("name",myName);
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
		
		
	}

}
