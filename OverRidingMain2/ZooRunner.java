package OverRidingMain2;

import OverRiding2.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in ZooRunner");

				Zoo zoo = new Zoo();
				zoo.buyTicket();
				System.out.println("---------------------");
				Zoo zoo1 = new Zoo();
				zoo1.buyTicket();

			}

		}
	