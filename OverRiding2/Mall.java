package OverRiding2;

public class Mall {

		public void mallInfo() {
			System.out.println("Invoking with no argument method in Mall");
		}
		public void mallInfo (String name) {
			System.out.println("Invoking with String argument method in Mall ");
		}
		public void mallInfo(String name,String location) {
			System.out.println("Invoking with String String argument method in Mall ");
		}
		public void mallInfo(String name,String location,int noOfCustomer) {
			System.out.println("Invoking with String String int argument method in Mall ");
		}
		public void mallInfo(int noOfCustomer) {
			System.out.println("Invoking with  int argument method in Mall ");
		}
		public void mallInfo(String location,int noOfCustomer) {
			System.out.println("Invoking with String int argument method in Mall ");
		}
		}

