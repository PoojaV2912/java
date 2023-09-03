package com.xworkz.app.boot;

import com.xworkz.app.repository.MedicineRepository;
import com.xworkz.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in MedicineRunner");
				MedicineRepository medicineRepository = new MedicineRepositoryImpl();
				medicineRepository.name("Paracetamol");
				medicineRepository.name("Amoxicilin");
				medicineRepository.name("Quinine");
				medicineRepository.name("Cipla");
				medicineRepository.name("ChestonCold");
				medicineRepository.name("Dolo");
				medicineRepository.name("ColdCop");
				medicineRepository.name("Citrizine");
				medicineRepository.name("Omaze");
				medicineRepository.name("Diclofenac");
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
