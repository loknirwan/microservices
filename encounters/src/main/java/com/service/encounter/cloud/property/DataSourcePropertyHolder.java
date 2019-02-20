package com.service.encounter.cloud.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dataSourcePropertyHolder")
@Scope("singleton")
public class DataSourcePropertyHolder {
	
	@Value("${encounters.datasource.type}")
	private String type;
	
	@Value("${encounters.datasource.name}")
	private String name;
	
	@Value("${encounters.datasource.port}")
	private int port;
	
	@Value("${encounters.datasource.host}")
	private String host;
	
	@Value("${encounters.datasource.username}")
	private String username;
	
	@Value("${encounters.datasource.password}")
	private String password;
	
	@Value("${encounters.datasource.uri}")
	private String uri;
	
	@Value("${encounters.datasource.driver}")	
	private String driver;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
}
