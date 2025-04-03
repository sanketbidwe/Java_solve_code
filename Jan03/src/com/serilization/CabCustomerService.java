package com.serilization;

import java.util.ArrayList;

public class CabCustomerService
{
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    public void addCabCustomer(CabCustomer customer)
    {
    	
        customerList.add(customer);
    }
    
    public boolean isFirstCustomer(CabCustomer customer){
    	int customerCount=0;
    	
    	for(CabCustomer cab:customerList)
    	{
    		if(cab.getPhone().equals(customer.getPhone()))
    		{
    			customerCount++;
    		}
    	}
		return customerCount==1;
    	
    }
    
    public int  calculateBill(CabCustomer customer )
    {
    	if(isFirstCustomer(customer))
    	{
    		return 0;
    	}
    	else if(customer.getDistance()<=4)
    	{
    		return 80;
    	}
    	else
    	{
    		return 80+(customer.getDistance()-4*6);
    
       }
    }
    
    public void printBill(CabCustomer customer)
    {
    	System.out.println(customer.getCustomerName()+"plese pay your billof rs"+calculateBill(customer));
    }
}
