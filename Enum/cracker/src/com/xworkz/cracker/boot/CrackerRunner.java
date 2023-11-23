package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.CrackerType;
import com.xworkz.cracker.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
CrackerDTO cracker =new CrackerDTO(CrackerType.ATOM_BOMB);
cracker.setName("Lakshmi");
cracker.setPrice(300D);
System.out.println(cracker);
	}

}
