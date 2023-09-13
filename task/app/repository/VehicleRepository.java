package com.xworkz.task.app.repository;

import com.xworkz.task.app.dto.VehicleDTO;

public interface VehicleRepository {
	int TOTAL_ITEMS=10;
	void save(VehicleDTO dto);

}
