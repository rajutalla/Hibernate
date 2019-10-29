package com.jcombat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;



@Controller
public class ProfileController {
	
	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	protected RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home(){
		try{
		// final String baseUrl = "http://localhost:8086/";
		//  URI uri = new URI(baseUrl);
		  URL url = new URL("http://localhost:8086/StoreAccountV1/ClientConnection?from=Springboot&data=yes");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
		 //ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		}catch (Exception e) {
			e.printStackTrace();
		}
		 return "index";
	}
	
	@RequestMapping("/gasInventory")
	public String getGasInventoryDetails(){
		try{
			  URL url = new URL("http://localhost:8086/StoreAccountV1/GasInventoryDetails?location=37&startdate=2091-01-01&enddate=2019-10-10&reporttype=GasInventory&data=Inventory");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				conn.disconnect();

		}catch (Exception e) {
		e.printStackTrace();
		}
		return null;
	}
	
	
	
	@RequestMapping("/userProfiles")
	public String profileList(Model model) {
		model.addAttribute("profiles", profileRepository.getAllProfiles());
		return "userProfiles";
	}
	
	@RequestMapping("/gasinventory")
	public String GasInventory(Model model) {
		List<GasReport> gasinventoryreport=profileRepository.getgasInventory();
		model.addAttribute("gasinventoryreport_list", profileRepository.getgasInventory());
		model.addAttribute("gasinventoryreport_listsize", profileRepository.getgasInventory().size());
		model.addAttribute("gas_item_names_list", profileRepository.getgasItems());
		double opbaltotal=0.00;
		double soldgallons=0.00;
		double soldamount=0.00;
		double deliveredgallons=0.00;
		double deliveredamount=0.00;
		double closingbalancetotal=0.00;
		double etrtotal=0.00;
		double difftotal=0.00;
		for (int i = 0; i < gasinventoryreport.size(); i++) 
		{
			opbaltotal=opbaltotal+Double.parseDouble(gasinventoryreport.get(i).getOpening_balance()); 
			soldgallons=soldgallons+Double.parseDouble(gasinventoryreport.get(i).getSold_gallons());
			soldamount=soldamount+Double.parseDouble(gasinventoryreport.get(i).getSold_amount());
			deliveredgallons=deliveredgallons+Double.parseDouble(gasinventoryreport.get(i).getDelivered_gallons());
			deliveredamount=deliveredamount+Double.parseDouble(gasinventoryreport.get(i).getDelivered_amount());
			closingbalancetotal=closingbalancetotal+Double.parseDouble(gasinventoryreport.get(i).getClosing_balance());
			etrtotal=etrtotal+Double.parseDouble(gasinventoryreport.get(i).getEtr());
			difftotal=difftotal+Double.parseDouble(gasinventoryreport.get(i).getDiff());
		}
		return "gas_inventory";
	}
	
	
	@RequestMapping("/locations")
	public String LocationList(Model model) {
		 HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
		//Location[] location = restTemplate.getForObject("http://SpringBootHibernateExample/example", Location[].class);
    	ResponseEntity<List<Location>> list =restTemplate.exchange("http://SpringBootHibernateExample/example",HttpMethod.GET, entity, new ParameterizedTypeReference<List<Location>>() {});
		System.out.println("sizeeeeeeee="+list.getBody());
		List<Location> location=list.getBody();
		model.addAttribute("loci", location);
		//model.addAttribute("loci", profileRepository.getAllLocations());
		//System.out.println("consumerrrrr="+profileRepository.getAllLocations().size());
		return "Location";
	}
	 
	
	@RequestMapping("/userDetails")
	public String profileDetails(@RequestParam("id") String userId, Model model) {
		model.addAttribute("profile", profileRepository.getProfile(userId));
		return "userDetails";
	}
}
