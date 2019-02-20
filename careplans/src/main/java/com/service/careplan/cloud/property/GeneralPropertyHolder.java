package com.service.careplan.cloud.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("generalPropertyHolder")
@Scope("singleton")
public class GeneralPropertyHolder {
	
	@Value("${careplans.title}")
	private String title;
	
	@Value("${careplans.name}")
	private String name;
	
	@Value("${careplans.base_url}")
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
