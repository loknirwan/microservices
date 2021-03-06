package com.service.encounters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.DispatcherServlet;

import com.service.encounter.cloud.property.GeneralPropertyHolder;
import com.service.encounter.config.EncounterDispatcherServletInitialiser;
import com.service.encounter.config.EncounterRootContextInitialiser;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages= {"com.service.encounter.cloud.property"})
@Import(EncounterRootContextInitialiser.class)
public class EncountersApplication {
	
	@Autowired
	private GeneralPropertyHolder generalPropertyHolder;
	
	@Bean
	@DependsOn({"generalPropertyHolder"})
    public ServletRegistrationBean<DispatcherServlet> encounterServletConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EncounterDispatcherServletInitialiser.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet, generalPropertyHolder.getBaseUrl());
        servletRegistrationBean.setName(generalPropertyHolder.getName());
        return servletRegistrationBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(EncountersApplication.class, args);
	}
}

