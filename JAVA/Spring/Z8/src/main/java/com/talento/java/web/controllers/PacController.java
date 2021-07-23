package com.talento.java.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.talento.java.web.models.Pac;
import com.talento.java.web.models.PacCustomer;
import com.talento.java.web.services.CustomerService;
import com.talento.java.web.services.PacCustomerService;
import com.talento.java.web.services.PacService;


@Controller
public class PacController {
	@Autowired
	PacService pacService;
	@Autowired
	public CustomerService customerService;

	@Autowired
	public PacCustomerService pacCustomerService;

	@GetMapping("/pac/crear")
	public String crearPac(Model model) {
		model.addAttribute("pac", new Pac());
		return "/pac/crearPac.jsp";
	}

	@PostMapping("/pac/crear")
	public String insertarPac(@ModelAttribute("pac") Pac pac) {
		pacService.insertarPac(pac);
		return "redirect:/home";
	}

	@GetMapping("/pac/listar")
	public String listarPac(Model model) {
		model.addAttribute("listaPac",pacService.listarPac());		
		return "/pac/listarPac.jsp";
	}

	@RequestMapping("/pac/{id}")
	public String asociarCustomerPac(
			@PathVariable("id") Long id, Model model
			) {

		model.addAttribute("pac",pacService.obtenerPac(id));

		model.addAttribute("listaCustomer", customerService.obtenerTodosCustomer());
		model.addAttribute("pacCustomer",new PacCustomer());

		model.addAttribute("ListaPacCustomer", pacCustomerService.findAllByPacId(id));

		return "/pac/pacCustomer.jsp";

	}

	//editar
	
	
	@RequestMapping("/pac")
	public String index(Model model) {
		List<Pac> pac = pacService.listarPac();
		model.addAttribute("pac", pac);
		System.out.println("Hola pacakages");
		return "/pac/homePage.jsp";
	}
	@RequestMapping("/pac/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Pac pac = pacService.obtenerPac(id);
		model.addAttribute("pac", pac);
		return "/pac/edit.jsp";
	}
	
//	//marca error
//	@RequestMapping("/pac/{id}")
//	public String showPac(@PathVariable("id") Long id, Model model) {
//		Pac pac = pacService.findPac(id);
//		model.addAttribute("pac", pac);
//
//		return "/pac/show.jsp";
//	}
	
	 
	@RequestMapping(value="/pac/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("pac") Pac pac, BindingResult result) {
		if (result.hasErrors()) {
			return "/pac/edit.jsp";
		} else {
			pacService.updatePac(pac);
			return "redirect:/pac";
		}
	}
	@RequestMapping(value="/pac/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		pacService.deletePac(id);
		return "redirect:/pac";
	}	
	
	// para rediricir a show.jsp
	
	@RequestMapping(value="pac/show")
	public String mostrarPac() {
		System.out.println("estamos en el Show");
	return "/pac/show.jsp";
	
}
}

