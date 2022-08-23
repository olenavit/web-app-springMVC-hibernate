package ua.com.vitkovska.spring.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.vitkovska.spring.hibernate.entity.Customer;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        return sessionFactory.getCurrentSession().createQuery("from Customer", Customer.class).getResultList();
    }
}
