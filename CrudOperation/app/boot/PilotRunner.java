package com.xworkz.app.boot;

import com.xworkz.app.repository.PilotRepository;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PilotRunner");
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.speed("Pooja");
		pilotRepository.speed("Shilpa");
		pilotRepository.speed("Roopa");
		pilotRepository.speed("Harshika");
		pilotRepository.speed("Sagar");
		pilotRepository.speed("Sanju");
		pilotRepository.speed("Adhya");
		pilotRepository.speed("Shivu");
		pilotRepository.speed("Vinod");
		pilotRepository.speed("Vinmaya");
	}

}