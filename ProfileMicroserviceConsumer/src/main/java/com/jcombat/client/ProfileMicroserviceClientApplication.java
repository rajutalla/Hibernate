package com.jcombat.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableCircuitBreaker
@SpringBootApplication
//@EnableDiscoveryClient
public class ProfileMicroserviceClientApplication {
	
	public static final String PROFILES_SERVICE_URL = "http://PROFILES-MICROSERVICE-PRODUCER";
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileMicroserviceClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();//Us6ql1es8
	}
	@Bean
	public ProfileRepository profileRepository(){
		return new RemoteProfileRepository(PROFILES_SERVICE_URL);
	}
}