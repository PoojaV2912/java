package com.xworkz;

public class Players {
	public Building building;
	public String name;
	public String exp;
	public HomeTown town;
	public players(Building building,String name,String exp,HomeTown town) {
		this.building=building;
		this.name=name;
		this.exp=exp;
		this.town=town;
	}
	public void printInfo() {
		System.out.println("Bulding"+building);
		System.out.println("Name"+name);
		System.out.println("Exp"+exp);
		System.out.println("Town"+town);
	}
	}
