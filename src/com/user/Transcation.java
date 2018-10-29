package com.user;

import java.util.ArrayList;
import java.util.List;

public class Transcation {

	static List<ReportSheet> reportList = new ArrayList<>();
	
	//int id, String fName, String lName, String auto, String price,String transDate
	public static List<ReportSheet> init(){
		
		ReportSheet report2 = new ReportSheet(1, "Sean", "Gammage", "Range Rover", "42500", "10/25/2018");
		ReportSheet report3 = new ReportSheet(2,"Marek", "S", "Toyota AE86", "2500", "09/30/2018");
		ReportSheet report1 = new ReportSheet(3 ,"Serge", "Arnold", "Lincoln TownCar", "6000","09/28/2017" );
		
		
		reportList.add(report2);
		reportList.add(report3);
		reportList.add(report1);
		
		
		return reportList;
	}
	
	public static List<ReportSheet> getReportList(){
		return reportList;
	}
	public static void setReportList(List<ReportSheet> reportList) {
		Transcation.reportList = reportList;
	}
}
