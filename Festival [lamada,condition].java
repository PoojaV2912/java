package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Festival {

	public static void main(String[] args) {
		Collection<String> festival = new ArrayList<String>();
		festival.add("Depavali");
		festival.add("Makar Sankranti");
		festival.add("Shivrathri");
		festival.add("Ram Navami");
		festival.add("Onam");
		festival.add("Dasara ");
		festival.add("Ramzan ");
		festival.add("Chrismas");
		festival.add("Ganesha");
		festival.add("Karga Festival");
		festival.add("Ugadi");
		festival.add("Holi");
		festival.add("Naraka Chaturdashi");
		festival.add("Hampi Utsava");
		festival.add("Hanuma Jayanti");

		System.out.println("total number of festival:" + festival.size());
		System.out.println("----------------------------------");
		System.out.println("Festivals with more than 6 character:");
		festival.stream().filter(fest->fest.length()>6).forEach(fest-> System.out.println(fest));
		System.out.println("-------------------------------------");
		festival.stream().filter(fest->fest.length()<6).forEach(fest-> System.out.println(fest));
		System.out.println("--------------------------------------");
		festival.stream().filter(fest->fest.contains("O")|| fest.contains("o")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest->!fest.contains("g")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-------------------------------------------");
		festival.stream().filter(fest->fest.endsWith("S")|| fest.endsWith("s")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest->fest.contains("Z")|| fest.contains("R")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest-> fest.contains("Ram")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
			
	}
}