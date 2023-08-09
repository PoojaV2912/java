package OverRiding2;

public class Libarary {
	
		public void books() {
			System.out.println("invoking  books method in Library");
		}

		public void  books(String name) {
			System.out.println("invoking  books method of String in Library");
		}

		public void  books(String name, int capacity) {
			System.out.println("invoking  books method of String,int in Library");
		}

		public void  books(String name, int capacity, String location) {
			System.out.println("invoking  books method of String,int,Strign in Library");
		}

		public void  books(String name, int capacity, String location, String librarian) {
			System.out.println("invoking  books method of String,int,Strign,String in Library");
		}

		public void  books(String name, int capacity, String location, String librarian, int openHours) {
			System.out.println("invoking  books method of String,int,Strign,String,int in Library");
		}

	}


