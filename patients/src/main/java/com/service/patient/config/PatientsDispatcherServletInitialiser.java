package com.service.patient.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.service.patient.controller"})
@EnableTransactionManagement
public class PatientsDispatcherServletInitialiser {

}
