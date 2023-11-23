package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.CitizenType;
import com.xworkz.cracker.dto.CitizenTypeDTO;

public class CitizenTypeRunner {

	public static void main(String[] args) {
CitizenTypeDTO type= new CitizenTypeDTO(CitizenType.SINGLE, 12,100,"Sagar");
System.out.println(type);
System.out.println(type.getCitizenType().getLowerAgeLimit());
System.out.println(type.getCitizenType().getUpperAgeLimit());
System.out.println(type.getCitizenType().getName());
	}

}
