package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.GasReport;
import org.arpit.java2blog.model.Item;
import org.arpit.java2blog.model.Location;

public interface CustomerDao {
	public List<Customer> getAllCustomers() ;

	public Customer getCustomer(int id) ;

	public Customer addCustomer(Customer customer);

	public void updateCustomer(Customer customer) ;

	public void deleteCustomer(int id) ;

	public List<Location> getAllLocations();

	public Location getOne();

	public List<GasReport> getGasInventory();

	public List<Item> getGasItems();

	public Item getItems();
}
