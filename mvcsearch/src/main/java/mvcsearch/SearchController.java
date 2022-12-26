package mvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
@RequestMapping("/home")
 public String home() {
      
	System.out.println("You are inside in Home Page");
	  return "home";	
}

@RequestMapping("/search")
public RedirectView search(@RequestParam("querybox") String query) {
	
	RedirectView redirectView = new RedirectView();
	
	if(query.isBlank())
	{
		redirectView.setUrl("redirect:/search");
		return redirectView;
	}
	
	String url= "https://www.google.com/search?q=" + query;
	redirectView.setUrl(url);
	
	return redirectView;
	
}





}
