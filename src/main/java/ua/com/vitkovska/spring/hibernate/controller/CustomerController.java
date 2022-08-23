package ua.com.vitkovska.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.vitkovska.spring.hibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model model) {
        model.addAttribute("customers",customerService.getCustomers());
        return "list-customers";
    }
}
