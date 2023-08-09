package OverRidingMain2;

import OverRiding2.Street;
import OverRiding2.StreetFood;

public class StreetRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in StreetRunner");

				Street street = new Street();
				street.addLandMark();
				System.out.println("------------------------------------");
				Street street1 = new StreetFood();
				street1.addLandMark();
			}
			}
		