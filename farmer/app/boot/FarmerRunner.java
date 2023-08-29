package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Farmer;
import com.xworkz.farmer.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FarmerRunner");
		String name = "Pooja";
		Land land = new Land();
		Farmer farmer = new Farmer(name);
		farmer.setLand(land);
		farmer.farming();
	}

}
