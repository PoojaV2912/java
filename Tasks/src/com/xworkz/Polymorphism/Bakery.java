package com.xworkz.Polymorphism;

public class Bakery  {
public void cake() {
	System.out.println("invoking no arg in Cake");
}
public void cake(String name) {
	System.out.println("invoking String in Cake");
}
public void cake(String name,int price) {
	System.out.println("invoking String,int in Cake");
}
}
