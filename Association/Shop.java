package com.xworkz;

public class Shop {
	public Salesman salesman;
	public void company() {
		if(this.salesman!=null) {
			this.salesman.selling();
			System.out.println("invoking selling in Shop");
		}
		else {
			System.err.println("not invokong selling in Shop");
		}
	}
	public void location() {
		if(this.salesman!=null) {
			this.salesman.products();
			System.out.println("invoking products in shop");
		}
		else {
			System.err.println("not invoking products in shop");
		}
	}

}


