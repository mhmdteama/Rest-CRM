package com.customers.restcrm.controller;

import com.customers.restcrm.entity.Customer;
import com.customers.restcrm.errors.CustomerNotFoundException;
import com.customers.restcrm.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomersController {
    private final CustomerService customerService ;

    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomerList()
    {
        return customerService.getCustomers();
    }

    @GetMapping("/customerById/{customerId}")
    public Customer getCustomer(@PathVariable int customerId)
    {
        if (customerId >= customerService.getCustomers().size() || customerId<0)
        {
            throw new CustomerNotFoundException("Customer not found " + customerId);
        }
        return customerService.getCustomerByID(customerId);
    }
    @PostMapping("/addCustomer")
    public Customer save(@RequestBody Customer customer)
    {
        customer.setId(0);
        customerService.saveCustomer(customer);
        return customer;
    }

    @PutMapping("/updateCustomer")
    public Customer update(@RequestBody Customer customer)
    {
        customerService.update(customer);
        return customer;
    }

    @DeleteMapping("/deleteCustomer/{deleteId}")
    public String delete(@PathVariable int deleteId)
    {
        customerService.delete(deleteId);
        return "Deleted Customer id " + deleteId;
    }
}
