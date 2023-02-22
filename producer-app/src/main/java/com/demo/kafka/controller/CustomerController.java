package com.demo.kafka.controller;

import com.demo.kafka.model.dto.CustomerDto;
import com.demo.kafka.service.CustomerService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import javax.validation.Valid;

@Controller("/customers")
public class CustomerController {
    @Inject
    private CustomerService customerService;

    @Post
    public void addCustomer(@Valid @Body CustomerDto customerDto) {
        customerService.process(customerDto);
    }
}
