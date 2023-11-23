package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.ShoeSize;
import com.xworkz.cracker.constants.ShoeType;

public class ShoeDTO {
private ShoeType type;
private ShoeSize size=ShoeSize.LARGE;
private Double cost;
private String brand;
public ShoeDTO(ShoeType type) {
	this.type=type;
	
}

public void setBrand(String Brand) {
	this.brand=brand;
	
}
public void setCost(Double cost) {
	this.cost=cost;
	
}

@Override
public String toString() {
	return "ShoeDTO [size=" + size + ", cost=" + cost + ", brand=" + brand + "]";
}

}