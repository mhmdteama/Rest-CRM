package com.customers.restcrm.services;

import com.customers.restcrm.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomerByID(int id);
    Customer saveCustomer(Customer customer);
    Customer update(Customer customer);
    void delete(int id);
}
