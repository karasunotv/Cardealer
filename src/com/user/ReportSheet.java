package com.user;

public class ReportSheet {

	private int id;
	String fName;
	String lName;
	String auto;
	String price;
	String transDate;
	/**
	 * @param id
	 * @param fName
	 * @param lName
	 * @param auto
	 * @param price
	 */
	public ReportSheet(int id, String fName, String lName, String auto, String price,String transDate) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.auto = auto;
		this.price = price;
		this.transDate = transDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	
	
}
