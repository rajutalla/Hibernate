package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.GasReport;
import org.arpit.java2blog.model.Item;
import org.arpit.java2blog.model.Location;
import org.arpit.java2blog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	
	/*@GetMapping(value = "/getAllLocations",headers = "Accept=application/json")
	public ResponseEntity getAllLocations(Model model) {

		List<Location> list = customerService.getAllLocations();
		//model.addAttribute("customer", new Location());
		//model.addAttribute("listOfCustomers", listOfCustomers);
		System.out.println("location="+list.size());
		return new ResponseEntity(list, HttpStatus.OK);
	}*/
	
	@RequestMapping("/example")
	public ResponseEntity<List<Location>> all() {
		List<Location> profiles = customerService.getAllLocations();
		return new ResponseEntity<List<Location>>( profiles,HttpStatus.OK);
	}
	
	@RequestMapping("/gasInventory")
	public ResponseEntity<List<GasReport>> GasInventory() {
		System.out.println("i am hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		List<GasReport> profiles = customerService.getGasInventory();
		return new ResponseEntity<List<GasReport>>( profiles,HttpStatus.OK);
	}
	
	@RequestMapping("/gasItems")
	public ResponseEntity<List<Item>> GasIems() {
		List<Item> profiles = customerService.getGasItems();
		return new ResponseEntity<List<Item>>( profiles,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllLocations")//,produces = MediaType.APPLICATION_JSON_VALUE
	@ResponseBody
	public ResponseEntity<List<Location>> getAllLocations(Model model) {
		System.out.println("locaiiiiiiiiiiiiiiooooooooooooooooooosssssssss");
		List<Location> list = customerService.getAllLocations();
		System.out.println("location="+list.size());
		
		Location l=new Location();
		l.setLocation_id("1");
		l.setLocation_name("hnk"); 
		
		return new ResponseEntity<List<Location>>( list,HttpStatus.OK);
	}
	
	@GetMapping(value="/one",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Location> getOne(){
		Location l=customerService.getOne();
		return new ResponseEntity(l, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value="/locationcache",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Location> getCache(){
		System.out.println("cacaheeeeeeeeeeeeeeeee locationssssss");
		Location l=customerService.getOne();
		return new ResponseEntity(l, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value="/itemcache",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> getitem(){
		System.out.println("cacaheeeeeeeeeeeeeeeee itemsssss");
		Item l=customerService.getitems();
		return new ResponseEntity(l, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllCustomers(Model model) {

		List<Customer> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return "customerDetails";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}
	
	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {	
		if(customer.getId()==0)
		{
			customerService.addCustomer(customer);
		}
		else
		{	
			customerService.updateCustomer(customer);
		}

		return "redirect:/getAllCustomers";
	}

	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id,Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listOfCustomers", this.customerService.getAllCustomers());
		return "customerDetails";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/getAllCustomers";

	}	
}
