package OverRiding2;


	public class Slient extends Library {
		@Override
		public void books() {
			System.out.println("invoking books method in Books");
			
		}

		@Override
		public void books(String name) {
			System.out.println("invoking books method of String in Books");
			books(name);
		}

		@Override
		public void books(String name, int capacity) {
			System.out.println("invoking books method of String,int in Books");
			books(name, capacity);
		}

		@Override
		public void books(String name, int capacity, String location) {
			System.out.println("invoking books method of String,int,Strign in Books");
			books(name, capacity, location);
		}

		@Override
		public void books(String name, int capacity, String location, String librarian) {
			System.out.println("invoking books method of String,int,String,String in Books");
			books(name, capacity, location, librarian);
		}

		@Override
		public void books(String name, int capacity, String location, String librarian, int openHours) {
			System.out.println("invoking books method of String,int,Strign,String,int in Books");
		}
	}


