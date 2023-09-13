package com.xworkz.task.app.repository;

import com.xworkz.task.app.dto.VehicleDTO;

public class VehicleRepositoryImpl implements VehicleRepository {
	private VehicleDTO[] dtos = new VehicleDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(VehicleDTO dto) {
		System.out.println("invoking save() in VehicleRepositoryImpl ");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println("dto" + dto + "items position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full,please select another one");
		}

	}
}