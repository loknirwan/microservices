package com.service.careplans;

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

import com.service.careplan.cloud.property.GeneralPropertyHolder;
import com.service.careplan.config.CareplanRootContextInitialiser;
import com.service.careplan.config.CareplansDispatcherServletInitialiser;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages= {"com.service.careplan.cloud.property"})
@Import(CareplanRootContextInitialiser.class)
public class CareplansApplication {
	
	@Autowired
	private GeneralPropertyHolder generalPropertyHolder;
	
	@Bean
	@DependsOn({"generalPropertyHolder"})
    public ServletRegistrationBean<DispatcherServlet> patientServletConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CareplansDispatcherServletInitialiser.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet, generalPropertyHolder.getBaseUrl());
        servletRegistrationBean.setName(generalPropertyHolder.getName());
        return servletRegistrationBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(CareplansApplication.class, args);
	}

}

