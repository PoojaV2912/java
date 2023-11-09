package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
private int id;
private String name;
private  double price;
private String company;
private LocalDate manufatureDate;
private LocalDate expiryDate;
private float discount;
private String description;
private float quantity;
private float ratings;
private float peopleRated;
private int peopleRatedFive;
private int peopleRatedFour;
private int peopleRatedThree;
private int peopleRatedTwo;
private int peopleRatedOne;
private String packer;
private float itemWeight;
private boolean included;
private String genericName;
private LocalDate dateFirstAvailable;
private boolean assigned;
private boolean damaged;
private String countryOfOrigin;
private int modelNO;
private int serialNo;
private boolean returnable;
private int warranty;
private String primaryDelivery;
private LocalDate deliveryExpectedDate;
private LocalDate returnBy;

public ProductDTO() {
	System.out.println("invoking no arg const..........");
}

public ProductDTO(int id, String name, double price, String company, LocalDate manufatureDate, LocalDate expiryDate,
		float discount, String description, float quantity, float ratings, float peopleRated, int peopleRatedFive,
		int peopleRatedFour, int peopleRatedThree, int peopleRatedTwo, int peopleRatedOne, String packer,
		float itemWeight, boolean included, String genericName, LocalDate dateFirstAvailable, boolean assigned,
		boolean damaged, String countryOfOrigin, int modelNO, int serialNo, boolean returnable, int warranty,
		String primaryDelivery, LocalDate deliveryExpectedDate, LocalDate returnBy) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.company = company;
	this.manufatureDate = manufatureDate;
	this.expiryDate = expiryDate;
	this.discount = discount;
	this.description = description;
	this.quantity = quantity;
	this.ratings = ratings;
	this.peopleRated = peopleRated;
	this.peopleRatedFive = peopleRatedFive;
	this.peopleRatedFour = peopleRatedFour;
	this.peopleRatedThree = peopleRatedThree;
	this.peopleRatedTwo = peopleRatedTwo;
	this.peopleRatedOne = peopleRatedOne;
	this.packer = packer;
	this.itemWeight = itemWeight;
	this.included = included;
	this.genericName = genericName;
	this.dateFirstAvailable = dateFirstAvailable;
	this.assigned = assigned;
	this.damaged = damaged;
	this.countryOfOrigin = countryOfOrigin;
	this.modelNO = modelNO;
	this.serialNo = serialNo;
	this.returnable = returnable;
	this.warranty = warranty;
	this.primaryDelivery = primaryDelivery;
	this.deliveryExpectedDate = deliveryExpectedDate;
	this.returnBy = returnBy;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public LocalDate getManufatureDate() {
	return manufatureDate;
}

public void setManufatureDate(LocalDate manufatureDate) {
	this.manufatureDate = manufatureDate;
}

public LocalDate getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(LocalDate expiryDate) {
	this.expiryDate = expiryDate;
}

public float getDiscount() {
	return discount;
}

