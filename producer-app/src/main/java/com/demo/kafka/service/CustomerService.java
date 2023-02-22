package com.demo.kafka.service;

import com.demo.kafka.model.dto.CustomerDto;
import com.demo.kafka.model.schema.Customer;
import com.demo.kafka.producer.CustomerProducer;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Inject
    private CustomerProducer customerProducer;

    public void process(CustomerDto customerDto) {
        log.info(" Processing customer: [{}]", customerDto);
        Customer customer = Customer.newBuilder()
                .setName(customerDto.getName())
                .setPhoneNumber(customerDto.getPhoneNumber())
                .setCity(customerDto.getCity())
                .build();
        customerProducer.addCustomer(customer.getPhoneNumber().toString(), customer);
    }
}
