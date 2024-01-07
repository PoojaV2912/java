package com.xworkz.constructor.boot;

public class StringRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StringRunner");
String ref="pooja";
String reverse="";
for(int index=0;index<ref.length();index++)
{
	 reverse=ref.charAt(index)+reverse;
	 System.out.println(reverse);

}

System.out.println(ref.charAt(4));
System.out.println(ref.charAt(2));

System.out.println(ref.codePointAt(2));
System.out.println(ref.charAt(4));
System.out.println(ref.codePointAt(2));
System.out.println(ref.codePointCount(1,5));
System.out.println(ref.compareTo(ref));
	}

}
