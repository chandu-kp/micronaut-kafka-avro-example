package com.demo.kafka.consumer;

import com.demo.kafka.model.schema.Customer;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener(groupId="customer-consumer-group", offsetReset = OffsetReset.EARLIEST)
public class CustomerConsumer {
    private static final Logger log = LoggerFactory.getLogger(CustomerConsumer.class);
    @Topic("customers")
    public void receive(@KafkaKey String phoneNumber,
                        Customer customer) {

        log.info("Received customer [{}]", customer.getName());
    }
}
