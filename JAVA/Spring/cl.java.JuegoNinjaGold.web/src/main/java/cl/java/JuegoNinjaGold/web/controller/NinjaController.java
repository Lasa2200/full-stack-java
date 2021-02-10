package cl.java.JuegoNinjaGold.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	
@RequestMapping("/")
public String index() {
	System.out.println("aca tu formulario");
return "gold.jsp";

}
@RequestMapping(value="/", method=RequestMethod.POST)
public String resultado(@RequestParam(value="farm") String farm ,@RequestParam(value="cave") String cave, 
@RequestParam(value="house") String house, @RequestParam(value="casino") String casino,Model model) {
	model.addAttribute("farm",farm);
	model.addAttribute("cave",cave);
	model.addAttribute("house",house);
	model.addAttribute("casino",casino);
	
	
		return"/gold.jsp"; 
	 
}

}
