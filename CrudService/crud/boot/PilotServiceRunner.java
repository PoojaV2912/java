package com.xworkz.crud.boot;

import com.xworkz.app.boot.PilotRepositoryImpl;
import com.xworkz.app.repository.PilotRepository;
import com.xworkz.crud.app.PilotService;
import com.xworkz.crud.app.PilotServiceImpl;

public class PilotServiceRunner {

		public static void main(String[] args) {
			System.out.println("invoking main in PilotServiceRunner");
			PilotRepository pilotRepository=new PilotRepositoryImpl();
			PilotService pilotService=new PilotServiceImpl(pilotRepository);
			pilotService.Navigate("Sagar");
		}

	
}
