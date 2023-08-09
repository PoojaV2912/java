package OverRiding2;

	public class Villages extends City {
		@Override
		public void welcome() {
			System.out.println("invoking with no argument in Villages");
		}
		@Override
			public void welcome(String name) {
			System.out.println("invoking with String argument in Villages");

			}
		@Override
			public void welcome(String name, String country, int population) {
			System.out.println("invoking with String string int argument in Villages");

			}
		}


