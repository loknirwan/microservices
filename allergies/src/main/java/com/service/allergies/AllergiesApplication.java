package com.service.allergies;

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

import com.service.allergy.cloud.property.GeneralPropertyHolder;
import com.service.allergy.config.AllergiesDispatcherServletInitialiser;
import com.service.allergy.config.AllergyRootContextInitialiser;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages= {"com.service.allergy.cloud.property"})
@Import(AllergyRootContextInitialiser.class)
public class AllergiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllergiesApplication.class, args);
	}
	
	@Autowired
	private GeneralPropertyHolder generalPropertyHolder;
	
	@Bean
	@DependsOn({"generalPropertyHolder"})
    public ServletRegistrationBean<DispatcherServlet> allergyServletConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AllergiesDispatcherServletInitialiser.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setApplicationContext(context);
        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet, generalPropertyHolder.getBaseUrl());
        servletRegistrationBean.setName(generalPropertyHolder.getName());
        return servletRegistrationBean;
    }

}
