package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main hotelRunner");
		HotelDTO hotelDTO1=new HotelDTO(1, "Oberoi Hotels", "Surjan", "DR44ANPV1974D6", "India");
		HotelDTO hotelDTO2=new HotelDTO(2, "Trident Hotels", "Vikas", "DR44XPJ8631R1ZF", "India");
		HotelDTO hotelDTO3=new HotelDTO(3, "Leela Palace", "Salman", "O7AAACT3957G7Z3", "India");
		HotelDTO hotelDTO4=new HotelDTO(4, "Grand view", "Meghana", "75JHGCO0728N1ZH", "Srilanka");
		HotelDTO hotelDTO5=new HotelDTO(5, "Galadari", "Thilak", "45AATFG6429L1ZU", "Srilanka");
		HotelDTO hotelDTO6=new HotelDTO(6, "Radisson Hotel Colombo", "Manvith", "7ABFFR3324Q1ZS", "Srilanka");
		HotelDTO hotelDTO7=new HotelDTO(7, "The Wall Street", "Mohith", "O7AALPI2237G1ZV", "USA");
		HotelDTO hotelDTO8=new HotelDTO(8, "Hollywood Restorents", "Anirudhu", "O7AAL2237G1ZV", "USA");
		HotelDTO hotelDTO9=new HotelDTO(9, "Carlton", "Dellip", "06AAHCC8225B1Z0", "UK");
		HotelDTO hotelDTO10=new HotelDTO(10, "Grand Hotel Scarborough", "Sagar", "33AAHFGO438R1Z5", "UK");

		Collection<HotelDTO> hotelDTOts=new ArrayList<HotelDTO>();
		hotelDTOts.add(hotelDTO1);
		hotelDTOts.add(hotelDTO2);
		hotelDTOts.add(hotelDTO3);
		hotelDTOts.add(hotelDTO4);
		hotelDTOts.add(hotelDTO5);
		hotelDTOts.add(hotelDTO6);
		hotelDTOts.add(hotelDTO7);
		hotelDTOts.add(hotelDTO8);
		hotelDTOts.add(hotelDTO9);
		hotelDTOts.add(hotelDTO10);
		System.out.println("Total number of hotels:"+hotelDTOts.size());
		System.out.println("------------Find all hotels in India---------------------");
		hotelDTOts.stream().filter(hot->hot.getLocation().equals("India")).map(hot->hot.getHotelName()).forEach(hot->System.out.println(hot));
		System.out.println("------------Finad all hotels in srilanka----------------");
		hotelDTOts.stream().filter(hot->hot.getLocation().equals("Srilanka")).map(hot->hot.getHotelName()).forEach(hot->System.out.println(hot));
		System.out.println("------------get only owners name-----------------");
		Collection<String> ownersName=new LinkedList<String>();
		hotelDTOts.stream().map(hot->hot.getOwnerName()).forEach(hot->System.out.println(hot));
		
		System.out.println("------get only gst no------------------");
		hotelDTOts.stream().map(hot->hot.getGst()).forEach(hot->System.out.println(hot));
		
		System.out.println("--------------get only id if location is uk--------------");
		hotelDTOts.stream().filter(hot->hot.getLocation().equals("UK")).map(hot->hot.getId()).forEach(hot->System.out.println(hot));
		System.out.println("-------------get only owner name if location is usa----------------");
		hotelDTOts.stream().filter(hot->hot.getLocation().equals("USA")).map(hot->hot.getOwnerName()).forEach(hot->System.out.println(hot));

		



		

		
		
}
}
	
