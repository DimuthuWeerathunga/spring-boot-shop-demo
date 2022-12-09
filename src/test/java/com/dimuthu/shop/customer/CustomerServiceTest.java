package com.dimuthu.shop.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer jamila = new Customer(1L, "jamila","hello","jamila@gmail.com");
        Customer ali = new Customer(2L, "ali","hello","ali@gmail.com");
        List<Customer> c = Arrays.asList(jamila, ali);
        customerRepository.saveAll(c);

        // when
        List<Customer> customers = underTest.getCustomers();

        // then
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        // given
        Customer jamila = new Customer(1L, "jamila","hello","jamila@gmail.com");
        customerRepository.save(jamila);

        // when
        Customer actual = underTest.getCustomer(1L);

        //then
        assertEquals(jamila.getId(), actual.getId());
        assertEquals(jamila.getName(), actual.getName());
        assertEquals(jamila.getEmail(), actual.getEmail());
        assertEquals(jamila.getPassword(), actual.getPassword());
    }
}