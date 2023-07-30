package com.xworkz;

public class Browser {
	public Internet internet;
	public void company() {
		if(this.internet!=null) {
			this.internet.network();
			System.out.println("invoking network in Browser");
		}
		else {
			System.err.println("not invokong network in Browser");
		}
	}
	public void name() {
		if(this.internet!=null) {
			this.internet.useage();
			System.out.println("invoking useage in Browser");
		}
		else {
			System.err.println("not invoking useage in Browser");
		}
	}

}



