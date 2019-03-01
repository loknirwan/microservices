package com.service.allergy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.service.allergy.controller"})
@EnableTransactionManagement
public class AllergiesDispatcherServletInitialiser {

}
