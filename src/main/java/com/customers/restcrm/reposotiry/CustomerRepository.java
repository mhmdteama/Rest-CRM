package com.customers.restcrm.reposotiry;

import com.customers.restcrm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
