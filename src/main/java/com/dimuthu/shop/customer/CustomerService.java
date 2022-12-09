package com.dimuthu.shop.customer;

import com.dimuthu.shop.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j // this will generate a log variable from slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;
    List<Customer> getCustomers() {
        log.info("getCustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Customer with id " + id + " not found");
                    log.error("error in getting customer {}", id, notFoundException);
                    return notFoundException;
                });
    }
}
