package cl.java.web.WaterBnB.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.java.web.WaterBnB.models.Pool;
import cl.java.web.WaterBnB.models.Review;
import cl.java.web.WaterBnB.models.User;
import cl.java.web.WaterBnB.services.WService;


@Controller
public class WController {

	private final WService service;
	
	public WController(WService service)
	{
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	
	@PostMapping("/search")
	public String search(HttpSession session)
	{
		if(session.getAttribute("user") == null)
		{
			return "redirect:/guest/signin";
		}
		else
		{
			return "redirect:/search";
		}
	}
	
	@RequestMapping("/guest/signin")
	public String signin(@ModelAttribute("user")User user )
	{
		return "signin.jsp";
	}
	
	@PostMapping("/registrer")
	public String registrer(@ModelAttribute("user")User user, BindingResult result, HttpSession session)
	{
		if(result.hasErrors())
		{
			return "signin.jsp";
		}
		else
		{
			if(user.getRole().equals("HOST"))
			{
				service.registrerHost(user);
				session.setAttribute("user", user.getId());
				return "redirect:/host/dashborad";
			}
			else
			{
				service.registrerGuest(user);
				session.setAttribute("user", user.getId());
				return "redirect:/";
			}
		}
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email")String email, @RequestParam("pass")String pass, HttpSession session, Model model)
	{
		User u = service.searchByEmail(email);
		if(u != null && BCrypt.checkpw(pass, u.getPassword()))
		{
			session.setAttribute("user", u.getId());
			return "redirect:/host/dashboard";
		}
		else
		{
			model.addAttribute("error", "user and password invalid");
			return "redirect:/guest/signin";
		}
	}
	
	@RequestMapping("/host/dashboard")
	public String dashboard(@ModelAttribute("pool")Pool pool, HttpSession session, Model model)
	{
		model.addAttribute("user",  service.searchUser((Long) session.getAttribute("user")));
		
		return "dashboard.jsp";
	}
	
	@PostMapping("/poolRegistrer")
	public String poolregistrer(@ModelAttribute("pool")Pool pool, BindingResult result, HttpSession session)
	{
		if(result.hasErrors())
		{
			return "dashboard.jsp";
		}
		else
		{
			pool.setUser(service.searchUser((Long) session.getAttribute("user")));
			service.savePool(pool);
			return "redirect:/host/dashboard";
		}
	}
	
	@RequestMapping("/host/pools/{id}")
	public String poolHost(@PathVariable("id")Long id, @ModelAttribute("pool") Pool pool, HttpSession session, Model model)
	{
		model.addAttribute("pool", service.searchPool(id));
		model.addAttribute("user", service.searchUser((Long) session.getAttribute("user")));
		
		return "poolView.jsp";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("location")String location, HttpSession session, Model model)
	{
		model.addAttribute("busqueda", service.searchPools(location));
		
		return "search.jsp";
	}
	
	@RequestMapping("/pools/{id}")
	public String poolGuest(@PathVariable("id") Long id, HttpSession sesson, Model model)
	{
		model.addAttribute("pool", service.searchPool(id));
		
		return "poolGuest.jsp";
	}
	
	@RequestMapping("/pool/{id}/review")
	public String review(@ModelAttribute("review")Review review, @PathVariable("id")Long id, HttpSession session, Model model)
	{
		model.addAttribute("pool", service.searchPool(id));
		
		return "review.jsp";
	}
	
	@PostMapping("/review/{id}")
	public String reviewRegistrer(@ModelAttribute("review")Review review,@PathVariable("id")Long id, BindingResult result, HttpSession session)
	{
		if(result.hasErrors())
		{
			return "review.jsp";
		}
		else
		{
			review.setUser(service.searchUser((Long) session.getAttribute("user")));
			review.setPool(service.searchPool(id));
			service.saveReview(review);
			return "redirect:/pool/"+id+"/review";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/guest/signin";
	}
}