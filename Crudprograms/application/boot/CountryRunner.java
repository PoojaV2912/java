package com.xworkz.crud.boot;

import com.xworkz.app.repository.CountryRepository;
import com.xworkz.app.repository.CountryRepositoryImpl;
import com.xworkz.crud.app.CountryService;
import com.xworkz.crud.app.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in CountryRunner");
				CountryRepository countryRepository = new CountryRepositoryImpl();
				CountryService countryService = new CountryServiceImpl(countryRepository);
				boolean store = countryService.validateAndStore("India");
				System.out.println(store);
				countryService.validateAndStore("India");
				countryService.validateAndStore("America");

		
	}

}
