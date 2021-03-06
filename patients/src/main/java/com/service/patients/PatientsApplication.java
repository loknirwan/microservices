package com.service.patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

import com.service.patient.cloud.property.GeneralPropertyHolder;
import com.service.patient.config.PatientRootContextInitialiser;
import com.service.patient.config.PatientsDispatcherServletInitialiser;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages= {"com.service.patient.cloud.property"})
@Import(PatientRootContextInitialiser.class)
public class PatientsApplication {
	
	@Autowired
	private GeneralPropertyHolder generalPropertyHolder;
	
	@Bean
	@DependsOn({"generalPropertyHolder"})
    public ServletRegistrationBean<DispatcherServlet> patientServletConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PatientsDispatcherServletInitialiser.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet, generalPropertyHolder.getBaseUrl());
        servletRegistrationBean.setName(generalPropertyHolder.getName());
        return servletRegistrationBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(PatientsApplication.class, args);
	}
}

