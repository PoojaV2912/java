package com.xworkz.app.dto;

public class Tower implements Comparable<Tower> {
private float height;
private  String structre;
private String location;
private String purpose;
public Tower() {
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(height);
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
	result = prime * result + ((structre == null) ? 0 : structre.hashCode());
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
	Tower other = (Tower) obj;
	if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (purpose == null) {
		if (other.purpose != null)
			return false;
	} else if (!purpose.equals(other.purpose))
		return false;
	if (structre == null) {
		if (other.structre != null)
			return false;
	} else if (!structre.equals(other.structre))
		return false;
	return true;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public String getStructre() {
	return structre;
}
public void setStructre(String structre) {
	this.structre = structre;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}
public Tower(float height, String structre, String location, String purpose) {
	super();
	this.height = height;
	this.structre = structre;
	this.location = location;
	this.purpose = purpose;
}
@Override
public String toString() {
	return "Tower [height=" + height + ", structre=" + structre + ", location=" + location + ", purpose=" + purpose
			+ "]";
}
@Override
public int compareTo(Tower arguments) {
	Tower current=this;
	return current.location.compareTo(arguments.location);
	}
}



