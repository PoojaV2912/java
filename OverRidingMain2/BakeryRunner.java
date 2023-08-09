package OverRidingMain2;

import OverRiding2.Bakery;
import OverRiding2.Cake;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Bakery Runner");
		Bakery bakery=new Bakery();
		bakery.sweet();
		bakery.sweet("RJB", 8, "Both");
		bakery.sweet("SJR", 5, "Bangalore", "Veg", 10);
		Bakery bakery1=new Cake();
		bakery1.sweet("Mukundha", 5);
		bakery1.sweet();
		bakery1.sweet("Ashok", 10, "hassan", "veg", 6);
	}

}
	
