package OverRiding2;

public class Temple {
	
		public void hope() {
			System.out.println("invoking hope method in Temple");
		}

		public void hope(String name) {
			System.out.println("invoking hope method of String in Temple");
		}

		public void hope(String name, String location) {
			System.out.println("invoking hope method of String,String in Temple");
		}

		public void hope(String name, String location, String deity) {
			System.out.println("invoking hope method of String,String,String in Temple");
		}

		public void hope(String name, String location, String deity, int capacity) {
			System.out.println("invoking hope method of String,String,String,int in Temple");
		}

		public void hope(String name, String location, String deity, int capacity, boolean Powerful) {
			System.out.println("invoking hope method of String,String,String,int,boolean in Temple");
		}
	}

