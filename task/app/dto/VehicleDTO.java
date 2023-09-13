package com.xworkz.task.app.dto;

import java.io.Serializable;

public class VehicleDTO implements Serializable {
	private String name;
	private String colour;
	private String brand;
	private double cost;
	private String driverName;
	private int milage;
	private String showroomName;
	private String materials;
	private boolean numberPlate;
	private boolean license;
	private boolean insurance;
	private String engineName;
	private String types;
	private int gear;
	private boolean horn;
	private int speed;
	private String battery;
	private boolean mirror;
	private String indicator;
	private String fuel;
	private int wheel;
	private String seat;
	private String handle;
	private String headlight;
	private int km;

	public VehicleDTO() {
		System.out.println("invoking no_arg const in VehicleDTO");
	}

	public VehicleDTO(String name, String colour, String brand, double cost, String driverName, int milage,
			String showroomName, String materials, boolean numberPlate, boolean license, boolean insurance,
			String engineName, String types, int gear, boolean horn, int speed, String battery, boolean mirror,
			String indicator, String fuel, int wheel, String seat, String handle, String headlight, int km) {
		super();
		this.name = name;
		this.colour = colour;
		this.brand = brand;
		this.cost = cost;
		this.driverName = driverName;
		this.milage = milage;
		this.showroomName = showroomName;
		this.materials = materials;
		this.numberPlate = numberPlate;
		this.license = license;
		this.insurance = insurance;
		this.engineName = engineName;
		this.types = types;
		this.gear = gear;
		this.horn = horn;
		this.speed = speed;
		this.battery = battery;
		this.mirror = mirror;
		this.indicator = indicator;
		this.fuel = fuel;
		this.wheel = wheel;
		this.seat = seat;
		this.handle = handle;
		this.headlight = headlight;
		this.km = km;
	}

	@Override
	public String toString() {
		return "VehicleDTO [name=" + name + ", colour=" + colour + ", brand=" + brand + ", cost=" + cost
				+ ", driverName=" + driverName + ", milage=" + milage + ", showroomName=" + showroomName
				+ ", materials=" + materials + ", numberPlate=" + numberPlate + ", license=" + license + ", insurance="
				+ insurance + ", engineName=" + engineName + ", types=" + types + ", gear=" + gear + ", horn=" + horn
				+ ", speed=" + speed + ", battery=" + battery + ", mirror=" + mirror + ", indicator=" + indicator
				+ ", fuel=" + fuel + ", wheel=" + wheel + ", seat=" + seat + ", handle=" + handle + ", headlight="
				+ headlight + ", km=" + km + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public String getShowroomName() {
		return showroomName;
	}

	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public boolean isNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(boolean numberPlate) {
		this.numberPlate = numberPlate;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public boolean isInsurance() {
		return insurance;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public boolean isHorn() {
		return horn;
	}

	public void setHorn(boolean horn) {
		this.horn = horn;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public boolean isMirror() {
		return mirror;
	}

	public void setMirror(boolean mirror) {
		this.mirror = mirror;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getHeadlight() {
		return headlight;
	}

	public void setHeadlight(String headlight) {
		this.headlight = headlight;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof VehicleDTO) {
				System.out.println("object is vehicleDTO");
			}
			VehicleDTO casted = (VehicleDTO) obj;
			if (casted.name.equals(obj) && casted.colour.equals(obj)) {
				System.out.println("instance is same");
			} else {
				System.err.println("instance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}
}
