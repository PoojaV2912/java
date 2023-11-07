package com.xworkz.app.dto;

import java.io.Serializable;

public class Pendrive implements Comparable<Pendrive> {
private String storage;
private String brand;
private Boolean secure;
private int speed;
public Pendrive(String storage, String brand, Boolean secure, int speed) {
	super();
	this.storage = storage;
	this.brand = brand;
	this.secure = secure;
	this.speed = speed;
}
public String getStorage() {
	return storage;
}
public void setStorage(String storage) {
	this.storage = storage;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Boolean getSecure() {
	return secure;
}
public void setSecure(Boolean secure) {
	this.secure = secure;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((secure == null) ? 0 : secure.hashCode());
	result = prime * result + speed;
	result = prime * result + ((storage == null) ? 0 : storage.hashCode());
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
	Pendrive other = (Pendrive) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (secure == null) {
		if (other.secure != null)
			return false;
	} else if (!secure.equals(other.secure))
		return false;
	if (speed != other.speed)
		return false;
	if (storage == null) {
		if (other.storage != null)
			return false;
	} else if (!storage.equals(other.storage))
		return false;
	return true;
}
@Override
public String toString() {
	return "Pendrive [storage=" + storage + ", brand=" + brand + ", secure=" + secure + ", speed=" + speed + "]";
}
@Override
public int compareTo(Pendrive argument) {
	Pendrive current=this;
	if(current.speed==argument.speed)
	{
	return 0;
}
	if(current.speed > argument.speed)
	{
		return 565;
	}
	if(current.speed < argument.speed) 
	{
		return -10;
	}
	throw new IllegalArgumentException("cannot compare Pendrive");
		
	}
		
	}

