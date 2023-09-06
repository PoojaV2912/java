package com.xworkz.crud.boot;

import com.xworkz.app.repository.TrainNoRepository;
import com.xworkz.app.repository.TrainNoRepositoryImpl;
import com.xworkz.crud.app.TrainNoService;
import com.xworkz.crud.app.TrainNoServiceImpl;

public class TrainNoRunner {

	

			public static void main(String[] args) {
				System.out.println("Invoking main in TrainNoRunner");
				TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();
				TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
				boolean save = trainNoService.validateAndStore(98562);
				trainNoService.validateAndStore(98562);
				trainNoService.validateAndStore(87451);

			}

	}


