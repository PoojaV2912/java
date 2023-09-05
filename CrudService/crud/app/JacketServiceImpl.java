package com.xworkz.crud.app;

import com.xworkz.app.repository.JacketRepository;

public class JacketServiceImpl implements JacketService {
		private JacketRepository jacketRepository;
		public JacketServiceImpl(JacketRepository jacketRepository)
		{
			this.jacketRepository=jacketRepository;
		}

		@Override
		public void Wear(String brand) {
			System.out.println("invoking validateAndWear in "+this.getClass().getSimpleName());
			if(brand!=null &&!brand.isEmpty() && brand.length()>=3 &&  brand.length()<=20)
			{
				System.out.println("JacketData is Valid");
				this.jacketRepository.jacket("puma");
			}
			else {
				System.out.println("JacketData is invalid");
			}
			
		}

	}

