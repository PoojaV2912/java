package com.xworkz.crud.boot;

import com.xworkz.app.repository.PincodeRepository;
import com.xworkz.app.repository.PincodeRepositoryImpl;
import com.xworkz.crud.app.PincodeService;
import com.xworkz.crud.app.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in PincodeRunner");
				PincodeRepository pincodeRepository = new PincodeRepositoryImpl();
				PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);
				boolean save = pincodeService.validateAndStoreNumber(78521);
				pincodeService.validateAndStoreNumber(78521);
				pincodeService.validateAndStoreNumber(78521);

			}

		
	}


