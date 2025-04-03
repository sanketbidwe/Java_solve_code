package com.listOfTretment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {

	private int hospitalCode = 100; 
	ArrayList<Hospital> hos = new ArrayList<Hospital>();
	
	public int addHospital( String hospitalName, String contactPerson, List<String> listOfTreatments,
			String contactNumber, String location)
	{
		
		
		hospitalCode++;
		
		hos.add(new Hospital(hospitalCode, hospitalName, listOfTreatments, contactPerson, contactNumber, location));
		return hospitalCode;
	}
	
	public Map<Integer, String> getHospitals() 
	{
		Map<Integer, String> haslist = new HashMap<Integer, String>();
		
		for(Hospital hp : hos)
		{
			haslist.put(hp.getHospitalCode(), hp.getHospitalName());
		}
	return haslist;
	}
	public Hospital getHospitalDetails(int hospitalCode)
	{
		for(Hospital hp : hos)
		{
			if(hp.getHospitalCode()==hospitalCode)
				return hp;
		}
		return null;
	}
	
	
	
	}
