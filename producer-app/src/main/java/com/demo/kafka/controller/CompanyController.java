package com.demo.kafka.controller;

import com.demo.kafka.model.dto.CompanyDto;
import com.demo.kafka.service.CompanyService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import javax.validation.Valid;

@Controller("/company")
public class CompanyController {
    @Inject
    private CompanyService companyService;

    @Post
    public void addCompany(@Valid @Body CompanyDto companyDto) {
        companyService.process(companyDto);
    }
}
