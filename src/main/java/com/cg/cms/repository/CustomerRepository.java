package com.cg.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cms.entities.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
