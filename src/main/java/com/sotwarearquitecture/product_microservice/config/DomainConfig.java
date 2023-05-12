package com.sotwarearquitecture.product_microservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.sotwarearquitecture.product_microservice.entity")
@EnableJpaRepositories("com.sotwarearquitecture.product_microservice.repository")
@EnableTransactionManagement
public class DomainConfig {
}
