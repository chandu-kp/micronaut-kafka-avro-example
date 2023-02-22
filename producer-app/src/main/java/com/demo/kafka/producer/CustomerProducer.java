package com.demo.kafka.producer;

import com.demo.kafka.model.schema.Customer;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface CustomerProducer {
    @Topic("customers")
    void addCustomer(@KafkaKey String phoneNumber, Customer customer);
}
