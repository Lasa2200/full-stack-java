package com.talento.java.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talento.java.web.models.Customer;
import com.talento.java.web.models.PacCustomer;
import com.talento.java.web.services.CustomerService;
import com.talento.java.web.services.PacCustomerService;
import com.talento.java.web.services.PacService;




@Controller
public class CustomerController {
	@Autowired
	public PacCustomerService ceService;
	@Autowired
	public CustomerService customerService;
	@Autowired
	PacService pacService;



	@GetMapping("/customer/crear")
	public String crearCustomer(@ModelAttribute("customer") Customer customer) {

		return "/customer/crear.jsp";
	}

	@PostMapping("/customer/crear")
	public String insertarCustomer(
			@ModelAttribute("customer") Customer customer) {

		customerService.agregarCustomer(customer);

		return "homePage.jsp";
	}	

	@GetMapping("/customer/listar")
	public String listarCustomer(Model model) {
		List<Customer> listaCustomer = customerService.obtenerTodosCustomer();
		model.addAttribute("listaCustomer", listaCustomer);

		return "/customer/listarCustomer.jsp";
	}





	@RequestMapping("/customer/{id}")
	public String asociarCustomerPac(@PathVariable("id") Long id, Model model) {
		model.addAttribute("customer",customerService.findById(id));

		model.addAttribute("listaPac",pacService.listarPac());
		model.addAttribute("paccustomer",new PacCustomer());

		model.addAttribute("ListaPacCustomer", ceService.findAllByCustomerId(id));

		return "/customer/pacCustomer.jsp";

	}
}

