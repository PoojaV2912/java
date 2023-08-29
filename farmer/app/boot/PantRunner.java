package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Pant;
import com.xworkz.farmer.app.Zip;

public class PantRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main PantRunner");
				Pant pant = new Pant(10);
				Zip zip = new Zip();
				pant.setZip(zip);
				pant.color();

			}

		}
