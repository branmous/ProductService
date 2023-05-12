package com.sottwarearquitecture.product_microservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.sottwarearquitecture.product_microservice.entity")
@EnableJpaRepositories("com.sottwarearquitecture.product_microservice.repository")
@EnableTransactionManagement
public class DomainConfig {
}
