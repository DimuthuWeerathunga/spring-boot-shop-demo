package com.dimuthu.shop.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer>  getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password", "email@gmail.com "),
                new Customer(2L, "Jamila Ahmed", "password", "email@gmail.com ")
        );
    }
}
