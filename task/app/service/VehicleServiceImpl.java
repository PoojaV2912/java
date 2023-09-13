package com.xworkz.task.app.service;

import com.xworkz.task.app.dto.VehicleDTO;
import com.xworkz.task.app.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;

	}

	@Override
	public boolean validateAndSave(VehicleDTO dto) {
		System.out.println("dto" + dto + "items position" + this.getClass().getSimpleName());
		if (dto != null) {
			String name = dto.getName();
			String colour = dto.getColour();
			String brand = dto.getBrand();
			double cost = dto.getCost();
			String driverName = dto.getDriverName();
			int milage = dto.getMilage();
			String showroomName = dto.getShowroomName();
			String materials = dto.getMaterials();
			boolean numberPlate = dto.isNumberPlate();
			boolean license = dto.isLicense();
			boolean insurance = dto.isInsurance();
			String engineName = dto.getEngineName();
			String types = dto.getTypes();
			int gear = dto.getGear();
			boolean horn = dto.isHorn();
			int speed = dto.getSpeed();
			String battery = dto.getBattery();
			boolean mirror = dto.isMirror();
			String indicator = dto.getIndicator();
			String fuel = dto.getFuel();
			int wheel = dto.getWheel();
			String seat = dto.getSeat();
			String handle = dto.getHandle();
			String headlight = dto.getHeadlight();
			int km = dto.getKm();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}
			if (colour != null && !colour.isEmpty() && colour.length() > 3 && colour.length() < 20) {
				System.out.println("colour is valid");
			} else {
				System.err.println("colour is invalid");
				return false;
			}
			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
				System.out.println("brand is valid");
			} else {
				System.err.println("brand is invalid");
				return false;
			}

			if (cost != 0 && cost > 100) {
				System.out.println("cost is valid");
			} else {
				System.err.println("cost is invalid");
				return false;
			}
			if (driverName != null && !driverName.isEmpty() && driverName.length() > 3 && driverName.length() < 20) {
				System.out.println("driverName is valid");
			} else {
				System.err.println("driverName is invalid");
				return false;

			}
			if (milage != 0 && milage > 100) {
				System.out.println("milage is valid");
			} else {
				System.err.println("milage is invalid");
				return false;
			}
			if (showroomName != null && !showroomName.isEmpty() && showroomName.length() > 3
					&& showroomName.length() < 20) {
				System.out.println("showroomName is valid");
			} else {
				System.err.println("showroomName is invalid");
				return false;

			}
			if (materials != null && !materials.isEmpty() && materials.length() > 3 && materials.length() < 20) {
				System.out.println("materials is valid");
			} else {
				System.err.println("materials is invalid");
				return false;

			}
			if (numberPlate != true && numberPlate == false) {
				System.out.println("numberPlate is valid");
			} else {
				System.err.println("numberPlate is invalid");
				return false;
			}

			if (license != true && license == false) {
				System.out.println("license is valid");
			} else {
				System.err.println("license is invalid");
				return false;
			}

			if (insurance != true && insurance == false) {
				System.out.println("insurance is valid");
			} else {
				System.err.println("insurance is invalid");
				return false;
			}
			if (engineName != null && !engineName.isEmpty() && engineName.length() > 3 && engineName.length() < 20) {
				System.out.println("engineName is valid");
			} else {
				System.err.println("engineName is invalid");
				return false;

			}

			if (types != null && !types.isEmpty() && types.length() > 3 && types.length() < 20) {
				System.out.println("types is valid");
			} else {
				System.err.println("types is invalid");
				return false;
			}
			if (gear != 0 && gear > 100) {
				System.out.println("gear is valid");
			} else {
				System.err.println("gear is invalid");
				return false;
			}
			if (horn != true && horn == false) {
				System.out.println("horn is valid");
			} else {
				System.err.println("horn is invalid");
				return false;
			}
			if (speed != 0 && speed > 100) {
				System.out.println("speed is valid");
			} else {
				System.err.println("speed is invalid");
				return false;
			}
			if (battery != null && !battery.isEmpty() && battery.length() > 3 && battery.length() < 20) {
				System.out.println("battery is valid");
			} else {
				System.err.println("battery is invalid");
				return false;
			}
			if (mirror != true && mirror == false) {
				System.out.println("mirror is valid");
			} else {
				System.err.println("mirror is invalid");
				return false;
			}
			if (indicator != null && !indicator.isEmpty() && indicator.length() > 3 && indicator.length() < 20) {
				System.out.println("indicator is valid");
			} else {
				System.err.println("indicator is invalid");
				return false;
			}
			if (fuel != null && !fuel.isEmpty() && fuel.length() > 3 && fuel.length() < 20) {
				System.out.println("fuel is valid");
			} else {
				System.err.println("fuel is invalid");
				return false;
			}
			if (wheel != 0 && wheel > 100) {
				System.out.println("wheel is valid");
			} else {
				System.err.println("wheel is invalid");
				return false;
			}
			if (seat != null && !seat.isEmpty() && seat.length() > 3 && seat.length() < 20) {
				System.out.println("seat is valid");
			} else {
				System.err.println("seat is invalid");
				return false;
			}
			if (handle != null && !handle.isEmpty() && handle.length() > 3 && handle.length() < 20) {
				System.out.println("handle is valid");
			} else {
				System.err.println("handle is invalid");
				return false;
			}
			if (headlight != null && !headlight.isEmpty() && headlight.length() > 3 && headlight.length() < 20) {
				System.out.println("headlight is valid");
			} else {
				System.err.println("headlight is invalid");
				return false;
			}
			if (km != 0 && km > 100) {
				System.out.println("km is valid");
			} else {
				System.err.println("km is invalid");
				return false;
			}
		}
		return false;

	}
}
