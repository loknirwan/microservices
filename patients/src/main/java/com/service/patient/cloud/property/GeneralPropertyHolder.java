package com.service.patient.cloud.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("generalPropertyHolder")
@Scope("singleton")
public class GeneralPropertyHolder {
	
	@Value("${patients.title}")
	private String title;
	
	@Value("${patients.name}")
	private String name;
	
	@Value("${patients.base_url}")
	private String baseUrl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
