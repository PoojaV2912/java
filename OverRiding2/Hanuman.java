package OverRiding2;


	public class Hanuman extends Temple{
		@Override
		public void hope() {
			System.out.println("invoking hope method in Hanuman");
		}

		@Override
		public void hope(String name) {
			System.out.println("invoking hope method of String in Hanuman");
			hope(name);
		}

		@Override
		public void hope(String name, String location) {
			System.out.println("invoking hope method of String,String in Hanuman");
			hope(name, location);
		}

		@Override
		public void hope(String name, String location, String deity) {
			System.out.println("invoking hope method of String,String,String in Hanuman");
			hope(name, location, deity);
		}

		@Override
		public void hope(String name, String location, String deity, int capacity) {
			System.out.println("invoking hope method of String,String,String,int in Hanuman");
			hope(name, location, deity, capacity);
		}

		@Override
		public void hope(String name, String location, String deity, int capacity, boolean Powerful) {
			System.out.println("invoking hope method of String,String,String,int,boolean in Hanuman");
		}
	}


