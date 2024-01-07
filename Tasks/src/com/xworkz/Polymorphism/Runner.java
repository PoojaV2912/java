package com.xworkz.Polymorphism;

public class Runner {

	public static void main(String[] args) {
		System.out.println("invoking main in Runner");
		Bakery bakery = new BakeryInfo();
		bakery.cake();
		bakery.cake("Chocolate Cake");
		bakery.cake("Chocolate Cake", 50);

	}

}
