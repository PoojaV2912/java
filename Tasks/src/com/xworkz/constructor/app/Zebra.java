package com.xworkz.constructor.app;

public class Zebra extends Animal {
@Override
public void lion() {
	System.out.println("invoking lion in zebra");
	super.lion();
}
@Override
	protected void dog() {
	System.out.println("invoking dog in zebra");
		super.dog();
	}
@Override
	void cat() {
System.out.println("invoking cat in zebra");	
super.cat();
	}
}

