package app;

import com.xworkz.Interface.TempleRule;

public class Temple implements TempleRule {

		@Override
		public void dress(String name) {
			System.out.println("invoking String in dress");
		}

		@Override
		public boolean photo() {
			System.out.println("invoking boolean in photo");
			return false;
		}

		@Override
		public String silence(String  maintaince) {
			System.out.println("invoking string in maintaince");
			return null;
		}

	}

