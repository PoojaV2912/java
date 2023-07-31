package com.xworkz;

public class Toothpaste {
	public String name;
	public String brand;
	public CompanyCEO company;
public Ingredents[] ingredents;

public Toothpaste(String name,String brand,CompanyCEO company,Ingredents[] ingredents) {
	this.name=name;
	this.brand=brand;
	this.company=company;
	this.ingredents=ingredents;
}
public void printInfo() {
	System.out.println("info of Toothpaste");
	System.out.println("name of the toothpaste "+this.name);
	System.out.println("Brand "+this.brand);
	System.out.println("Name of the company "+this.company);
	for(int index=0;index<this.ingredents.length;index++){
		Ingredents ref=ingredents[index];
		ref.printInfo();
	}
}
}
