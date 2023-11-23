package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.TrainClass;

public class TrainDTO {
private TrainClass train;
private Double price;
public TrainDTO(TrainClass train, Double price) {
	super();
	this.train=train;
	this.price=price;
	
}
public TrainClass getTrain() {
	return train;
	
}
public Double getPrice() {
	return price;
	
}
public void setTrain(TrainClass train) {
	this.price=price;
	
}
@Override
public String toString() {
	return "TrainDTO [price=" + price + "]";
}

}
