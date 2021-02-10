package cl.java.Contador.web.controller;

import java.awt.image.ColorModel;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class homeController {



	@RequestMapping ("/")
	public String home (HttpSession session) {
		int count;
		if(session.getAttribute("count")== null){
			count = 0;
		}else {
			count =(int)session.getAttribute("count");
		}
		count =count+1;
		session.setAttribute("count",count);

		return "home.jsp";
	}


	@RequestMapping("/count")
	public String counter (HttpSession session , Model model) {
		 int count =(int)session.getAttribute("count");
		 model.addAttribute("count",count);

		return "count.jsp";
	}

}