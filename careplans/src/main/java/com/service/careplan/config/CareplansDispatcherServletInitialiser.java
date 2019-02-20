package com.service.careplan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.service.careplan.controller"})
@EnableTransactionManagement
public class CareplansDispatcherServletInitialiser {

}
