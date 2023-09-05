package com.xworkz.crud.boot;

import com.xworkz.app.repository.PatientRepository;
import com.xworkz.app.repository.PatientRepositoryImpl;
import com.xworkz.crud.app.PatientService;
import com.xworkz.crud.app.PatientServiceImpl;

public class PatientServiceRunner {

	
		
			public static void main(String[] args) {
				System.out.println("invoking main in PatientServiceRunner");
				PatientRepository patientRepository=new PatientRepositoryImpl();
				PatientService patientService=new PatientServiceImpl(patientRepository);
				patientService.Cure("Pooja");

			
	}

}
