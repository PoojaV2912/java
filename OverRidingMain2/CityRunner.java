package OverRidingMain2;

import OverRiding2.City;
import OverRiding2.Villages;

public class CityRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in CityRunner");

				City city = new City();
				city.welcome();
				System.out.println("------------------------");
				City city1 = new Villages();
				city1.welcome();
			}

		}
