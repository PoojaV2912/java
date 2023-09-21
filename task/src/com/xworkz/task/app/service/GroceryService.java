package com.xworkz.task.app.service;

import com.xworkz.task.app.dto.GroceryDTO;

public interface GroceryService {
boolean validateAndSave(GroceryDTO dto);
default boolean isExist(GroceryDTO dto) {
	return false;
}
default GroceryDTO findByBrand(String brand) {
	return null;
}
}
