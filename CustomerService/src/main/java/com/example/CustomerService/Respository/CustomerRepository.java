package com.example.CustomerService.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerService.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
