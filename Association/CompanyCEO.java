package com.xworkz;

public class CompanyCEO {
public String name;
public String ceo;
public String originCountry;
public CompanyCEO(String name,String ceo,String origincountry) {
	this.name=name;
	this.ceo=ceo;
	this.originCountry=originCountry;
}
public void printInfo() {
	System.out.println("Name "+name);
	System.out.println("Name of ceo "+ceo);
    System.out.println("Origin Country "+originCountry);
	}
}

