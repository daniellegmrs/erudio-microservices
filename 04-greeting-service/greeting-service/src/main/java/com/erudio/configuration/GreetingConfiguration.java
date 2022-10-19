package com.erudio.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {

	private String greeting;
	private String defaultValue;
	
	
	public GreetingConfiguration() {}

	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public String getdefaultValue() {
		return defaultValue;
	}


	public void setdefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}	
		
}
