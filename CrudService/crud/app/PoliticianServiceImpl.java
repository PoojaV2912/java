package com.xworkz.crud.app;

import com.xworkz.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService {
		private PoliticianRepository politicianRepository;
		public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
			this.politicianRepository=politicianRepository;
		}

		@Override
		public void Rule(String name) {
			System.out.println("invoking validateAndRule in "+this.getClass().getSimpleName());
			if(name!=null &&!name.isEmpty() && name.length()>=3 &&  name.length()<=20)
			{
				System.out.println("PoliticianData is Valid");
				this.politicianRepository.rule(name);
			}
			else {
				System.out.println("PoliticianData is invalid");
			}
			
		}

	}

