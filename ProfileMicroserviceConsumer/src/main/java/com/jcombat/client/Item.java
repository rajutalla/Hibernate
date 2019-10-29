package com.jcombat.client;

public class Item {
	
	private String itemname;
	private String itemtype;
	private String item_id;
	private String service_account;
	private String income_account;
	private String cogs_account;
	private String subitem_of;
	
	public String getService_account() {
		return service_account;
	}
	public void setService_account(String service_account) {
		this.service_account = service_account;
	}
	public String getIncome_account() {
		return income_account;
	}
	public void setIncome_account(String income_account) {
		this.income_account = income_account;
	}
	public String getCogs_account() {
		return cogs_account;
	}
	public void setCogs_account(String cogs_account) {
		this.cogs_account = cogs_account;
	}
	public String getSubitem_of() {
		return subitem_of;
	}
	public void setSubitem_of(String subitem_of) {
		this.subitem_of = subitem_of;
	}
	private String item_type_id;
	
	
	public String getItem_type_id() {
		return item_type_id;
	}
	public void setItem_type_id(String item_type_id) {
		this.item_type_id = item_type_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
}
