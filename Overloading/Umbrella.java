package Overloading;

public class Umbrella {
	public String color;
	public double price;
	public String use;
	public boolean rain() {
		System.out.println("invoking with no argument in Umbrella");
		rain(color,price,use);
		return true;
	}
	public void rain(String color,double price,String use) {
		System.out.println("invoking with String doublr and String argument in Umbrella");
		
	}
	public void rain(String color) {
		System.out.println("invoking with String argument in Umbrella");
		
	}
	public void rain(String color,double price) {
		System.out.println("invoking with String doublr  argument in Umbrella");
		rain();
	}
	}


