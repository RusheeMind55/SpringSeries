package springvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {

	
	
	@GetMapping("/form")
	public String form() {
		
		System.out.println("inside of the page");
		return "form";
	}
}
