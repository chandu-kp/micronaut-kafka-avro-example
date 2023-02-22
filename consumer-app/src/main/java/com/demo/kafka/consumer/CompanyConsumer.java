package com.demo.kafka.consumer;

import com.demo.kafka.model.schema.Company;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener(groupId="company-consumer-group", offsetReset = OffsetReset.EARLIEST)
public class CompanyConsumer {
    private static final Logger log = LoggerFactory.getLogger(CompanyConsumer.class);
    @Topic("company")
    public void receive(@KafkaKey Company companyKey,
                        Company company) {
        log.info("Received company [{}]", company.getName());
    }
}
