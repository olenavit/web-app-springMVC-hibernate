package ua.com.vitkovska.spring.hibernate.dao;

import ua.com.vitkovska.spring.hibernate.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
}
