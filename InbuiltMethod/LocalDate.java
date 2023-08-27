package com.xworkz.InbuiltMethod;

public class LocalDate {
	public static void main(String[] args) {
		System.out.println("Invoking main in LocalDate");
		LocalDate localDate = new LocalDate();
		System.out.println(localDate.equals(localDate));
		System.out.println(localDate.getClass());
		System.out.println(localDate.hashCode());
		System.out.println(localDate.toString());
		
	}


}


