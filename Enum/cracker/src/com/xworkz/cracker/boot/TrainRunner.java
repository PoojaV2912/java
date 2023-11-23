package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.TrainClass;
import com.xworkz.cracker.dto.TrainDTO;

public class TrainRunner {

	public static void main(String[] args) {
TrainDTO  dto =new TrainDTO(TrainClass.SECOND_CLASS, 1500D);
System.out.println(dto);
System.out.println(dto.getTrain().getPrice());
	}

}
