package com.xworkz.crud.app;

import com.xworkz.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService{
		private GroceryRepository groceryRepository;
		public GroceryServiceImpl(GroceryRepository groceryRepository) {
			this.groceryRepository=groceryRepository;
		}

		@Override
		public boolean Save(String grocery) {
			System.out.println("invoking validateAndSave in "+this.getClass().getSimpleName());
			if(grocery!=null &&!grocery.isEmpty() && grocery.length()>=3 &&  grocery.length()<=20)
			{
				System.out.println("GroceryData is Valid");
				this.groceryRepository.save(grocery);
			}
			else {
				System.out.println("GroceryData is invalid");
			}
			return false;
			
			
		}

	
}
