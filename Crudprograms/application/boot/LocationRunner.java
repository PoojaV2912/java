package com.xworkz.crud.boot;

import com.xworkz.app.repository.LocationRepository;
import com.xworkz.app.repository.LocationRepositoryImpl;
import com.xworkz.crud.app.LocationService;
import com.xworkz.crud.app.LocationServiceImpl;

public class LocationRunner {

	

			public static void main(String[] args) {
				System.out.println("Invoking main in LocationRunner");
				LocationRepository locationRepository = new LocationRepositoryImpl();
				LocationService locationService = new LocationServiceImpl(locationRepository);
				boolean save = locationService.validateAndStoreLocation("Banglore");
				System.out.println(save);
				locationService.validateAndStoreLocation("Banglore");
				locationService.validateAndStoreLocation("Hassan");

			}

		
	}


