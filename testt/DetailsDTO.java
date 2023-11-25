package com.xworkz.details.servlet;

public class DetailsDTO {
	private String  siNo;
	private String name;
	private String lName;
	private String mName;
	private String email;
	private String gender;
	private String contactNo;
	private String area;
	private String districtDropDown;
	private String stateDropDown;
	private String pincode;
	public DetailsDTO(String siNo, String name, String lName, String mName, String email, String gender,
			String contactNo, String area, String districtDropDown, String stateDropDown, String pincode) {
		super();
		this.siNo = siNo;
		this.name = name;
		this.lName = lName;
		this.mName = mName;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
		this.area = area;
		this.districtDropDown = districtDropDown;
		this.stateDropDown = stateDropDown;
		this.pincode = pincode;
	}
	public String getSiNo() {
		return siNo;
	}
	public void setSiNo(String siNo) {
		this.siNo = siNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrictDropDown() {
		return districtDropDown;
	}
	public void setDistrictDropDown(String districtDropDown) {
		this.districtDropDown = districtDropDown;
	}
	public String getStateDropDown() {
		return stateDropDown;
	}
	public void setStateDropDown(String stateDropDown) {
		this.stateDropDown = stateDropDown;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "DetailsDTO [siNo=" + siNo + ", name=" + name + ", lName=" + lName + ", mName=" + mName + ", email="
				+ email + ", gender=" + gender + ", contactNo=" + contactNo + ", area=" + area + ", districtDropDown="
				+ districtDropDown + ", stateDropDown=" + stateDropDown + ", pincode=" + pincode + "]";
	}

}
