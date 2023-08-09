package OverRiding2;


	public class Party extends Pub{
		@Override
		public void enjoy() {
			System.out.println("invoking enjoy method in Party");
			enjoy(name);
		}

		@Override
		public void enjoy(String name) {
			System.out.println("invoking enjoy method of String in Party");
			enjoy(name, location);
		}

		@Override
		public void enjoy(String name, String location) {
			System.out.println("invoking enjoy method of String,String in Party");
			enjoy(name, location, capacity);
		}

		@Override
		public void enjoy(String name, String location, int capacity) {
			System.out.println("invoking enjoy method of String,String,int in Party");
			enjoy(name, location, capacity, servesFood);
		}

		@Override
		public void enjoy(String name, String location, int capacity, boolean servesFood) {
			System.out.println("invoking enjoy method of String,String,int,boolean in Party");
			enjoy(name, location, capacity, servesFood, pubType);
		}
	}


