package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ControlController {
	
	@Autowired
	private UserService userService;
	
	
	// Used for common data operation
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Gmail Account Opening Form");
		m.addAttribute("des", "Gmail is subsidery of Google.com");
	    System.out.println("Adding commom data to model");
	}
	
	@RequestMapping("/contact")
	public String showform(Model m) {
		System.out.println("Showing form");
		return "contact";
		
	}
	@RequestMapping(path ="/processform" , method= RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model){
		
		System.out.println(user);
		
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		
		int createdUser = this.userService.createUser(user);
		
		model.addAttribute("msg","Created with " +createdUser);
		return "success";
	}
	
	/*
	 * @RequestMapping(path ="/processform" , method= RequestMethod.POST) public
	 * String handleform(
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("username") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model ){
	 * 
	 * // System.out.println("User Email is : " + userEmail); //
	 * System.out.println("User Name  is : " + userName); //
	 * System.out.println("User Password is : "+userPassword);
	 * 
	 * // process
	 * 
	 * User user= new User(); user.setEmail(userEmail); user.setUsername(userName);
	 * user.setPassword(userPassword); model.addAttribute("user", user);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * // model.addAttribute("email", userEmail); // model.addAttribute("name",
	 * userName); // model.addAttribute("password", userPassword);
	 * 
	 * return "success"; }
	 */
	

}
