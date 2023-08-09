package OverRidingMain2;

import com.xworkz.Hotel;

import OverRiding2.SaiHotel;

public class HotelRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in Hotel Runner");
				Hotel hotel=new Hotel();
				hotel.restorant();
				hotel.restorant("Mysore");
				hotel.restorant("Hassan", 6);
				Hotel hotel1=new SaiHotel();
				hotel1.restorant();
				hotel1.restorant("Mangalore");
				hotel1.restorant(5);
				hotel1.restorant("Banglore", "5*");
			}

		}
	