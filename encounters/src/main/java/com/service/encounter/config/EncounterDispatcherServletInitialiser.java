package com.service.encounter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.service.encounter.controller"})
@EnableTransactionManagement
public class EncounterDispatcherServletInitialiser {

}
