package cl.java.web.lenguajes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.java.web.lenguajes.models.LenguajeModel.Lenguaje;
import cl.java.web.lenguajes.services.LenguajeService;



@Controller
public class LenguajeController {
	private final LenguajeService lenguajeService;

	public LenguajeController(LenguajeService lenguajeService) {
		this.lenguajeService = lenguajeService;
	}

	@RequestMapping("/lenguajes")
	public String index(Model model) {
		List<Lenguaje> lenguaje = lenguajeService.allLenguaje();
		model.addAttribute("lenguajes", lenguaje);
		System.out.println("hola lenguajes");
		return "/lenguajes/index.jsp";
	}
	@RequestMapping("/lenguajes/new")
	public String newlenguaje(@ModelAttribute("lenguaje") Lenguaje lenguaje) {
		return "/lenguajes/newLenguaje.jsp";
}
	@RequestMapping(value="/lenguajes", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result) {
		if (result.hasErrors()) {
			return "/lenguajes/newLenguaje.jsp";
		} else {
			lenguajeService.createLenguaje(lenguaje);
			return "redirect:/lenguajes";
		}
}
}
