package com.xworkz.Main;

import com.xworkz.Auditor;
import com.xworkz.Company;
import com.xworkz.Movie;
import com.xworkz.Producer;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie=new Movie();
		String ref=movie.name;
		System.out.println(ref);
		Movie ref1=movie.language;
		System.out.println(ref1);
		Producer producer=movie.producer;
		int ref2=producer.budget;
		System.out.println(ref2);
		Producer ref3=producer.mobileNumber;
		System.out.println(ref3);
		Auditor auditor=producer.auditor;
		long ref4=auditor.adharNumber;
		System.out.println(ref4);
		Company company=auditor.company;
		String ref5=company.name;
		System.out.println(ref5);
		Company ref6=company.location;
		System.out.println(ref6);
		
		}

}


