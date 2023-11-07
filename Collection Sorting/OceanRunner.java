package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.OceanDTO;
import com.xworkz.app.dto.RobotDTO;

public class OceanRunner {

	public static void main(String[] args) {
		System.out.println("invokiing main in pendriveRuuner");
		OceanDTO ocean = new OceanDTO("Antractic",2.5f, true,"plastic" );
		OceanDTO ocean1 = new OceanDTO("atlantic",3.6f,false, "metals");
		OceanDTO ocean2 = new OceanDTO("arctic",4.5f, true,"sewage");
		OceanDTO ocean3 = new OceanDTO("sophia",2.3f, false,"thrmal");
		OceanDTO ocean4 = new OceanDTO("indian",1.6f, true, "wasteage");

		Collection<OceanDTO> oceans=new ArrayList<OceanDTO>();
		oceans.add(ocean);
		oceans.add(ocean1);
		oceans.add(ocean2);
		oceans.add(ocean3);
		oceans.add(ocean4);
		oceans.stream().sorted().forEach(pen->System.out.println(pen));
		}
	}



	

	


