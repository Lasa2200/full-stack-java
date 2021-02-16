package cl.java.web.cinturonNegro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("estoy en Home");
		return "home.jsp";
	}
	@RequestMapping("/search")
	
	public String search(@RequestParam(value ="location") String location) {
		System.out.println(" estoy en el Search");
	return null;
	
	}
}