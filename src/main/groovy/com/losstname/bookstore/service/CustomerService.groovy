package com.losstname.bookstore.service

import com.losstname.bookstore.model.Customer
import com.losstname.bookstore.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-28.
 */
@Service
class CustomerService {

    @Autowired
    CustomerRepository customerRepository

    Customer save(Customer customer){
        Customer c = customerRepository.save(customer)
        return c
    }

}
