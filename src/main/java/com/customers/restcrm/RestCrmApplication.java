package com.customers.restcrm;

import com.customers.restcrm.reposotiry.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestCrmApplication.class, args);
        }
        private CustomerRepository customerRepository;
    @Autowired
    public void setStudentRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


}
