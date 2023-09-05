package com.xworkz.crud.boot;

import com.xworkz.app.repository.GroceryRepository;
import com.xworkz.app.repository.GroceryRepositoryImpl;
import com.xworkz.crud.app.GroceryService;
import com.xworkz.crud.app.GroceryServiceImpl;

public class GroceryServiceRunner {
	

		public static void main(String[] args) {
			System.out.println("invoking main in GroceryServiceRunner");
			GroceryRepository groceryRepository=new GroceryRepositoryImpl();
			GroceryService groceryService=new GroceryServiceImpl(groceryRepository);
			groceryService.Save("geera");
			

		}

	
}
