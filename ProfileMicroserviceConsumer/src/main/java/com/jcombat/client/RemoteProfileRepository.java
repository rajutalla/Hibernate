package com.jcombat.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RemoteProfileRepository implements ProfileRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteProfileRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
		System.out.println("service url="+serviceUrl);
	}

	@Override
	public List<Profile> getAllProfiles() {
		Profile[] profiles = restTemplate.getForObject(serviceUrl+"/profiles", Profile[].class);
		return Arrays.asList(profiles);
	}

	@Override
	public Profile getProfile(String userId) {
		return restTemplate.getForObject(serviceUrl + "/profiles/{id}",
				Profile.class, userId);
	}

	@Override
	public List<Location> getAllLocations() {
		 HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
		//Location[] location = restTemplate.getForObject("http://SpringBootHibernateExample/example", Location[].class);
    	ResponseEntity<List<Location>> list =restTemplate.exchange("http://SpringBootHibernateExample/example",HttpMethod.GET, entity, new ParameterizedTypeReference<List<Location>>() {});

		System.out.println("sizeeeeeeee="+list.getBody());
		List<Location> location=list.getBody();
		System.out.println("location_name="+location.get(0).getLocation_name());
		return location;
	}

	@Override
	public List<GasReport> getgasInventory() {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
        ResponseEntity<List<GasReport>> list =restTemplate.exchange("http://SpringBootHibernateExample/gasInventory",HttpMethod.GET, entity, new ParameterizedTypeReference<List<GasReport>>() {});
		System.out.println("sizeeeeeeee="+list.getBody());
		List<GasReport> gasinventory=list.getBody();
		return gasinventory;
	}

	@Override
	public List<Item> getgasItems() {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
        ResponseEntity<List<Item>> list =restTemplate.exchange("http://SpringBootHibernateExample/gasItems",HttpMethod.GET, entity, new ParameterizedTypeReference<List<Item>>() {});
		List<Item> items=list.getBody();
		return items;
	}
	
	
	

}
