package com.demo.kafka.model.dto;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data
public class CustomerDto {
    private String name;
    private String phoneNumber;
    private String city;
}
