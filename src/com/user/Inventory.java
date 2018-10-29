package com.user;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	static List<Car> carList = new ArrayList<>();
	static List<Car> carList1 = new ArrayList<>();
	static List<Car> carList2 = new ArrayList<>();

	/**String auto, int id, String manufactureName, String purchaseDate, String odometer, String price, String make, String model,
	String year*/
	public static List<Car> init() {
		Car carAE86 = new Car("Toyota AE86",1, "Toyota", "08/28/2018", "50000", 25000, "Toyota", "Sprinter Trueno", "1985","images/thumbs/01.jpg", true);
		Car carP1 = new Car("McLaren P1",2, "McLaren Automotive", "05/08/2018", "5000", 1200000, "McLaren", "P1", "2017","images/thumbs/02.jpg", false);
		Car carMbs = new Car("Mercedes Benz Sprinter",3, "Daimler AG", "09/09/2018", "35000", 45000, "Mercedes Benz", "Sprinter", "2013","images/thumbs/03.jpg",false);
		
		/**
		Car carMbg = new Car("Mercedes Benz G63",4, "Daimler AG", "10/5/2018", "25000", "165000", "Mercedes Benz", "G63", "2016");
		Car carMbc = new Car("Mercedes Benz C63 Black Series",5, "Daimler AG", "6/12/2018", "10000", "125000", "Mercedes Benz", "C63 Black Series", "2013");
		Car carLtc = new Car("Lincoln TownCar", 6, "Ford", "10/6/2018", "250000", "13000", "Lincoln", "TownCar", "2010");
		Car carRr = new Car("Range Rover", 7, "Land Rover", "3/15/2018", "85000", "45000", "Range Rover", "Sport", "2015");
		Car carThl = new Car("Toyota Highlander", 8, "Toyota", "9/25/2018","25000" ,"26789" ,"Toyota" , "HighLander", "2017");
		Car carMc = new Car("Mini Cooper", 9, "Britain",  "12/30/2017", "333333", "33000", "Mini", "Cooper" , "2015");
		Car carVr = new Car("Volvo V70R", 10, "Volvo Group", "10/18/2018", "100000", "15000", "Volvo", "V70R", "2004" );
		*/
		
		carList = new ArrayList<>();
		carList.add(carAE86);
		carList.add(carP1);
		carList.add(carMbs);
		
		/**
		carList.add(carMbg);
		carList.add(carMbc);
		carList.add(carLtc);
		carList.add(carRr);
		
		
		carList.add(carThl);
		carList.add(carMc);
		carList.add(carVr);
		
		*/
		
		
		
		
		return carList;
	}

	public static List<Car> getCarList() {
		init();
		return carList;
	}

	public static void setCarList(List<Car> carList) {
		Inventory.carList = carList;
	}
	
	
	
	
	public static List<Car> init1() {
		
		Car carMbg = new Car("Mercedes Benz G63",4, "Daimler AG", "10/05/2018", "25000", 165000, "Mercedes Benz", "G63", "2016", "images/thumbs/04.jpg", false);
		Car carMbc = new Car("Mercedes Benz C63 Black Series",5, "Daimler AG", "06/12/2018", "10000", 125000, "Mercedes Benz", "C63 Black Series", "2013","images/thumbs/05.jpg", false);
		Car carLtc = new Car("Lincoln TownCar", 6, "Ford", "10/06/2018", "250000", 13000, "Lincoln", "TownCar", "2010", "images/thumbs/10.jpg", true);
		Car carRr = new Car("Range Rover", 7, "Land Rover", "03/15/2018", "85000", 45000, "Range Rover", "Sport", "2015", "images/thumbs/06.jpg", true);
		
		
		
		
		carList1 = new ArrayList<>();
		carList1.add(carMbg);
		carList1.add(carMbc);
		carList1.add(carLtc);
		carList1.add(carRr);
		
		
		
		
		
		
		
		return carList1;
	}

	public static List<Car> getCarList1() {
		init1();
		return carList1;
	}

	public static void setCarList1(List<Car> carList1) {
		Inventory.carList1 = carList1;
	}
	
	
	
	public static List<Car> init3() {
		
		Car carThl = new Car("Toyota Highlander", 8, "Toyota", "09/25/2018","25000" ,26789 ,"Toyota" , "HighLander", "2017","images/thumbs/07.jpg", false);
		Car carMc = new Car("Mini Cooper", 9, "Britain",  "12/30/2017", "333333", 33000, "Mini", "Cooper" , "2015","images/thumbs/08.jpg", false);
		Car carVr = new Car("Volvo V70R", 10, "Volvo Group", "10/18/2018", "100000", 15000, "Volvo", "V70R", "2004","images/thumbs/09.jpg", false );
		
		//Creates a new carList to stop updating the price of the discount
		carList2 = new ArrayList<>();
		carList2.add(carThl);
		carList2.add(carMc);
		carList2.add(carVr);
		

		return carList2;
	}

	public static List<Car> getCarList2() {
		init3();
		return carList2;
	}

	public static void setCarList2(List<Car> carList2) {
		Inventory.carList2 = carList2;
	}
	
	
	
	
	
	
	
}
	
	