public void setDiscount(float discount) {
	this.discount = discount;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public float getQuantity() {
	return quantity;
}

public void setQuantity(float quantity) {
	this.quantity = quantity;
}

public float getRatings() {
	return ratings;
}

public void setRatings(float ratings) {
	this.ratings = ratings;
}

public float getPeopleRated() {
	return peopleRated;
}

public void setPeopleRated(float peopleRated) {
	this.peopleRated = peopleRated;
}

public int getPeopleRatedFive() {
	return peopleRatedFive;
}

public void setPeopleRatedFive(int peopleRatedFive) {
	this.peopleRatedFive = peopleRatedFive;
}

public int getPeopleRatedFour() {
	return peopleRatedFour;
}

public void setPeopleRatedFour(int peopleRatedFour) {
	this.peopleRatedFour = peopleRatedFour;
}

public int getPeopleRatedThree() {
	return peopleRatedThree;
}

public void setPeopleRatedThree(int peopleRatedThree) {
	this.peopleRatedThree = peopleRatedThree;
}

public int getPeopleRatedTwo() {
	return peopleRatedTwo;
}

public void setPeopleRatedTwo(int peopleRatedTwo) {
	this.peopleRatedTwo = peopleRatedTwo;
}

public int getPeopleRatedOne() {
	return peopleRatedOne;
}

public void setPeopleRatedOne(int peopleRatedOne) {
	this.peopleRatedOne = peopleRatedOne;
}

public String getPacker() {
	return packer;
}

public void setPacker(String packer) {
	this.packer = packer;
}

public float getItemWeight() {
	return itemWeight;
}

public void setItemWeight(float itemWeight) {
	this.itemWeight = itemWeight;
}

public boolean isIncluded() {
	return included;
}

public void setIncluded(boolean included) {
	this.included = included;
}

public String getGenericName() {
	return genericName;
}

public void setGenericName(String genericName) {
	this.genericName = genericName;
}

public LocalDate getDateFirstAvailable() {
	return dateFirstAvailable;
}

public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
	this.dateFirstAvailable = dateFirstAvailable;
}

public boolean isAssigned() {
	return assigned;
}

public void setAssigned(boolean assigned) {
	this.assigned = assigned;
}

public boolean isDamaged() {
	return damaged;
}

public void setDamaged(boolean damaged) {
	this.damaged = damaged;
}

public String getCountryOfOrigin() {
	return countryOfOrigin;
}

public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
}

public int getModelNO() {
	return modelNO;
}

public void setModelNO(int modelNO) {
	this.modelNO = modelNO;
}

public int getSerialNo() {
	return serialNo;
}

public void setSerialNo(int serialNo) {
	this.serialNo = serialNo;
}

public boolean isReturnable() {
	return returnable;
}

public void setReturnable(boolean returnable) {
	this.returnable = returnable;
}

public int getWarranty() {
	return warranty;
}

public void setWarranty(int warranty) {
	this.warranty = warranty;
}

public String getPrimaryDelivery() {
	return primaryDelivery;
}

public void setPrimaryDelivery(String primaryDelivery) {
	this.primaryDelivery = primaryDelivery;
}

public LocalDate getDeliveryExpectedDate() {
	return deliveryExpectedDate;
}

public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
	this.deliveryExpectedDate = deliveryExpectedDate;
}

public LocalDate getReturnBy() {
	return returnBy;
}

public void setReturnBy(LocalDate returnBy) {
	this.returnBy = returnBy;
}

