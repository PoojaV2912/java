package com.xworkz.cracker.constants;

public enum MovieTicket {
BALCONY(300D,"654AB", 20D),GOLD_CLASS(250D,"430G01",15D),FIRST_CLASS(400D,"630FI",15D),EXECUTIVE(500D,"76WES",7D);
	private Double price;
	private String gstNo;
	private Double discount;
	private MovieTicket(Double price, String gstNo, Double discount) {
		this.price=price;
		this.gstNo=gstNo;
		this.discount=discount;
	}
	public Double getPrice() {
		return price;
	}
	public String getGstNo() {
		return gstNo;
	}
	public Double getDiscount() {
		return price;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	public void setGstNo(String gstNo) {
		this.price=price;
	}
		public void setDiscount(Double discount) {
			this.price=price;
		}
	}

