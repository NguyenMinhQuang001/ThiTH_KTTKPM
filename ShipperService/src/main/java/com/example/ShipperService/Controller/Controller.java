package com.example.ShipperService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShipperService.Service.ShipperService;
import com.example.ShipperService.VO.CustomerOfShipper;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/shipper")
public class Controller {
	
	@Autowired
	private ShipperService shipperService;
	
	@GetMapping("/{id}")
	public CustomerOfShipper getShipper(@PathVariable int id) {
		return shipperService.getCustomerOfShipper(id);
	}
}
