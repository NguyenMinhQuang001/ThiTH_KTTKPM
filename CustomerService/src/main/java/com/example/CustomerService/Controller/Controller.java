package com.example.CustomerService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.Model.Customer;
import com.example.CustomerService.Service.CustomerServer;

@RestController
@RequestMapping("/Customer")
public class Controller {
	
	@Autowired
	private CustomerServer customerServer;
	
	@GetMapping("/{id}")
	private Customer getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return customerServer.getCustomerById(id);
	}
}
