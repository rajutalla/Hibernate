package com.jcombat.client;

import java.io.Serializable;


public class Location implements Serializable{
	private static final long serialVersionUID = 1L;
	private String location_id; 
	private String location_name;
	private String addressline1;
	private String addressline2;
	private String zipcode; 
	private String role; 
	private String userid; 
	
	private String phone; 
	
	private String activeind; 
	
	public String getActiveind() {
		return activeind;
	}

	public void setActiveind(String activeind) {
		this.activeind = activeind;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
 

		
}
