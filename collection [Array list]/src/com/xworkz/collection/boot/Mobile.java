package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mobile {

	public static void main(String[] args) {
		Collection<Long> mobile =new ArrayList();
		mobile.add(9077899093L);
		mobile.add(9681596642L);
		mobile.add(9258900971L);
		mobile.add(9876543210L);
		mobile.add(9877858210L);
		mobile.add(9848569210L);
		mobile.add(9815343210L);
		mobile.add(9872543210L);
		mobile.add(9875943210L);
		mobile.add(9876543245L);
		mobile.add(9876543256L);
		mobile.add(9876543215L);
		mobile.add(9876543100L);
		mobile.add(9876543225L);
		mobile.add(9876543888L);
		mobile.add(9876543999L);
		mobile.add(9876543268L);
		mobile.add(9876543278L);
		mobile.add(9876543210L);
		mobile.add(8576543211L);
		mobile.add(7654873210L);
		mobile.add(8657654321L);
		mobile.add(9876545840L);
		mobile.add(9876123210L);
		mobile.add(9874523210L);
		mobile.add(9876143210L);
		mobile.add(9876543245L);
		mobile.add(9876543205L);
		mobile.add(9876543213L);
		mobile.add(9876543217L);
		
		System.out.println("Total mobile number:"+mobile.size());
		Iterator<Long> iter = mobile.iterator();
		while(iter.hasNext()) {
			Long value =iter.next();
			System.out.println("Mobile :" + value);
		}

System.out.println("----------------------------StatesNames----------------------");
		Collection<String> stateName =new ArrayList();
		stateName.add("Andhra Pradesh");
		stateName.add("Arunachal Pradesh");
		stateName.add("Assam ");    
		stateName.add("Bihar ");    
		stateName.add("Chhattisgarh");    
		stateName.add("Goa ");    
		stateName.add("Gujarat ");    
		stateName.add("Haryana ");    
		stateName.add("Himachal Pradesh");    
		stateName.add("Jammu and Kashmir");    
		stateName.add("Jharkhand ");    
		stateName.add("Karnataka ");    
		stateName.add("Kerala ");    
		stateName.add("Madhya Pradesh"); 
		stateName.add("Maharashtra ");    
		stateName.add("Manipur ");    
		stateName.add("Meghalaya ");    
		stateName.add("Mizoram ");    
		stateName.add("Nagaland");    
		stateName.add("Odisha ");    
		stateName.add("Punjab ");    
		stateName.add("Kerala ");    
		stateName.add("Rajasthan "); 
		stateName.add("Sikkim ");    
		stateName.add("Tamil Nadu");    
		stateName.add("Telangana ");    
		stateName.add("Uttar Pradesh ");    
		stateName.add("Uttarakhand ");    
		stateName.add("West Bengal "); 
		System.out.println("Total State :"+stateName.size());
		Iterator<String> iter1=stateName.iterator();
		while(iter1.hasNext()) {
			String value =iter1.next();
			System.out.println("State Name:" +value);
		}
		
		System.out.println("----------------------------citiesNames----------------------");
		Collection<String> cities =new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add("Surat");
		cities.add("Pune");
		cities.add("Jaipur");
		cities.add("Visakhapatnam");
		cities.add("Kanpur");
		cities.add("Nagpur");
		cities.add("Lucknow");
		cities.add("Maduri");
		cities.add("Thane");
		cities.add("Bhopal");
		cities.add("Indore");
		cities.add("Pimpri");
		cities.add("Vadodara");
		cities.add("Mysore");
		cities.add("Agra");
		System.out.println("Total cities :"+cities.size());
		Iterator<String> iter2=cities.iterator();
		while(iter2.hasNext()) {
			String ref =iter2.next();
			System.out.println("cities Name:" +ref);
		}
		
		System.out.println("------------------laptop model names------------------");
		Collection<String> laptop =new ArrayList<String>();
		laptop.add("Hp Pavillion plus 16");
		laptop.add("Dell XPS 13");
		laptop.add("HP Spectre x360");
		laptop.add("Lenovo ThinkPad X1 Carbon");
		laptop.add(" ROG Zephyrus G14");
		laptop.add("Surface Laptop 4");
		laptop.add("Razer Blade 15");
		laptop.add("MSI GS66 Stealth");
		laptop.add("LG Gram 17");
		laptop.add("Huawei MateBook X Pro");
		laptop.add("Lenovo ThinkPad X1 Carbon");
		laptop.add("Google Pixelbook");
		laptop.add("Alienware m15");
		laptop.add("Lenovo Yoga C940");
		laptop.add("ASUS ZenBook 14");
		laptop.add("HP Envy x360");
		laptop.add("Apple MacBook Pro");
		laptop.add("Acer Aspire 5");
		laptop.add("Acer Predator Helios 300");
		laptop.add("MSI GE76 Raider");
		laptop.add("Lenovo Legion 7");
		laptop.add("Dell Inspiron 15");
		laptop.add("Microsoft Surface Go");
		laptop.add("LG UltraFine 5K");
		laptop.add("Lenovo Ideapad 5");
		laptop.add("ASUS TUF Gaming A15");
		laptop.add("Acer Swift 3");
		laptop.add("HP Omen 15");
		laptop.add("Apple MacBook Air");
		laptop.add("Acer Chromebook Spin 13");
		laptop.add("Dell Alienware Area-51m");
		laptop.add("ASUS VivoBook S15");
		laptop.add("MSI Prestige 14");
		laptop.add("Razer Blade Pro 17");
		laptop.add("Microsoft Surface Pro 7");
		laptop.add("Predator Triton 500");
		laptop.add("HP Pavilion x360");
		laptop.add("SUS ROG Strix G15");
		laptop.add("LG Gram 14");
		laptop.add("Alienware m17 R4");
		laptop.add("Dell Latitude 9410");
		laptop.add("Lenovo ThinkPad X1 Yoga");
		laptop.add("MSI Creator 15");
		laptop.add("ASUS ZenBook Pro Duo");
		laptop.add("HP EliteBook 840");
		laptop.add("Acer Nitro 5");
		laptop.add("Lenovo Flex 5");
		laptop.add("ASUS VivoBook Flip 14");
		laptop.add("Acer ConceptD 7");
		laptop.add("Apple MacBook");
		laptop.add("Lenovo Yoga 9i");

         System.out.println("Total Model: " + laptop.size());
		Iterator<String> itr3 = laptop.iterator();
		while (itr3.hasNext()) {
			String value = itr3.next();
			System.out.println("laptopName is :" + value);

		}

	}

}
		
		   
		   
		
		
		