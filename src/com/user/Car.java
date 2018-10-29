package com.user;

public class Car {

	private int id;
	private String manufactureName;
	private String purchaseDate;
	private String odometer;
	private double price;
	private String make;
	private String model;
	private String year;
	private String auto;
	private String pickImage;
	private boolean sold;

	
	
	
	/**
	 * @param auto
	 * @param pickImage 
	 */
	public Car(String auto, int id, String manufactureName, String purchaseDate, String odometer, double price, String make, String model,
			String year, String pickImage, boolean sold) {
		super();
		this.auto = auto;
		this.id = id;
		this.manufactureName = manufactureName;
		this.purchaseDate = purchaseDate;
		this.odometer = odometer;
		this.price = price;
		this.make = make;
		this.model = model;
		this.year = year;
		this.pickImage = pickImage;
		this.sold = sold;
	}


	
	/**public Car(String manufactureName, String purchaseDate, String odometer, String price, String make, String model,
			String year, String auto) {
		super();
		this.manufactureName = manufactureName;
		this.purchaseDate = purchaseDate;
		this.odometer = odometer;
		this.price = price;
		this.make = make;
		this.model = model;
		this.year = year;
		this.auto = auto;
	}*/
	
	
	public String getManufactureName() {
		return manufactureName;
	}
	
	
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getOdometer() {
		return odometer;
	}
	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto1) {
		this.auto = auto1;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getPickImage() {
		return pickImage;
	}



	public void setPickImage(String pickImage) {
		this.pickImage = pickImage;
	}



	public boolean getSold() {
		return sold;
	}



	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	
	
}
