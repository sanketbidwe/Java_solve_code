package com.program;

class NIT{
	String name;
	public NIT(String name) {
		this.name=name;
	}
}
class NIT1 extends NIT{
	String programmingLanguage;
	public NIT1(String programmingLanguage, String name) {
		super(name);
		this.programmingLanguage=programmingLanguage;
	}
}
class NIT2 extends NIT{
	String faculty;
	public NIT2(String faculty) {
		super("Naresh");
		this.faculty=faculty;
	}
}
class OopsTest{
public static void main(String[] args) {
	NIT nit = new NIT("Project");
	System.out.print(nit.name+" ");
	NIT1 nit1= new NIT1("Java","NareshIT");
	System.out.print(nit1.name+" "+nit1.programmingLanguage+" ");
	NIT2 nit2 = new NIT2("Naidu");
	System.out.println(nit2.name+" "+nit2.faculty);
	}
}

