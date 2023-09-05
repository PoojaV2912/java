package com.xworkz.crud.app;

import com.xworkz.app.repository.PilotRepository;

public class PilotServiceImpl implements PilotService {
		private PilotRepository pilotRepository;
		public PilotServiceImpl(PilotRepository pilotRepository) {
			this.pilotRepository=pilotRepository;
		}

		@Override
		public void Navigate(String qualification) {
			System.out.println("invoking validateAndNavigate in "+this.getClass().getSimpleName());
			if(qualification!=null &&!qualification.isEmpty() && qualification.length()>=3 &&  qualification.length()<=20)
			{
				System.out.println("PilotData is Valid");
				this.pilotRepository.navigate(qualification);
			}
			else {
				System.out.println("PilotData is invalid");
			}
			
		}

	}

