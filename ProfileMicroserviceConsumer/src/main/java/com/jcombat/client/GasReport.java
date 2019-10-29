package com.jcombat.client;

import java.sql.Date;

public class GasReport {
	private String selectdtype;  
	private	String startdate;
	private	String enddate; 
	private String etr;
	private String diff; 
	private String closing;   
	private String itemname;  
	private String purchasestatus;
	private String totalgassoldgallons; 
	private String datereportformate; 
	
	private String totalgasopeningbalnce;
	 private String totalgassoldavarage;
	 private String totalgasdeliverdgallons;
	 private String totalgasdeliverdamount;
	 private String totalgasdeliverdrate;
	
	 private String totaltotalgassoldgallons; 
	 private String totaltotalgassoldamount;
	 private String totaltotalgassoldavarage;
	 private String totaltotalgasdeliverdgallons;
	 private String totaltotalgasdeliverdamount;
	 private String totaltotalgasdeliverdrate;
	 private String reportblendstatus;
	 private String lock; 
 
	private String unleadedtotalopeningbalance;
	private String unleadedtotalsoldgallns;
	 
	private String unleadedtotalsoldamount;
	private String unleadedtotalsoldavarage;
	private String unleadedtotaldeliverdgallons;
	private String unleadedtotaldeliverdamount;
	private String unleadedtotaldeliverdrate;
	 
