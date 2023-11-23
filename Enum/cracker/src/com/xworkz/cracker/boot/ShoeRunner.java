package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.ShoeType;
import com.xworkz.cracker.dto.ShoeDTO;

public class ShoeRunner {

	public static void main(String[] args) {
ShoeDTO shoe = new ShoeDTO(ShoeType.FLIP_FLOP);
shoe.setBrand("puma");
shoe.setCost(3500D);
System.out.println(shoe);
	}

}
