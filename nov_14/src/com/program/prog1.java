package com.program;

class NIT
{
	public int nit() { 
		return 10;
	}
	
	protected  int nit1() 
	{
		return 5;
	}
}

class NIT1 extends NIT
{
	@Override
	public int nit() {
		return super.nit();
	}
	
	public int nit1() 
	{
		return 15;
	}
	
	private int nit2() 
	{
		return 20;
	}
}

class NIT2 extends NIT1
{
	public int nit() 
	{
		return 0;
		
	}
	
public	int nit1() 
	{
		return 50;
	}
}
class OopsTest
{
	public static void main(String[] args) {
		NIT object = new NIT();
		NIT object1 = new NIT1();
		NIT object2 = new NIT2();
		NIT1 object3 = new NIT2();	
		
		System.out.println(object.nit()+object1.nit1()+object1.nit()+object3.nit1()+object2.nit1());
	}
}