	private String premiumtotalopbalance; 
	private String premiumtotalsoldgallns;
	private String premiumtotalsoldamount;
	private String premiumtotalsoldavarage;
	private String premiumtotaldeliverdgallons;
	private String premiumtotaldeliverdamount;
	private String premiumtotaldeliverdrate;  
	private String dieseltotalopbalance; 
	private String dieseltotalsoldgallns;
	private String dieseltotalsoldamount;
	private String dieseltotalsoldavarage;
	private String dieseltotaldeliverdgallons;
	private String dieseltotaldeliverdamount;
	private String dieseltotaldeliverdrate; 
	private String plustotalopbalance; 
	private String plustotalsoldgallns;
	private String plustotalsoldamount;
	private String plustotalsoldavarage;
	 private String plustotaldeliverdgallons;
	 private String plustotaldeliverdamount;
	 private String plustotaldeliverdrate ; 
	private double gastotalcash;
	private String role;
	private String userid;
	private String locationid;
	private String unleadedopening;
	private String plusopening;
	private String premiumopening;
	private String deiselopening;
	private String total;
	private String gastotal;
	private String unleadedsoldgallons;
	private String plussoldgallons;
	private String premiumsoldgallons;
	private String deiselsoldgallons;
	private String unleadedsoldamount;
	private String plussoldamount;
	private String premiumsoldamount;
	private String deiselsoldamount;
	private String unleadeddeliveredgallons; 
	private String premiumdeliveredgallons;
	private String deiseldeliveredgallons; 
	private String unleadedetr; 
	private String premiumetr;
	private String deiseletr; 
	private String unleadedclosingbalance;
	private String plusclosingbalance;
	private String premiumclosingbalance;
	private String deiselclosingbalance; 
	private String reportdate;
	private Date tdate;
	private String recorddate; 
	private String totalopeningbalance; 
	private String gallonsdispensed; 
	private String premiumgallonsdispensed;
	private String dieselgallonsdispensed; 
	private String unleadedamount; 
	private String premiumamount;
	private String dieselamount; 
	private String unleadedaveragerate; 
	private String plussoldaverage;
	private String premiumsoldaverage;
	private String dieselsoldaverage;  
	private String unleadeddifference;
	private String premdifference;
	private String dieseldifference; 
	private String totalgallonsdispensed; 
	private String totalamount;
	private String totalsoldgallons;
	private String totalsoldamount; 
	private String totalclosing;
	private String totalelectronic;
	private String totaldifference; 
	private	String unleaded_delivered_rate;
	private	String premium_delivered_rate;
	private	String diesel_delivered_rate;
	private	String unleaded_delivered_amount;
	private	String premium_delivered_amount;
	private	String diesel_delivered_amount;
	private	String plus_delivered_rate;
	private	String plus_delivered_amount;
	private	String plus_delivered_gallons;
	private	String plusetr; 
	private	String premium_diff;
	private	String plus_diff; 
	private String report_date;
	private String item_id;
	private String opening_balance;
	private String gallons_dispensed;
	private String sold_gallons;
	private String sold_amount;
	private String delivered_gallons;
	private String delivered_average;
	private String delivered_amount;
	private String closing_balance; 
	private String sold_average;
	private String gallons_amount;
	private String blend_ratio;
	
	
	
	
	public String getSelectdtype() {
		return selectdtype;
	}
	public void setSelectdtype(String selectdtype) {
		this.selectdtype = selectdtype;
	}
	public String getEtr() {
		return etr;
	}
	public void setEtr(String etr) {
		this.etr = etr;
	}
	public String getDiff() {
		return diff;
	}
	public void setDiff(String diff) {
		this.diff = diff;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(String closing) {
		this.closing = closing;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getReport_date() {
		return report_date;
	}
	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(String opening_balance) {
		this.opening_balance = opening_balance;
	}
	public String getGallons_dispensed() {
		return gallons_dispensed;
	}
	public void setGallons_dispensed(String gallons_dispensed) {
		this.gallons_dispensed = gallons_dispensed;
	}
	public String getSold_gallons() {
		return sold_gallons;
	}
	public void setSold_gallons(String sold_gallons) {
		this.sold_gallons = sold_gallons;
	}
	public String getSold_amount() {
		return sold_amount;
	}
	public void setSold_amount(String sold_amount) {
		this.sold_amount = sold_amount;
	}
	public String getDelivered_gallons() {
		return delivered_gallons;
	}
	public void setDelivered_gallons(String delivered_gallons) {
		this.delivered_gallons = delivered_gallons;
	}
	public String getDelivered_average() {
		return delivered_average;
	}
	public void setDelivered_average(String delivered_average) {
		this.delivered_average = delivered_average;
	}
	public String getDelivered_amount() {
		return delivered_amount;
	}
	public void setDelivered_amount(String delivered_amount) {
		this.delivered_amount = delivered_amount;
	}
	public String getClosing_balance() {
		return closing_balance;
	}
	public void setClosing_balance(String closing_balance) {
		this.closing_balance = closing_balance;
	}
	public String getSold_average() {
		return sold_average;
	}
	public void setSold_average(String sold_average) {
		this.sold_average = sold_average;
	}
	public String getGallons_amount() {
		return gallons_amount;
	}
	public void setGallons_amount(String gallons_amount) {
		this.gallons_amount = gallons_amount;
	}
	public String getBlend_ratio() {
		return blend_ratio;
	}
	public void setBlend_ratio(String blend_ratio) {
		this.blend_ratio = blend_ratio;
	}
	public String getPremium_diff() {
		return premium_diff;
	}
	public void setPremium_diff(String premium_diff) {
		this.premium_diff = premium_diff;
	}
	public String getPlus_diff() {
		return plus_diff;
	}
	public void setPlus_diff(String plus_diff) {
		this.plus_diff = plus_diff;
	}
	public String getPlusetr() {
		return plusetr;
	}
	public void setPlusetr(String plusetr) {
		this.plusetr = plusetr;
	}
	public String getPurchasestatus() {
		return purchasestatus;
	}
	public void setPurchasestatus(String purchasestatus) {
		this.purchasestatus = purchasestatus;
	}
	public String getTotalgassoldgallons() {
		return totalgassoldgallons;
	}
	public void setTotalgassoldgallons(String totalgassoldgallons) {
		this.totalgassoldgallons = totalgassoldgallons;
	}
	public String getDatereportformate() {
		return datereportformate;
	}
	public void setDatereportformate(String datereportformate) {
		this.datereportformate = datereportformate;
	}
	public String getTotalgasopeningbalnce() {
		return totalgasopeningbalnce;
	}
	public void setTotalgasopeningbalnce(String totalgasopeningbalnce) {
		this.totalgasopeningbalnce = totalgasopeningbalnce;
	}
	public String getTotalgassoldavarage() {
		return totalgassoldavarage;
	}
	public void setTotalgassoldavarage(String totalgassoldavarage) {
		this.totalgassoldavarage = totalgassoldavarage;
	}
	public String getTotalgasdeliverdgallons() {
		return totalgasdeliverdgallons;
	}
	public void setTotalgasdeliverdgallons(String totalgasdeliverdgallons) {
		this.totalgasdeliverdgallons = totalgasdeliverdgallons;
	}
	public String getTotalgasdeliverdamount() {
		return totalgasdeliverdamount;
	}
	public void setTotalgasdeliverdamount(String totalgasdeliverdamount) {
		this.totalgasdeliverdamount = totalgasdeliverdamount;
	}
	public String getTotalgasdeliverdrate() {
		return totalgasdeliverdrate;
	}
	public void setTotalgasdeliverdrate(String totalgasdeliverdrate) {
		this.totalgasdeliverdrate = totalgasdeliverdrate;
	}
	public String getTotaltotalgassoldgallons() {
		return totaltotalgassoldgallons;
	}
	public void setTotaltotalgassoldgallons(String totaltotalgassoldgallons) {
		this.totaltotalgassoldgallons = totaltotalgassoldgallons;
	}
	public String getTotaltotalgassoldamount() {
		return totaltotalgassoldamount;
	}
	public void setTotaltotalgassoldamount(String totaltotalgassoldamount) {
		this.totaltotalgassoldamount = totaltotalgassoldamount;
	}
	public String getTotaltotalgassoldavarage() {
		return totaltotalgassoldavarage;
	}
	public void setTotaltotalgassoldavarage(String totaltotalgassoldavarage) {
		this.totaltotalgassoldavarage = totaltotalgassoldavarage;
	}
	public String getTotaltotalgasdeliverdgallons() {
		return totaltotalgasdeliverdgallons;
	}
	public void setTotaltotalgasdeliverdgallons(String totaltotalgasdeliverdgallons) {
		this.totaltotalgasdeliverdgallons = totaltotalgasdeliverdgallons;
	}
	public String getTotaltotalgasdeliverdamount() {
		return totaltotalgasdeliverdamount;
	}
	public void setTotaltotalgasdeliverdamount(String totaltotalgasdeliverdamount) {
		this.totaltotalgasdeliverdamount = totaltotalgasdeliverdamount;
	}
	public String getTotaltotalgasdeliverdrate() {
		return totaltotalgasdeliverdrate;
	}
	public void setTotaltotalgasdeliverdrate(String totaltotalgasdeliverdrate) {
		this.totaltotalgasdeliverdrate = totaltotalgasdeliverdrate;
	}
	public String getReportblendstatus() {
		return reportblendstatus;
	}
	public void setReportblendstatus(String reportblendstatus) {
		this.reportblendstatus = reportblendstatus;
	}
	public String getLock() {
		return lock;
	}
	public void setLock(String lock) {
		this.lock = lock;
	}
	public String getPlus_delivered_gallons() {
		return plus_delivered_gallons;
	}
	public void setPlus_delivered_gallons(String plus_delivered_gallons) {
		this.plus_delivered_gallons = plus_delivered_gallons;
	}

	
	 
	public String getUnleadedtotalsoldamount() {
		return unleadedtotalsoldamount;
	}
	public void setUnleadedtotalsoldamount(String unleadedtotalsoldamount) {
		this.unleadedtotalsoldamount = unleadedtotalsoldamount;
	}
	public String getUnleadedtotalsoldavarage() {
		return unleadedtotalsoldavarage;
	}
	public void setUnleadedtotalsoldavarage(String unleadedtotalsoldavarage) {
		this.unleadedtotalsoldavarage = unleadedtotalsoldavarage;
	}
	public String getUnleadedtotaldeliverdgallons() {
		return unleadedtotaldeliverdgallons;
	}
	public void setUnleadedtotaldeliverdgallons(String unleadedtotaldeliverdgallons) {
		this.unleadedtotaldeliverdgallons = unleadedtotaldeliverdgallons;
	}
	public String getUnleadedtotaldeliverdamount() {
		return unleadedtotaldeliverdamount;
	}
	public void setUnleadedtotaldeliverdamount(String unleadedtotaldeliverdamount) {
		this.unleadedtotaldeliverdamount = unleadedtotaldeliverdamount;
	}
	public String getUnleadedtotaldeliverdrate() {
		return unleadedtotaldeliverdrate;
	}
	public void setUnleadedtotaldeliverdrate(String unleadedtotaldeliverdrate) {
		this.unleadedtotaldeliverdrate = unleadedtotaldeliverdrate;
	}
	public String getPremiumtotalopbalance() {
		return premiumtotalopbalance;
	}
	public void setPremiumtotalopbalance(String premiumtotalopbalance) {
		this.premiumtotalopbalance = premiumtotalopbalance;
	}
	public String getPremiumtotalsoldgallns() {
		return premiumtotalsoldgallns;
	}
	public void setPremiumtotalsoldgallns(String premiumtotalsoldgallns) {
		this.premiumtotalsoldgallns = premiumtotalsoldgallns;
	}
	public String getPremiumtotalsoldamount() {
		return premiumtotalsoldamount;
	}
	public void setPremiumtotalsoldamount(String premiumtotalsoldamount) {
		this.premiumtotalsoldamount = premiumtotalsoldamount;
	}
	public String getPremiumtotalsoldavarage() {
		return premiumtotalsoldavarage;
	}
	public void setPremiumtotalsoldavarage(String premiumtotalsoldavarage) {
		this.premiumtotalsoldavarage = premiumtotalsoldavarage;
	}
	public String getPremiumtotaldeliverdgallons() {
		return premiumtotaldeliverdgallons;
	}
	public void setPremiumtotaldeliverdgallons(String premiumtotaldeliverdgallons) {
		this.premiumtotaldeliverdgallons = premiumtotaldeliverdgallons;
	}
	public String getPremiumtotaldeliverdamount() {
		return premiumtotaldeliverdamount;
	}
	public void setPremiumtotaldeliverdamount(String premiumtotaldeliverdamount) {
		this.premiumtotaldeliverdamount = premiumtotaldeliverdamount;
	}
	public String getPremiumtotaldeliverdrate() {
		return premiumtotaldeliverdrate;
	}
	public void setPremiumtotaldeliverdrate(String premiumtotaldeliverdrate) {
		this.premiumtotaldeliverdrate = premiumtotaldeliverdrate;
	}
	public String getDieseltotalopbalance() {
		return dieseltotalopbalance;
	}
	public void setDieseltotalopbalance(String dieseltotalopbalance) {
		this.dieseltotalopbalance = dieseltotalopbalance;
	}
	public String getDieseltotalsoldgallns() {
		return dieseltotalsoldgallns;
	}
	public void setDieseltotalsoldgallns(String dieseltotalsoldgallns) {
		this.dieseltotalsoldgallns = dieseltotalsoldgallns;
	}
	public String getDieseltotalsoldamount() {
		return dieseltotalsoldamount;
	}
	public void setDieseltotalsoldamount(String dieseltotalsoldamount) {
		this.dieseltotalsoldamount = dieseltotalsoldamount;
	}
	public String getDieseltotalsoldavarage() {
		return dieseltotalsoldavarage;
	}
	public void setDieseltotalsoldavarage(String dieseltotalsoldavarage) {
		this.dieseltotalsoldavarage = dieseltotalsoldavarage;
	}
	public String getDieseltotaldeliverdgallons() {
		return dieseltotaldeliverdgallons;
	}
	public void setDieseltotaldeliverdgallons(String dieseltotaldeliverdgallons) {
		this.dieseltotaldeliverdgallons = dieseltotaldeliverdgallons;
	}
	public String getDieseltotaldeliverdamount() {
		return dieseltotaldeliverdamount;
	}
	public void setDieseltotaldeliverdamount(String dieseltotaldeliverdamount) {
		this.dieseltotaldeliverdamount = dieseltotaldeliverdamount;
	}
	public String getDieseltotaldeliverdrate() {
		return dieseltotaldeliverdrate;
	}
	public void setDieseltotaldeliverdrate(String dieseltotaldeliverdrate) {
		this.dieseltotaldeliverdrate = dieseltotaldeliverdrate;
	}
	public String getPlustotalopbalance() {
		return plustotalopbalance;
	}
	public void setPlustotalopbalance(String plustotalopbalance) {
		this.plustotalopbalance = plustotalopbalance;
	}
	public String getPlustotalsoldgallns() {
		return plustotalsoldgallns;
	}
	public void setPlustotalsoldgallns(String plustotalsoldgallns) {
		this.plustotalsoldgallns = plustotalsoldgallns;
	}
	public String getPlustotalsoldamount() {
		return plustotalsoldamount;
	}
	public void setPlustotalsoldamount(String plustotalsoldamount) {
		this.plustotalsoldamount = plustotalsoldamount;
	}
	public String getPlustotalsoldavarage() {
		return plustotalsoldavarage;
	}
	public void setPlustotalsoldavarage(String plustotalsoldavarage) {
		this.plustotalsoldavarage = plustotalsoldavarage;
	}
	public String getPlustotaldeliverdgallons() {
		return plustotaldeliverdgallons;
	}
	public void setPlustotaldeliverdgallons(String plustotaldeliverdgallons) {
		this.plustotaldeliverdgallons = plustotaldeliverdgallons;
	}
	public String getPlustotaldeliverdamount() {
		return plustotaldeliverdamount;
	}
	public void setPlustotaldeliverdamount(String plustotaldeliverdamount) {
		this.plustotaldeliverdamount = plustotaldeliverdamount;
	}
	public String getPlustotaldeliverdrate() {
		return plustotaldeliverdrate;
	}
	public void setPlustotaldeliverdrate(String plustotaldeliverdrate) {
		this.plustotaldeliverdrate = plustotaldeliverdrate;
	}
	public String getUnleadedtotalsoldgallns() {
		return unleadedtotalsoldgallns;
	}
	public void setUnleadedtotalsoldgallns(String unleadedtotalsoldgallns) {
		this.unleadedtotalsoldgallns = unleadedtotalsoldgallns;
	}
	public String getUnleadedtotalopeningbalance() {
		return unleadedtotalopeningbalance;
	}
	public void setUnleadedtotalopeningbalance(String unleadedtotalopeningbalance) {
		this.unleadedtotalopeningbalance = unleadedtotalopeningbalance;
	}
	public String getPlus_delivered_rate() {
		return plus_delivered_rate;
	}
	public void setPlus_delivered_rate(String plus_delivered_rate) {
		this.plus_delivered_rate = plus_delivered_rate;
	}
	public String getPlus_delivered_amount() {
		return plus_delivered_amount;
	}
	public void setPlus_delivered_amount(String plus_delivered_amount) {
		this.plus_delivered_amount = plus_delivered_amount;
	}
	public double getGastotalcash() {
		return gastotalcash;
	}
	public void setGastotalcash(double gastotalcash) {
		this.gastotalcash = gastotalcash;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLocationid() {
		return locationid;
	}
	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}
	public String getUnleadedopening() {
		return unleadedopening;
	}
	public void setUnleadedopening(String unleadedopening) {
		this.unleadedopening = unleadedopening;
	}
	public String getPlusopening() {
		return plusopening;
	}
	public void setPlusopening(String plusopening) {
		this.plusopening = plusopening;
	}
	public String getPremiumopening() {
		return premiumopening;
	}
	public void setPremiumopening(String premiumopening) {
		this.premiumopening = premiumopening;
	}
	public String getDeiselopening() {
		return deiselopening;
	}
	public void setDeiselopening(String deiselopening) {
		this.deiselopening = deiselopening;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getGastotal() {
		return gastotal;
	}
	public void setGastotal(String gastotal) {
		this.gastotal = gastotal;
	}
	public String getUnleadedsoldgallons() {
		return unleadedsoldgallons;
	}
	public void setUnleadedsoldgallons(String unleadedsoldgallons) {
		this.unleadedsoldgallons = unleadedsoldgallons;
	}
	public String getPlussoldgallons() {
		return plussoldgallons;
	}
	public void setPlussoldgallons(String plussoldgallons) {
		this.plussoldgallons = plussoldgallons;
	}
	public String getPremiumsoldgallons() {
		return premiumsoldgallons;
	}
	public void setPremiumsoldgallons(String premiumsoldgallons) {
		this.premiumsoldgallons = premiumsoldgallons;
	}
	public String getDeiselsoldgallons() {
		return deiselsoldgallons;
	}
	public void setDeiselsoldgallons(String deiselsoldgallons) {
		this.deiselsoldgallons = deiselsoldgallons;
	}
	public String getUnleadedsoldamount() {
		return unleadedsoldamount;
	}
	public void setUnleadedsoldamount(String unleadedsoldamount) {
		this.unleadedsoldamount = unleadedsoldamount;
	}
	public String getPlussoldamount() {
		return plussoldamount;
	}
	public void setPlussoldamount(String plussoldamount) {
		this.plussoldamount = plussoldamount;
	}
	public String getPremiumsoldamount() {
		return premiumsoldamount;
	}
	public void setPremiumsoldamount(String premiumsoldamount) {
		this.premiumsoldamount = premiumsoldamount;
	}
	public String getDeiselsoldamount() {
		return deiselsoldamount;
	}
	public void setDeiselsoldamount(String deiselsoldamount) {
		this.deiselsoldamount = deiselsoldamount;
	}
	public String getUnleadeddeliveredgallons() {
		return unleadeddeliveredgallons;
	}
	public void setUnleadeddeliveredgallons(String unleadeddeliveredgallons) {
		this.unleadeddeliveredgallons = unleadeddeliveredgallons;
	}
	public String getPremiumdeliveredgallons() {
		return premiumdeliveredgallons;
	}
	public void setPremiumdeliveredgallons(String premiumdeliveredgallons) {
		this.premiumdeliveredgallons = premiumdeliveredgallons;
	}
	public String getDeiseldeliveredgallons() {
		return deiseldeliveredgallons;
	}
	public void setDeiseldeliveredgallons(String deiseldeliveredgallons) {
		this.deiseldeliveredgallons = deiseldeliveredgallons;
	}
	public String getUnleadedetr() {
		return unleadedetr;
	}
	public void setUnleadedetr(String unleadedetr) {
		this.unleadedetr = unleadedetr;
	}
	public String getPremiumetr() {
		return premiumetr;
	}
	public void setPremiumetr(String premiumetr) {
		this.premiumetr = premiumetr;
	}
	public String getDeiseletr() {
		return deiseletr;
	}
	public void setDeiseletr(String deiseletr) {
		this.deiseletr = deiseletr;
	}
	public String getUnleadedclosingbalance() {
		return unleadedclosingbalance;
	}
	public void setUnleadedclosingbalance(String unleadedclosingbalance) {
		this.unleadedclosingbalance = unleadedclosingbalance;
	}
	public String getPlusclosingbalance() {
		return plusclosingbalance;
	}
	public void setPlusclosingbalance(String plusclosingbalance) {
		this.plusclosingbalance = plusclosingbalance;
	}
	public String getPremiumclosingbalance() {
		return premiumclosingbalance;
	}
	public void setPremiumclosingbalance(String premiumclosingbalance) {
		this.premiumclosingbalance = premiumclosingbalance;
	}
	public String getDeiselclosingbalance() {
		return deiselclosingbalance;
	}
	public void setDeiselclosingbalance(String deiselclosingbalance) {
		this.deiselclosingbalance = deiselclosingbalance;
	}
	public String getReportdate() {
		return reportdate;
	}
	public void setReportdate(String reportdate) {
		this.reportdate = reportdate;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public String getRecorddate() {
		return recorddate;
	}
	public void setRecorddate(String recorddate) {
		this.recorddate = recorddate;
	}
	public String getTotalopeningbalance() {
		return totalopeningbalance;
	}
	public void setTotalopeningbalance(String totalopeningbalance) {
		this.totalopeningbalance = totalopeningbalance;
	}
	public String getGallonsdispensed() {
		return gallonsdispensed;
	}
	public void setGallonsdispensed(String gallonsdispensed) {
		this.gallonsdispensed = gallonsdispensed;
	}
	public String getPremiumgallonsdispensed() {
		return premiumgallonsdispensed;
	}
	public void setPremiumgallonsdispensed(String premiumgallonsdispensed) {
		this.premiumgallonsdispensed = premiumgallonsdispensed;
	}
	public String getDieselgallonsdispensed() {
		return dieselgallonsdispensed;
	}
	public void setDieselgallonsdispensed(String dieselgallonsdispensed) {
		this.dieselgallonsdispensed = dieselgallonsdispensed;
	}
	public String getUnleadedamount() {
		return unleadedamount;
	}
	public void setUnleadedamount(String unleadedamount) {
		this.unleadedamount = unleadedamount;
	}
	public String getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(String premiumamount) {
		this.premiumamount = premiumamount;
	}
	public String getDieselamount() {
		return dieselamount;
	}
	public void setDieselamount(String dieselamount) {
		this.dieselamount = dieselamount;
	}
	public String getUnleadedaveragerate() {
		return unleadedaveragerate;
	}
	public void setUnleadedaveragerate(String unleadedaveragerate) {
		this.unleadedaveragerate = unleadedaveragerate;
	}
	public String getPlussoldaverage() {
		return plussoldaverage;
	}
	public void setPlussoldaverage(String plussoldaverage) {
		this.plussoldaverage = plussoldaverage;
	}
	public String getPremiumsoldaverage() {
		return premiumsoldaverage;
	}
	public void setPremiumsoldaverage(String premiumsoldaverage) {
		this.premiumsoldaverage = premiumsoldaverage;
	}
	public String getDieselsoldaverage() {
		return dieselsoldaverage;
	}
	public void setDieselsoldaverage(String dieselsoldaverage) {
		this.dieselsoldaverage = dieselsoldaverage;
	}
	public String getUnleadeddifference() {
		return unleadeddifference;
	}
	public void setUnleadeddifference(String unleadeddifference) {
		this.unleadeddifference = unleadeddifference;
	}
	public String getPremdifference() {
		return premdifference;
	}
	public void setPremdifference(String premdifference) {
		this.premdifference = premdifference;
	}
	public String getDieseldifference() {
		return dieseldifference;
	}
	public void setDieseldifference(String dieseldifference) {
		this.dieseldifference = dieseldifference;
	}
	public String getTotalgallonsdispensed() {
		return totalgallonsdispensed;
	}
	public void setTotalgallonsdispensed(String totalgallonsdispensed) {
		this.totalgallonsdispensed = totalgallonsdispensed;
	}
	public String getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}
	public String getTotalsoldgallons() {
		return totalsoldgallons;
	}
	public void setTotalsoldgallons(String totalsoldgallons) {
		this.totalsoldgallons = totalsoldgallons;
	}
	public String getTotalsoldamount() {
		return totalsoldamount;
	}
	public void setTotalsoldamount(String totalsoldamount) {
		this.totalsoldamount = totalsoldamount;
	}
	public String getTotalclosing() {
		return totalclosing;
	}
	public void setTotalclosing(String totalclosing) {
		this.totalclosing = totalclosing;
	}
	public String getTotalelectronic() {
		return totalelectronic;
	}
	public void setTotalelectronic(String totalelectronic) {
		this.totalelectronic = totalelectronic;
	}
	public String getTotaldifference() {
		return totaldifference;
	}
	public void setTotaldifference(String totaldifference) {
		this.totaldifference = totaldifference;
	}
	public String getUnleaded_delivered_rate() {
		return unleaded_delivered_rate;
	}
	public void setUnleaded_delivered_rate(String unleaded_delivered_rate) {
		this.unleaded_delivered_rate = unleaded_delivered_rate;
	}
	public String getPremium_delivered_rate() {
		return premium_delivered_rate;
	}
	public void setPremium_delivered_rate(String premium_delivered_rate) {
		this.premium_delivered_rate = premium_delivered_rate;
	}
	public String getDiesel_delivered_rate() {
		return diesel_delivered_rate;
	}
	public void setDiesel_delivered_rate(String diesel_delivered_rate) {
		this.diesel_delivered_rate = diesel_delivered_rate;
	}
	public String getUnleaded_delivered_amount() {
		return unleaded_delivered_amount;
	}
	public void setUnleaded_delivered_amount(String unleaded_delivered_amount) {
		this.unleaded_delivered_amount = unleaded_delivered_amount;
	}
	public String getPremium_delivered_amount() {
		return premium_delivered_amount;
	}
	public void setPremium_delivered_amount(String premium_delivered_amount) {
		this.premium_delivered_amount = premium_delivered_amount;
	}
	public String getDiesel_delivered_amount() {
		return diesel_delivered_amount;
	}
	public void setDiesel_delivered_amount(String diesel_delivered_amount) {
		this.diesel_delivered_amount = diesel_delivered_amount;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	  

}
