package com.example.CustomerService.Service;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.example.CustomerService.Model.Customer;
import com.example.CustomerService.Respository.CustomerRepository;

@Service
public class CustomerServer {

	@Autowired
	private CustomerRepository customerRepository;

//	Câu 2	
//	@Retryable(value = RuntimeException.class, maxAttempts = 3, backoff = @Backoff(delay = 1000))
	
//	Câu 3
//	@Cacheable(value = "customer", key = "#id")
	
	public Customer getCustomerById(int id) {
		Logger logger = Logger.getLogger(CustomerServer.class.getName());
		logger.info("lấy dữ liệu từ db");

//		Câu 1
		Optional<Customer> customer = customerRepository.findById(id);
		
//		Câu 2		
//		Optional<Customer> customer = null;
		
//		Câu 3
//		Optional<Customer> customer = customerRepository.findById(id);
		
//		------------------------------------------------------------------------

//		Câu 1
		if(customer.isPresent()) {
			return customer.get();
		}else {
			System.out.println("Đang đợi server phản hồi ....");
			throw new RuntimeException("Server không phản hồi");
		}

//		Câu 2
//		if (customer!=null) {
//			return customer.get();
//		} else {
//			System.out.println("Đang đợi server phản hồi ....");
//			throw new RuntimeException("Server không phản hồi");
//		}
		
//		Câu 3
//		if(customer.isPresent()) {
//			return customer.get();
//		}else {
//			System.out.println("Đang đợi server phản hồi ....");
//			throw new RuntimeException("Server không phản hồi");
//		}
	}
}
