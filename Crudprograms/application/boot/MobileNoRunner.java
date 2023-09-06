package com.xworkz.crud.boot;

import com.xworkz.app.repository.MobileNoRepository;
import com.xworkz.app.repository.MobileNoRepositoryImpl;
import com.xworkz.crud.app.MobileNoService;
import com.xworkz.crud.app.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in MobileNoRunner");
				MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
				MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
				boolean save=mobileNoService.validateAndStore(7845127845l);
				System.out.println(save);
				mobileNoService.validateAndStore(7845127845l);
				mobileNoService.validateAndStore(78457845l);
				

			}

		

}
