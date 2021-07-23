package cl.java.web.examenB.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.java.web.examenB.models.User;
import cl.java.web.examenB.services.UserService;



	@Controller
	public class UserController {
		
		@Autowired
		private UserService userService;
		
			
		
		@RequestMapping(value="/registro", method=RequestMethod.POST)
	    public String registroUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	    
	    	user = userService.registerUser(user);
	    	//guardando en session el id
	    	session.setAttribute("userId", user.getId());
	    	return "/home";
	    	
	
	    }
		
		
		   @RequestMapping(value="/login", method=RequestMethod.POST)
		    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {

			   boolean existeUser = userService.authenticateUser(email,password);
		    	System.out.println("Existe usuario:"+existeUser);
		    	if(existeUser) {
		    		User user = userService.findByEmail(email);
		    		session.setAttribute("userId", user.getId());
		    		return "redirect:/home";
		    	}else {
		    		return "/index";
		    	}
		    }
		   @RequestMapping("/home")
		    public String home(HttpSession session, Model model) {
		        //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
		    	if(session.getAttribute("userId") != null) {
		        	Long userId = (Long) session.getAttribute("userId");
		    		model.addAttribute("user",userService.findUserById(userId));
		    		return "/home";
		    	}else {
		    		return "/index";
		    	}
		    	
		    }
		   @RequestMapping("/logout")
		    public String logout(HttpSession session) {
		        // invalidar la sesión
		        // redireccionar a la página de inicio de sesión.
		    	if(session.getAttribute("userId") != null) {
		    		session.invalidate();
		    	}
		    	return "/index";
		    }
	}


