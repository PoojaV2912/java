package com.xworkz.crud.boot;

import com.xworkz.app.repository.JacketRepository;
import com.xworkz.app.repository.JacketRepositoryImpl;
import com.xworkz.crud.app.JacketService;
import com.xworkz.crud.app.JacketServiceImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in JacketServiceRunner");
				JacketRepository jacketRepository=new JacketRepositoryImpl();
				JacketService jacketService=new JacketServiceImpl(jacketRepository);
				jacketService.Wear("puma");

			}

		
	}


