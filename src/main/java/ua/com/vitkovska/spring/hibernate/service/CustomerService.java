package ua.com.vitkovska.spring.hibernate.service;

import ua.com.vitkovska.spring.hibernate.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
}
