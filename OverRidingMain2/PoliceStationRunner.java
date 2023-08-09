package OverRidingMain2;

import OverRiding2.Police;
import OverRiding2.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in PoliceStationRunner");

				PoliceStation policeStation = new PoliceStation();
				policeStation.arrest();
				System.out.println("----------------------------");

				PoliceStation policeStation1 = new Police();
				policeStation1.arrest();
			}

		}
	