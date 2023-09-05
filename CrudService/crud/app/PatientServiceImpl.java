package com.xworkz.crud.app;

import com.xworkz.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {
		private PatientRepository patientRepository;
		public PatientServiceImpl(PatientRepository patientRepository) {
			this.patientRepository=patientRepository;
		}

		@Override
		public void Cure(String patientName) {
			System.out.println("invoking validateAndCure in "+this.getClass().getSimpleName());
			if(patientName!=null &&!patientName.isEmpty() && patientName.length()>=3 &&  patientName.length()<=20)
			{
				System.out.println("PatientData is Valid");
				this.patientRepository.place("pooja");
			}
			else {
				System.out.println("PatientData is invalid");
			}
			
		}

	}

