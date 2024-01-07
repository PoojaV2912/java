package com.xworkz.Polymorphism;                         //encapulation

public class ERunner {

	public static void main(String[] args) {
	Amazon amazon =new Amazon();
amazon.setNoOfUsers(40);
amazon.setPrice(50);
amazon.setUserName("pooja");
System.out.println(amazon.getNoOfUsers());
System.out.println(amazon.getPrice());
System.out.println(amazon.getUserName());
	}

}
