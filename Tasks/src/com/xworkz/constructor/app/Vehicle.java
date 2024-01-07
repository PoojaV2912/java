package com.xworkz.constructor.app;

public class Vehicle {
	static String name;
	Vehicle (){
		name="cycle";
		System.out.println(name);
	}

	public static void bike() {
		System.out.println("invoking bike in vehicle");
		
	}
	public void car() {
		bike();
		System.out.println("invoking car in vehicle");
	}

}
