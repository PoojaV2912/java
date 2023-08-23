package app;

import com.xworkz.Interface.Military;

public class IndianMilitary implements Military {

		@Override
		public String name(String soliderName) {
			System.out.println("invoking name in IndianMilitary");
			return null;
		}

		@Override
		public void age(int age) {
			System.out.println("invoking age in IndianMilitary");

		}
		@Override
		public void weapon(String weaponName) {
			System.out.println("invoking weapon in IndianMilitary");
		}

	
}
