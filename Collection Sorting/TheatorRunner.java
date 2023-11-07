package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.Pendrive;
import com.xworkz.app.dto.TheatorDTO;

public class TheatorRunner {

	public static void main(String[] args) {
		System.out.println("invokiing main in pendriveRuuner");
		TheatorDTO theator = new TheatorDTO("banu", 4.5f, "hassan", "gaja");
		TheatorDTO theator1 = new TheatorDTO("palace", 5.0f," mysore", "rose");
		TheatorDTO theator2 = new TheatorDTO("navarag",4.4f, "Banglore", "bhanu");
		TheatorDTO theator3 = new TheatorDTO("guru",3.5f, "Manglore", "Kanthara");
		TheatorDTO theator4 = new TheatorDTO("navarg",4.6f, "Manday", "jeeva");

		Collection<TheatorDTO> theators=new ArrayList<TheatorDTO>();
		theators.add(theator);
		theators.add(theator1);
		theators.add(theator2);
		theators.add(theator3);
		theators.add(theator4);
		theators.stream().sorted().forEach(pen->System.out.println(pen));
		}
	}


