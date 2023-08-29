package com.xworkz.farmer.app;

public class Passanger {

		private int seatNo;
		private Bus bus;

		public void Passenger(int seatNo) {
			this.seatNo = seatNo;
		}

		public void setBus(Bus bus) {
			this.bus = bus;
		}

		public void busNo() {
			System.out.println("Invoking busNo in Passenger");
			this.bus.color();
		}

	}

