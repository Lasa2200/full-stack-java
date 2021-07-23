package com.talento.java.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.java.web.models.Customer;
import com.talento.java.web.repositories.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer agregarCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}
	
	public List<Customer> obtenerTodosCustomer(){
		return customerRepo.findAll();
	}

		
	public Customer findById(Long id) {
		return customerRepo.findById(id).orElse(null);
	}
}



