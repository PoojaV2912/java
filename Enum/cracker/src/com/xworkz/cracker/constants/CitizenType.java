package com.xworkz.cracker.constants;

public enum CitizenType {
GLOBAL(18,50,"Pooja"),SINGLE(17,55,"Shilpa"),OVERSEAS(13,60,"Harshi");
private Integer lowerAgeLimit;
private Integer upperAgeLimit;
private String name;
private CitizenType(Integer lowerAgeLimit, Integer upperAgeLimit, String name) {
	this.lowerAgeLimit=lowerAgeLimit;
	this.upperAgeLimit= upperAgeLimit;
	this.name=name;
	
}
public Integer getLowerAgeLimit() {
	return lowerAgeLimit;
}
public Integer getUpperAgeLimit() {
	return upperAgeLimit;
}
public String getName() {
	return name;
}
public void setLowerAgeLimit(Integer lowerAgeLimit) {
	this.lowerAgeLimit=lowerAgeLimit;

}
public void setUpperAgeLimit(Integer UpperAgeLimit) {
	this.upperAgeLimit=upperAgeLimit;

}
public void setName(String name) {
	this.name=name;
}
}

