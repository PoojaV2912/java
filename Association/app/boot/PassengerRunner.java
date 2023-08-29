package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Bus;

public class PassengerRunner {
		public static void main(String[] args) {
			System.out.println("Invoking main in PassengerRunner");
			Passenger passenger = new Passenger(20);
			Bus bus = new Bus();
			passenger.setBus(bus);
			passenger.busNo();
		}

	}