@Override
public String toString() {
	return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company
			+ ", manufatureDate=" + manufatureDate + ", expiryDate=" + expiryDate + ", discount=" + discount
			+ ", description=" + description + ", quantity=" + quantity + ", ratings=" + ratings + ", peopleRated="
			+ peopleRated + ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
			+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
			+ peopleRatedOne + ", packer=" + packer + ", itemWeight=" + itemWeight + ", included=" + included
			+ ", genericName=" + genericName + ", dateFirstAvailable=" + dateFirstAvailable + ", assigned="
			+ assigned + ", damaged=" + damaged + ", countryOfOrigin=" + countryOfOrigin + ", modelNO=" + modelNO
			+ ", serialNo=" + serialNo + ", returnable=" + returnable + ", warranty=" + warranty
			+ ", primaryDelivery=" + primaryDelivery + ", deliveryExpectedDate=" + deliveryExpectedDate
			+ ", returnBy=" + returnBy + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (assigned ? 1231 : 1237);
	result = prime * result + ((company == null) ? 0 : company.hashCode());
	result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
	result = prime * result + (damaged ? 1231 : 1237);
	result = prime * result + ((dateFirstAvailable == null) ? 0 : dateFirstAvailable.hashCode());
	result = prime * result + ((deliveryExpectedDate == null) ? 0 : deliveryExpectedDate.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + Float.floatToIntBits(discount);
	result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
	result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
	result = prime * result + id;
	result = prime * result + (included ? 1231 : 1237);
	result = prime * result + Float.floatToIntBits(itemWeight);
	result = prime * result + ((manufatureDate == null) ? 0 : manufatureDate.hashCode());
	result = prime * result + modelNO;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((packer == null) ? 0 : packer.hashCode());
	result = prime * result + Float.floatToIntBits(peopleRated);
	result = prime * result + peopleRatedFive;
	result = prime * result + peopleRatedFour;
	result = prime * result + peopleRatedOne;
	result = prime * result + peopleRatedThree;
	result = prime * result + peopleRatedTwo;
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((primaryDelivery == null) ? 0 : primaryDelivery.hashCode());
	result = prime * result + Float.floatToIntBits(quantity);
	result = prime * result + Float.floatToIntBits(ratings);
	result = prime * result + ((returnBy == null) ? 0 : returnBy.hashCode());
	result = prime * result + (returnable ? 1231 : 1237);
	result = prime * result + serialNo;
	result = prime * result + warranty;
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
	ProductDTO other = (ProductDTO) obj;
	if (assigned != other.assigned)
		return false;
	if (company == null) {
		if (other.company != null)
			return false;
	} else if (!company.equals(other.company))
		return false;
	if (countryOfOrigin == null) {
		if (other.countryOfOrigin != null)
			return false;
	} else if (!countryOfOrigin.equals(other.countryOfOrigin))
		return false;
	if (damaged != other.damaged)
		return false;
	if (dateFirstAvailable == null) {
		if (other.dateFirstAvailable != null)
			return false;
	} else if (!dateFirstAvailable.equals(other.dateFirstAvailable))
		return false;
	if (deliveryExpectedDate == null) {
		if (other.deliveryExpectedDate != null)
			return false;
	} else if (!deliveryExpectedDate.equals(other.deliveryExpectedDate))
		return false;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (Float.floatToIntBits(discount) != Float.floatToIntBits(other.discount))
		return false;
	if (expiryDate == null) {
		if (other.expiryDate != null)
			return false;
	} else if (!expiryDate.equals(other.expiryDate))
		return false;
	if (genericName == null) {
		if (other.genericName != null)
			return false;
	} else if (!genericName.equals(other.genericName))
		return false;
	if (id != other.id)
		return false;
	if (included != other.included)
		return false;
	if (Float.floatToIntBits(itemWeight) != Float.floatToIntBits(other.itemWeight))
		return false;
	if (manufatureDate == null) {
		if (other.manufatureDate != null)
			return false;
	} else if (!manufatureDate.equals(other.manufatureDate))
		return false;
	if (modelNO != other.modelNO)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (packer == null) {
		if (other.packer != null)
			return false;
	} else if (!packer.equals(other.packer))
		return false;
	if (Float.floatToIntBits(peopleRated) != Float.floatToIntBits(other.peopleRated))
		return false;
	if (peopleRatedFive != other.peopleRatedFive)
		return false;
	if (peopleRatedFour != other.peopleRatedFour)
		return false;
	if (peopleRatedOne != other.peopleRatedOne)
		return false;
	if (peopleRatedThree != other.peopleRatedThree)
		return false;
	if (peopleRatedTwo != other.peopleRatedTwo)
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (primaryDelivery == null) {
		if (other.primaryDelivery != null)
			return false;
	} else if (!primaryDelivery.equals(other.primaryDelivery))
		return false;
	if (Float.floatToIntBits(quantity) != Float.floatToIntBits(other.quantity))
		return false;
	if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
		return false;
	if (returnBy == null) {
		if (other.returnBy != null)
			return false;
	} else if (!returnBy.equals(other.returnBy))
		return false;
	if (returnable != other.returnable)
		return false;
	if (serialNo != other.serialNo)
		return false;
	if (warranty != other.warranty)
		return false;
	return true;
}

@Override
public int compareTo(ProductDTO o) {
	// TODO Auto-generated method stub
	return 0;
}

	
}








