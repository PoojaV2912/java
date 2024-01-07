package com.xworkz.constructor.boot;

import com.xworkz.constructor.app.Carrom;

public class ConstructorRunner {

	public static void main(String[] args) {
		System.out.println("invoking main CarromRunner");
Carrom carrom=new Carrom();
System.out.println("-------------");
Carrom carrom1=new Carrom("carromBoard");
System.out.println("--------------------");
Carrom carrom2=new Carrom("carromBoard","Red");
System.out.println(carrom1.toString());
	}

}
