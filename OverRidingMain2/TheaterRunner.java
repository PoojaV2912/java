package OverRidingMain2;

import OverRiding2.PictureTheater;
import OverRiding2.Theater;

public class TheaterRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in PictureTheater");
				Theater theater = new PictureTheater();
				theater.display();
				System.out.println("------------------------");
				PictureTheater pictureTheater = new PictureTheater();
				pictureTheater.display();

			}

		}
		
