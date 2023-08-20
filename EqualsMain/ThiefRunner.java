package EqualsMain;

import Equals.Thief;

public class ThiefRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Thief runner");
		Thief thief = new Thief("anupama", "rajaji nagar", 22, "Glod", "NightTimethief", "police");
		Thief thief2 = new Thief("anupama", "rajaji nagar", 22, "Glod", "NightTimethief", "police");
boolean ref=thief.equals(thief2);
	

	}

}
