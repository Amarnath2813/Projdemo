package com.example.repositeries;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    
    @Query(value = "SELECT * FROM Customer", nativeQuery = true)
	Optional<Customer> getCustomer();

}
