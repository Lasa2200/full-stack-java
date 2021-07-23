package cl.java.web.ExamenLogin.Controller;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.java.web.ExamenLogin.Models.User;
import cl.java.web.ExamenLogin.Services.UserService;


@Controller
public class UserController {
	private final UserService userService;
 
	public UserController(UserService userService) {
		this.userService = userService;
	}
 
	@RequestMapping("/registro")
	public String registerForm(@ModelAttribute("user") User user) {
		return "paginaRegistro.jsp";
	}
 
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
 
	@RequestMapping(value="/registro", method=RequestMethod.POST)
    public String registroUser(@Validated @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		 //si el resultado tiene errores, retornar a la página de registro (no se preocupe por las validaciones por ahora)
		 //si no, guarde el usuario en la base de datos, guarde el id del usuario en el objeto Session y redirija a /home
		 
		 if(result.hasErrors())
		 {
			 return "paginaRegistro.jsp";
		 }
		 else
		 {
			 userService.registerUser(user);
			 session.setAttribute("user", userService.findByEmail(user.getEmail()).getId());
			 return "redirect:/home";
		 }
	 }
	 
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		 //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
		 //sino agregue un mensaje de error y retorne a la página de inicio de sesión.
		 
		 User u = userService.findByEmail(email);
		 
		 if(u != null && BCrypt.checkpw(password,u.getPassword()))
		 {
			 session.setAttribute("user", u.getId());
			 return "redirect:/home";
		 }
		 else
		 {
			 model.addAttribute("error", "Usuario inexistente!");
			 return "login.jsp";
		 }
	 }
	 
	 @RequestMapping("/home")
	 public String home(HttpSession session, Model model) {
	     //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
		 
		 model.addAttribute("user", userService.findUserById((Long) session.getAttribute("user")));
		 return "home.jsp";
	 }
	 @RequestMapping("/logout")
	 public String logout(HttpSession session) {
	     // invalidar la sesión
	     // redireccionar a la página de inicio de sesión.
		 
		 session.invalidate();
		 return "redirect:/login";
	 }
}