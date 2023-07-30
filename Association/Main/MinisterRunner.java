package com.xworkz.Main;

import com.xworkz.Constituency;
import com.xworkz.Indiracanteen;
import com.xworkz.Minister;

public class MinisterRunner {

	public static void main(String[] args) { 
		System.out.println("Invoking main in mainRunner");
		Minister minister=new Minister();
		String ref=minister.name;
		System.out.println(ref);
		Minister ref2=minister.experience;
		System.out.println(ref2);
		Constituency constituency=minister.constituency;
		int ref3=constituency.number;
		System.out.println(ref3);
		Constituency ref4=constituency.population;
		System.out.println(ref4);
		Indiracanteen indiracanteen=constituency.indiracanteen;
		int ref5=indiracanteen.breakFastPrice;
		System.out.println(ref5);
		Indiracanteen ref6= indiracanteen.lunchPricecanteen;
		System.out.println(ref6);
		}

}
