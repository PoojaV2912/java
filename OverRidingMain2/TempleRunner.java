package OverRidingMain2;

import OverRiding2.Hanuman;
import OverRiding2.Temple;

public class TempleRunner {

	public static void main(String[] args) {
	
			System.out.println("invoking main in TempleRunner");

			Temple temple = new Hanuman();
			temple.hope();
			System.out.println("----------------------------");
			Hanuman shivaTemple = new Hanuman();
			shivaTemple.hope();
		}

	}