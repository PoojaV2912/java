package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class River {
	public static void main(String[] args) {
		
	Collection<String> river = new ArrayList();
	river.add("hemavathi");
	river.add("ganga");
	river.add("kaveri");
	river.add("thunga");
	river.add("yamuna");
System.out.println("Total elements:" +river.size());
Iterator<String> itr=river.iterator();
while(itr.hasNext())       //hasNext will check whether the next element is present or not
{
	String value=itr.next();   //access all the element
	System.out.println("River is:" +value);
}


System.out.println("--------------------addall----------------");
river.addAll(river);
Iterator<String> itr1=river.iterator();
while(itr1.hasNext()) 
{
	String value =itr1.next();
	System.out.println("River is: "+value);
}


System.out.println("---------------remove----------------------");
river.remove("ganga");
Iterator<String> itr2=river.iterator();
while(itr2.hasNext())
{
	String value =itr2.next();
	System.out.println("River is:"+value);
}


System.out.println("----------------contains------------------");
boolean ref = river.contains("yamuna");
river.contains("river");
Iterator<String> itr3=river.iterator();
System.out.println(ref);


System.out.println("------------------containsall----------------");
river.containsAll(river);
Iterator<String> itr4=river.iterator();
while(itr4.hasNext())
{
	String value =itr4.next();
	System.out.println("River is:"+value);
}


System.out.println("---------------removeall---------------");
river.removeAll(river);
Iterator<String> itr5=river.iterator();
while(itr5.hasNext())
{
	String value =itr5.next();
	System.out.println("River is:"+value);
}


System.out.println("----------------clear---------------");
river.clear();
Iterator<String> itr6=river.iterator();
while(itr6.hasNext())
{
	String value =itr6.next();
	System.out.println("River is:"+value);
}


System.out.println("---------------empty----------------");
river.isEmpty();
Iterator<String> itr7=river.iterator();
while(itr7.hasNext())
{
	String value =itr7.next();
	System.out.println("River is:"+value);
}
}
}
