package com.dimuthu.shop.customer;

import java.util.Collections;
import java.util.List;

 public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
//        Todo coneect to real db
        return Collections.singletonList(new Customer(1L, "TODO. implement real db", "password", "email@gmail.com "));
    }
}
