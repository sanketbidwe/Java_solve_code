package com.listOfTretment;

import java.util.Arrays;

public class HospitalFinder {

	public static void main(String[] args) {
		
		HospitalService hs = new HospitalService();
		
		hs.addHospital("care", "vikram", Arrays.asList("Feaver","Cardivo"), "9864728383", "Dubai");
		hs.addHospital("Mgm", "gandhi", Arrays.asList("Feaver","Cardivo"), "8764728533", "Aurangabad");
		hs.addHospital("lilavati", "pranay", Arrays.asList("Feaver","Cardivo"), "7564926323", "mumbai");
		hs.addHospital("aims", "sachin", Arrays.asList("Feaver","Cardivo"), "90234763123", "delhi");
		hs.addHospital("karma", "ajay", Arrays.asList("Feaver","Cardivo"), "9835467123", "pune");
		
		System.out.println(hs.getHospitals());
		
		//System.out.println(hs.getHospitalDetails(103));

	}

}
