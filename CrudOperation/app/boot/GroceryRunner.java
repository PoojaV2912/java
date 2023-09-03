package com.xworkz.app.boot;

import com.xworkz.app.repository.GroceryRepository;
import com.xworkz.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in groceryRunner");
		GroceryRepository repository=new GroceryRepositoryImpl();
		repository.save("Sugar");
		repository.save("Salt");
		repository.save("Wheat");
		repository.save("Rice");
		repository.save("Rava");
		repository.save("Oil");
		repository.save("Corn");
		repository.save("Jeera");
		repository.save("tomoto");
		repository.save("patato");
	}
	


}
