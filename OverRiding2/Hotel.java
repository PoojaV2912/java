package OverRiding2;

public class Hotel {

		public void restorant() {
			System.out.println("Invoking with no argument method in Hotel");
		}
		public void restorant(String location) {
			System.out.println("Invoking with String argument method in Hotel");
		}
		public void restorant(String location,String name) {
			System.out.println("Invoking with String String argument method in Hotel");
		}
		public void restorant(String location,String name,int noOFItems ) {
			System.out.println("Invoking with String String int argument method in Hotel");
		}
		public void restorant(String location,int noOFItems ) {
			System.out.println("Invoking with String  int argument method in Hotel");
		}
		public void restorant(int noOFItems ) {
			System.out.println("Invoking with  int argument method in Hotel");
		}
		}

