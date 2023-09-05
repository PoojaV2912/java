package com.xworkz.crud.app;

import com.xworkz.app.repository.HistoricalPlacesRepository;

public class HistoricalPlacesServiceImpl implements HistoricalPlacesService {
		private HistoricalPlacesRepository historicalPlaceRepository;
		public HistoricalPlacesServiceImpl(HistoricalPlaceRepository historicalPlaceRepository) {
			this.historicalPlacesRepository=historicalPlacesRepository;
		}

		@Override
		public boolean Travel(String name) {
			System.out.println("invoking validateAndTravel in " +this.getClass().getSimpleName());
			if(name!=null &&!name.isEmpty() && name.length()>=3 &&  name.length()<=20)
			{
				System.out.println("TravelData is Valid");
				this.historicalPlacesRepository.travel(name);
			}
			else {
				System.out.println("TravelData is invalid");
			}
			return false;
		}

	}

