package org.arpit.java2blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item", catalog = "gas_ledger")
public class Item {
	
	private String item_name;
	private String item_type_id;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	
	public void setItem_type_id(String item_type_id) {
		this.item_type_id = item_type_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_type_id() {
		return item_type_id;
	}
	public void setItemtype(String item_type_id) {
		this.item_type_id = item_type_id;
	}
}
