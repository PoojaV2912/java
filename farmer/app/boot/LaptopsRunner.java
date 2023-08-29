package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Laptops;
import com.xworkz.farmer.app.Processor;

public class LaptopsRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in LaptopsRunner");
				String brand="HP";
				Processor pro=new Processor();
				Laptops lap=new Laptops(brand);
				lap.setLaptops(pro);
				lap.game();
				lap.movie();
				lap.program();
				lap.chatting();

			}

	

}
