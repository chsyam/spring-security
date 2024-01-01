package com.chsyam.springsecurity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chsyam.springsecurity.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	List<Customer> findByEmail(String email);
}