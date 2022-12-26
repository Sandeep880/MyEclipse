package springmvc.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		
		  System.out.println("You are in first menu ");
		  RedirectView redirectView = new RedirectView(); 
		  redirectView.setUrl("https://www.youtube.com");
		  return redirectView;
		  
		  // This Is methods for sevlet
		  
		/* 
		 * response.sendRedirect("two"); //return ;
		 * 
		 */	
		
		}
	@RequestMapping("/two")
	public String two() {
		System.out.println("You are in second menu");
		return "contact";
	}

}
