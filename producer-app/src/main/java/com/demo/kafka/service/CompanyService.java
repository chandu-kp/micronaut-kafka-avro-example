package com.demo.kafka.service;

import com.demo.kafka.model.dto.CompanyDto;
import com.demo.kafka.model.schema.Company;
import com.demo.kafka.producer.CompanyProducer;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class CompanyService {
    private static final Logger log = LoggerFactory.getLogger(CompanyService.class);

    @Inject
    private CompanyProducer companyProducer;

    public void process(CompanyDto companyDto) {
        log.info(" Processing company: [{}]", companyDto);
        Company company = Company.newBuilder()
                .setName(companyDto.getName())
                .setPhoneNumber(companyDto.getPhoneNumber())
                .setCity(companyDto.getCity())
                .build();
        companyProducer.addCompany(company, company);
    }
}
