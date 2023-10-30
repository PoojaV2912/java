package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AlcoholDTO implements Serializable{
private int id;
private String  alcoholName;
private boolean isAlcoholic;
private float   alcoholPercentage;
private int   alcoholVolume;
private char    alcoholCategory;
private long    productionYear;
private double  alcoholPrice;
private LocalDate expiryDate;
private LocalDateTime  ManfDate;

public AlcoholDTO() {
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAlcoholName() {
	return alcoholName;
}

public void setAlcoholName(String alcoholName) {
	this.alcoholName = alcoholName;
}

public boolean isAlcoholic() {
	return isAlcoholic;
}

public void setAlcoholic(boolean isAlcoholic) {
	this.isAlcoholic = isAlcoholic;
}

public float getAlcoholPercentage() {
	return alcoholPercentage;
}

public void setAlcoholPercentage(float alcoholPercentage) {
	this.alcoholPercentage = alcoholPercentage;
}

public int getAlcoholVolume() {
	return alcoholVolume;
}

public void setAlcoholVolume(int alcoholVolume) {
	this.alcoholVolume = alcoholVolume;
}

public char getAlcoholCategory() {
	return alcoholCategory;
}

public void setAlcoholCategory(char alcoholCategory) {
	this.alcoholCategory = alcoholCategory;
}

public long getProductionYear() {
	return productionYear;
}

public void setProductionYear(long productionYear) {
	this.productionYear = productionYear;
}

public double getAlcoholPrice() {
	return alcoholPrice;
}

public void setAlcoholPrice(double alcoholPrice) {
	this.alcoholPrice = alcoholPrice;
}

public LocalDate getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(LocalDate expiryDate) {
	this.expiryDate = expiryDate;
}

public LocalDateTime getManfDate() {
	return ManfDate;
}

public void setManfDate(LocalDateTime manfDate) {
	ManfDate = manfDate;
}

public AlcoholDTO(int id, String alcoholName, boolean isAlcoholic, float alcoholPercentage, int alcoholVolume,
		char alcoholCategory, long productionYear, double alcoholPrice, LocalDate expiryDate, LocalDateTime manfDate) {
	super();
	this.id = id;
	this.alcoholName = alcoholName;
	this.isAlcoholic = isAlcoholic;
	this.alcoholPercentage = alcoholPercentage;
	this.alcoholVolume = alcoholVolume;
	this.alcoholCategory = alcoholCategory;
	this.productionYear = productionYear;
	this.alcoholPrice = alcoholPrice;
	this.expiryDate = expiryDate;
	ManfDate = manfDate;
}

@Override
public String toString() {
	return "AlcoholDTO [id=" + id + ", alcoholName=" + alcoholName + ", isAlcoholic=" + isAlcoholic
			+ ", alcoholPercentage=" + alcoholPercentage + ", alcoholVolume=" + alcoholVolume + ", alcoholCategory="
			+ alcoholCategory + ", productionYear=" + productionYear + ", alcoholPrice=" + alcoholPrice
			+ ", expiryDate=" + expiryDate + ", ManfDate=" + ManfDate + "]";
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AlcoholDTO other = (AlcoholDTO) obj;
	if (ManfDate == null) {
		if (other.ManfDate != null)
			return false;
	} else if (!ManfDate.equals(other.ManfDate))
		return false;
	if (alcoholCategory != other.alcoholCategory)
		return false;
	if (alcoholName == null) {
		if (other.alcoholName != null)
			return false;
	} else if (!alcoholName.equals(other.alcoholName))
		return false;
	if (Float.floatToIntBits(alcoholPercentage) != Float.floatToIntBits(other.alcoholPercentage))
		return false;
	if (Double.doubleToLongBits(alcoholPrice) != Double.doubleToLongBits(other.alcoholPrice))
		return false;
	if (alcoholVolume != other.alcoholVolume)
		return false;
	if (expiryDate == null) {
		if (other.expiryDate != null)
			return false;
	} else if (!expiryDate.equals(other.expiryDate))
		return false;
	if (id != other.id)
		return false;
	if (isAlcoholic != other.isAlcoholic)
		return false;
	if (productionYear != other.productionYear)
		return false;
	return true;
}

}