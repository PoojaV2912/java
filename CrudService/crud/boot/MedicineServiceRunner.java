package com.xworkz.crud.boot;

import com.xworkz.app.repository.MedicineRepository;
import com.xworkz.app.repository.MedicineRepositoryImpl;
import com.xworkz.crud.app.MedicineSeriviceImpl;
import com.xworkz.crud.app.MedicineService;

public class MedicineServiceRunner {
	

		public static void main(String[] args) {
			System.out.println("invoking main in MedicineRunner");
			MedicineRepository medicineRepository=new MedicineRepositoryImpl();
			MedicineService medicineService=new MedicineSeriviceImpl(medicineRepository);
			medicineService.Cure("DOLO");

		}

	
}
