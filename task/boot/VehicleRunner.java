package com.xworkz.task.boot;

import com.xworkz.task.app.dto.VehicleDTO;
import com.xworkz.task.app.repository.VehicleRepository;
import com.xworkz.task.app.repository.VehicleRepositoryImpl;
import com.xworkz.task.app.service.VehicleService;
import com.xworkz.task.app.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in VehicleRunner");
		VehicleRepository repo=new VehicleRepositoryImpl();
		VehicleService service=new VehicleServiceImpl(repo);
		VehicleDTO dto=new VehicleDTO("Honda", "white", "takeo", 50000, "sagar", 20, "susuki", "steel", false, true, false, "vast", "shine", 3, true, 50, "esBattey", false, "ind", "gasoline", 2,"royal", "flat", "xenon", 100);
		boolean saved=service.validateAndSave(dto);
		System.out.println("persisted"+saved);
	}



}
