package cl.java.ElCodigo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {
	@RequestMapping("/") // index
	public String index ()  {		
	
			return "/index.jsp";	
		
	}
	
    @RequestMapping(value="/validacion", method=RequestMethod.POST)
    public String validacion(@RequestParam(value="codigo") String codigo
    		/*,Model model*/
    		) {
    	if (codigo.equals("bushido")) {
    		return "/code.jsp";
		}
    	
    	//model.addAttribute("error","hola")
    	//return "index.jsp";
    	return "redirect:/createError";
    
		
    }
    @RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "Your must train harder");
        return "redirect:/";
	}
}