package com.talento.java.web.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talento.java.web.models.Customer;



@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


	List<Customer> findAll();


}

