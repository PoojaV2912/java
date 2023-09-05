package com.xworkz.crud.boot;

import com.xworkz.app.repository.HistoricalPlacesRepository;
import com.xworkz.app.repository.HistoricalPlacesRepositoryImpl;
import com.xworkz.crud.app.HistoricalPlacesService;
import com.xworkz.crud.app.HistoricalPlacesServiceImpl;

public class HistoricalServiceRunner {
	

		public static void main(String[] args) {
			System.out.println("invoking main HistoricalServiceRunner");
			HistoricalPlacesRepository historicalPlaceRepository=new HistoricalPlacesRepositoryImpl();
			HistoricalPlacesService historicalService=new HistoricalPlacesServiceImpl(historicalPlaceRepository);
			historicalService.Travel("Chikamanglore");

		}

	}

