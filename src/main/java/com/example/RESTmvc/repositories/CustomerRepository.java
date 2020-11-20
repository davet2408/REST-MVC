package com.example.RESTmvc.repositories;

import com.example.RESTmvc.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByFirstName(String firstName);

    Customer findByLastName(String lastName);
}
