package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Laptop;
import com.xworkz.farmer.app.Trainer;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LaptopRunner");
		double salary=20000;
		Laptop lap=new Laptop();
		Trainer train=new Trainer(salary);
		train.setLaptop(lap);
		train.teaching();
	}

}
