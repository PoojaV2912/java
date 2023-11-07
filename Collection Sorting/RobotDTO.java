package com.xworkz.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{
	private String robotName;
	private String sensing;
	private Boolean safty;
	private int price;
	public RobotDTO(String robotName, String sensing, Boolean safty, int price) {
		super();
		this.robotName = robotName;
		this.sensing = sensing;
		this.safty = safty;
		this.price = price;
	}
	public String getRobotName() {
		return robotName;
	}
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	public String getSensing() {
		return sensing;
	}
	public void setSensing(String sensing) {
		this.sensing = sensing;
	}
	public Boolean getSafty() {
		return safty;
	}
	public void setSafty(Boolean safty) {
		this.safty = safty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((robotName == null) ? 0 : robotName.hashCode());
		result = prime * result + ((safty == null) ? 0 : safty.hashCode());
		result = prime * result + ((sensing == null) ? 0 : sensing.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotDTO other = (RobotDTO) obj;
		if (price != other.price)
			return false;
		if (robotName == null) {
			if (other.robotName != null)
				return false;
		} else if (!robotName.equals(other.robotName))
			return false;
		if (safty == null) {
			if (other.safty != null)
				return false;
		} else if (!safty.equals(other.safty))
			return false;
		if (sensing == null) {
			if (other.sensing != null)
				return false;
		} else if (!sensing.equals(other.sensing))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RobotDTO [robotName=" + robotName + ", sensing=" + sensing + ", safty=" + safty + ", price=" + price
				+ "]";
	}
	@Override
	public int compareTo(RobotDTO argument) {
		RobotDTO current=this;
		return current.sensing.compareTo(argument.sensing);
		}
}
	
