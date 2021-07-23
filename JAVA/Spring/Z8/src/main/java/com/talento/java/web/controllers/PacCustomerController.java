package com.talento.java.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.talento.java.web.models.PacCustomer;
import com.talento.java.web.services.CustomerService;
import com.talento.java.web.services.PacCustomerService;
import com.talento.java.web.services.PacService;


@Controller
public class PacCustomerController {
	@Autowired
	public PacCustomerService ceService;
	@Autowired
	PacService pacService;
	@Autowired
	public CustomerService customerService;

	@PostMapping("/paccustomer/asociarPacCustomer")
	public String asociarPacCustomer(
			@ModelAttribute("PacCustomer") PacCustomer paccustomer, Model model) {
		
		ceService.asociarPacCustomer(paccustomer);
	
		return "redirect:/customer/"+paccustomer.getPac().getId();
		
	}
	
	@PostMapping("/paccustomer/asociarCustomerPac")
	public String asociarCustomerPac(
			@ModelAttribute("paccustomer") PacCustomer paccustomer, Model model) {
		
		ceService.asociarPacCustomer(paccustomer);
		
		return "redirect:/customer/"+ paccustomer.getCustomer().getId();
		
	}
	
	@GetMapping("/remover/PacCustomer/{id}")
	public String removerPacCustomer(
			@PathVariable("id") Long id) {
		PacCustomer pacCustomer = ceService.findById(id);
		Long pacId = pacCustomer.getPac().getId();
	
		ceService.eliminarPacCustomer(pacCustomer);
		
		return "redirect:/pac/"+pacId;
	}
	
	@GetMapping("/remover/CustomerPac/{id}")
	public String CustomerPac(
			@PathVariable("id") Long id) {
		PacCustomer pacCustomer = ceService.findById(id);
		Long customerId = pacCustomer.getCustomer().getId();
		ceService.eliminarPacCustomer(pacCustomer);
		
		return "redirect:/customer/"+customerId;
	}
}

