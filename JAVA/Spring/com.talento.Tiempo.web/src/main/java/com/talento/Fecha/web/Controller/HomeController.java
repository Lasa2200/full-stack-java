package com.talento.Fecha.web.Controller;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	@RequestMapping("/")
	public String home() {
		System.out.println("Estoy dentro de Home");
		return "home.jsp";

	}

	@RequestMapping("/ruta/date")
	public String date(Model model) {
		Date fecha =new Date();
		System.out.println("La fecha actual es: " + LocalDate.now());
		model.addAttribute("fecha",LocalDate.now());
		return "date.jsp";

	}

	@RequestMapping("/ruta/time")
	public String time (Model model) {
		Time hora =new Time();
		System.out.println( "La hora actual es: " + LocalTime.now() );
		model.addAttribute("hora",LocalTime.now());
		return "time.jsp";
	}		
}
