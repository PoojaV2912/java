package com.xworkz.Polymorphism;

public class BakeryInfo extends Bakery {
@Override
public void cake() {
	System.out.println("Overridng cake in bakeryInfo");
	super.cake();
}
@Override
	public void cake(String name) {
		// TODO Auto-generated method stub
		super.cake(name);
	}
@Override
	public void cake(String name, int price) {
		// TODO Auto-generated method stub
		super.cake(name, price);
	}
}
