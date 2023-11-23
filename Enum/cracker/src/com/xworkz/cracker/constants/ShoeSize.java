package com.xworkz.cracker.constants;

public enum ShoeSize {
	SMALL(39),MEADIUM(42),LARGE(45);
	private int length;
	ShoeSize(int length){
		
	}
	public int getLength() {
		return length;
		
	}
	public void setLength(int length) {
		this.length=length;
	}

}
