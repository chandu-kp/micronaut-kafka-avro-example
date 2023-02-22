package com.demo.kafka.producer;

import com.demo.kafka.model.schema.Company;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient(id = "company-client")
public interface CompanyProducer {
    @Topic("company")
    void addCompany(@KafkaKey Company companyKey, Company company);
}
