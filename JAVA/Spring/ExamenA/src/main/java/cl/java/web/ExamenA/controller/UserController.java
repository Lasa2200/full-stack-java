package cl.java.web.ExamenA.controller;

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

import cl.java.web.ExamenA.models.User;
import cl.java.web.ExamenA.services.UserService;



@Controller 
class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "index.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "index.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    //si el resultado tiene errores, retornar a la página de registro (no se preocupe por las validaciones por ahora)
    //si no, guarde el usuario en la base de datos, guarde el id del usuario en el objeto Session y redirija a /home
    	
    	user = userService.registerUser(user);
    	//guardando den session el id
    	session.setAttribute("userId", user.getId());
    	return "home.jsp";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
    //sino agregue un mensaje de error y retorne a la página de inicio de sesión.
    	
    	boolean existeUser = userService.authenticateUser(email,password);
    	System.out.println("Existe usuario:"+existeUser);
    	if(existeUser) {
    		User user = userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
    		return "redirect:/home";
    	}else {
    		return "redirect:/";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
    	if(session.getAttribute("userId") != null) {
        	Long userId = (Long) session.getAttribute("userId");
    		model.addAttribute("user",userService.findUserById(userId));
    		return "home.jsp";
    	}else {
    		return "redirect:/login";
    	}
    	
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	System.out.println(" me estoy deslogueando");
        // invalidar la sesión
        // redireccionar a la página de inicio de sesión.
    	if(session.getAttribute("userId") != null) {
    		session.invalidate();
    	}
    	return "redirect:/";
    }

}


