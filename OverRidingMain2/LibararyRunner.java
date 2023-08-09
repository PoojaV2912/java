package OverRidingMain2;

import OverRiding2.Slient;

public class LibararyRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in Libraryrunner");

				Library library = new Library();
				library.book();
				System.out.println("-----------------------------");
				Library book = new Slient();
				slient.book();

			}
			}
