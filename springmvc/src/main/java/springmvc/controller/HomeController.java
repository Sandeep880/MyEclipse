package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Hello This is Url");
		
		model.addAttribute("name", "Jitendra Kumar Bhagat");
		model.addAttribute("id",12345);
		
	   List<String> list=new ArrayList<>();
	   list.add("Raj Kumar");
	   list.add("Jitendra Bhagat");
	   list.add("Rajendra Bhagat");
	   model.addAttribute("nameList", list);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("You are inside About page");
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("You are inside in the service Section");
		return "service";
		
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Call Us on this Number ********");
		
		//Creating Model and view Object
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the Value
		modelAndView.addObject("name","Rupesh Sharma");
		modelAndView.addObject("ghar", 123456 );
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		// Marks
		List<Integer> list=new ArrayList<>();
		list.add(123);
		list.add(456);
		list.add(789);
		list.add(101112);
		
		modelAndView.addObject("marks", list);
		
		// Setting the View Name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	

}
