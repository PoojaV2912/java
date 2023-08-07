package Main;

import Overloading.Plier;

public class PlierRunner {

	public static void main(String[] args) {
		Plier plier=new Plier();
		plier.cutter(50);
		plier.cutter("Cutwire", 100,45);
	}

}
		