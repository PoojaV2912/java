package com.xworkz.app.boot;

import com.xworkz.app.repository.HistoricalPlacesRepository;
import com.xworkz.app.repository.HistoricalPlacesRepositoryImpl;

public class HistoricalPlacesRunner {

	public static void main(String[] args) {
		
		
				System.out.println("Invoking main in HistoricalPlaceRunner");
				HistoricalPlacesRepository historicalPlace = new HistoricalPlacesRepositoryImpl();
				historicalPlace.place("JogFalls");
				historicalPlace.place("Dharmastala");
				historicalPlace.place("Amruthapura");
				historicalPlace.place("Hampi");
				historicalPlace.place("Aihole");
				historicalPlace.place("Muradeshwara");
				historicalPlace.place("Horanadu");
				historicalPlace.place("Shivagange");
				historicalPlace.place("Halebidu");
				historicalPlace.place("Mysore");

			
	}

}
