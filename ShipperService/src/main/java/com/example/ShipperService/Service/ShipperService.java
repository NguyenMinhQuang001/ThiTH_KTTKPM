package com.example.ShipperService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ShipperService.Model.ShipperOOD;
import com.example.ShipperService.Repository.ShipperRepository;
import com.example.ShipperService.VO.Customer;
import com.example.ShipperService.VO.CustomerOfShipper;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class ShipperService {
	
	@Autowired
	private ShipperRepository shipperRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "CustomerService", fallbackMethod = "customerBack")
	@RateLimiter(name = "CustomerService", fallbackMethod = "customerBack")
	public CustomerOfShipper getCustomerOfShipper(int shipperId) {
		
		ShipperOOD ord = shipperRepository.findById(shipperId).get();
		Customer cut = restTemplate.getForObject("http://localhost:9001/Customer/" + ord.getCustomerId(), Customer.class);
		CustomerOfShipper co = new CustomerOfShipper(ord,cut);
		return co;
	}
	
	public CustomerOfShipper customerBack(Exception e) {
		return new CustomerOfShipper();
	}
	
	
}
