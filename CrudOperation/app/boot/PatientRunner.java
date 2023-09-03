package com.xworkz.app.boot;

import com.xworkz.app.repository.PatientRepository;
import com.xworkz.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in PatientRunner");
		PatientRepository patientRepository = new PatientRepositoryImpl();
		patientRepository.place("Banglore");
		patientRepository.place("Mysore");
		patientRepository.place("Chikamagolre");
		patientRepository.place("Shimoga");
		patientRepository.place("Bhadravathi");
		patientRepository.place("RajajiNagar");
		patientRepository.place("Chitradurga");
		patientRepository.place("Chikkamagaluru");
		patientRepository.place("Davanagere");
		patientRepository.place("Hassan");
	}


	

}
