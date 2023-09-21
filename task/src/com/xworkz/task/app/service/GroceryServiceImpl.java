package com.xworkz.task.app.service;

import com.xworkz.task.app.dto.GroceryDTO;
import com.xworkz.task.app.repository.GroceryReopsitory;

public class GroceryServiceImpl implements GroceryService {
	private GroceryReopsitory  groceryRepository;

	public GroceryServiceImpl(GroceryReopsitory groceryRepository) {
		this.groceryRepository=groceryRepository;
	}


	
	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("dto" + dto + "items position" + this.getClass().getSimpleName());
		if (dto != null) {
			String rice = dto.getRice();
			String brand = dto.getBrand();
			int price = dto.getPrice();
			String shopName =dto.getShopName();
			String type = dto.getType();
			double weight = dto.getWeight();
			double fat = dto.getFat();
			double fiber = dto.getFiber();
			int quantity = dto.getQuantity();
			double manganese=dto.getManganese();
			
			if (rice != null && !rice.isEmpty() && rice.length() > 3 && rice.length() < 20) {
				System.out.println("rice is valid");
			} else {
				System.err.println("rice is invalid");
				return false;
			}
			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
				System.out.println("brand is valid");
			} else {
				System.err.println("brand is invalid");
				return false;
			
			}

			if (price != 0 && price > 100) {
				System.out.println("price is valid");
			} else {
				System.err.println("price is invalid");
				return false;
			}
			if (shopName != null && !shopName.isEmpty() && shopName.length() > 3 && shopName.length() < 20) {
				System.out.println("shopName is valid");
			} else {
				System.err.println("shopName is invalid");
				return false;

			}
			if (type != null && !type.isEmpty() && type.length() > 3 && type.length() < 20) {
				System.out.println("type is valid");
			} else {
				System.err.println("type is invalid");
				return false;
			}
			if (weight != 0 && weight > 100) {
				System.out.println("weight is valid");
			} else {
				System.err.println("weight is invalid");
				return false;
			}
		
		if (fat != 0 && fat > 100) {
			System.out.println("fat is valid");
		} else {
			System.err.println("fat is invalid");
			return false;
		}
		
	
	if (fiber != 0 && fiber > 100) {
		System.out.println("fiber is valid");
	} else {
		System.err.println("fiber is invalid");
		return false;
	}
	

if (quantity != 0 && quantity > 100) {
	System.out.println("quantity is valid");
} else {
	System.err.println("quantity is invalid");
	return false;
}


if (manganese != 0 && manganese > 100) {
	System.out.println("manganese is valid");
} else {
	System.err.println("manganese is invalid");
	return false;
}
		}
	}
}
			