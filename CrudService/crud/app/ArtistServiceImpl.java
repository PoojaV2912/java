package com.xworkz.crud.app;

import com.xworkz.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService {
		private ArtistRepository artistRepository;
		public ArtistServiceImpl(ArtistRepository artistRepository) {
			this.artistRepository = artistRepository;
		}

		@Override
		public void validateAndEntertain(String name) {
			System.out.println("invoking validateAndEntertain in" +this.getClass().getSimpleName());
			if(name!=null &&!name.isEmpty() && name.length()>=3 &&  name.length()<=20)
			{
				System.out.println("ArtistData id Valid");
				this.artistRepository.entertain(name);
			}
			else {
				System.out.println("ArtistData is invalid");
			}
		

	